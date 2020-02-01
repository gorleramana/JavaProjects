/**
 * Test singleton objects
 */
package com.ramana.corejava.general.practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author RamanaGorle
 *
 */
//This is for serialization
//class Singleton implements Serializable {
//
//	private static Singleton soleInstance = new Singleton();
//
//	/**
//	 * This class is to test singleton objects
//	 */
//	private Singleton() {
//		System.out.println("Creating singleton..");
//	}
//
//	public static Singleton getInstance() {
//		return soleInstance;
//	}
//
//	//Fix for de-serialization violation
//		private Object readResolve() throws ObjectStreamException {
//			System.out.println("..read resolve()..");
//			return soleInstance;
//		}
//}
//This is for cloning
class Singleton implements Cloneable {

	//private static Singleton soleInstance = new Singleton();//Early loading
	private static Singleton soleInstance = null;//Lazy loading
	/**
	 * This class is to test singleton objects
	 */
	private Singleton() {
		System.out.println("Creating singleton..");
	}
//Fix for multi threading
	public static synchronized Singleton getInstance() {
		if(null == soleInstance){
			soleInstance = new Singleton();
		}
		return soleInstance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
//This is for multi-threaded 
//class Singleton {
//
//	private static Singleton soleInstance = null;
//
//	/**
//	 * This class is to test singleton objects
//	 */
//	private Singleton() {
//		if(soleInstance != null){
//			//Fix for Reflection violation
//			throw new RuntimeException("Can't create, please use getInstance()");
//		}
//		System.out.println("Creating singleton..");
//	}
//
//	public static Singleton getInstance() {
//		if(null == soleInstance){
//			soleInstance = new Singleton();
//		}
//		return soleInstance;
//	}
//}
public class TestSingletons {
	public static void main(String args[]) {
		// Working scenario
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		print("s1", s1);
		print("s2", s2);

		System.out.println("Violating with Reflection: ...");
		Singleton s3 = null;
		try {
			Class clazz = Class.forName("corejava.ranjith.Singleton");
			try {
				@SuppressWarnings("unchecked")
				Constructor<Singleton> ctor = clazz.getDeclaredConstructor();
				ctor.setAccessible(true);
				try {
					s3 = ctor.newInstance();
				} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
					e.printStackTrace();
				}
			} catch (NoSuchMethodException | SecurityException e) {
				e.printStackTrace();// java 1.7 style
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		print("s3", s3);

//		System.out.println("Violating with Serialization: ..");
//		Singleton s4 = null;
//		try {
//			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/tmp/s2.ser"));
//			try {
//				oos.writeObject(s2);
//			} catch (NotSerializableException e) {
//				e.printStackTrace();
//			}
//
//			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/tmp/s2.ser"));
//			try {
//				s4 = (Singleton) ois.readObject();
//			} catch (ClassNotFoundException e) {
//				e.printStackTrace();
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		print("s4", s4);
		
		System.out.println("Violating with Cloning: ..");
//		Singleton s5 = null;
//		try {
//			s5 = (Singleton) s2.clone();
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//		}
//		print("s5", s5);
		
		System.out.println("Violating with Multi-Threads:..");
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		//Run this multiple times, sometimes we get fair results and sometimes we will get different hash codes. 
		executorService.submit(TestSingletons::useSingleton);//java8 lambda and method references 
		executorService.submit(TestSingletons::useSingleton);
		
		executorService.shutdown();
	}
	
	/**
	 * This is for multi threaded example
	 */
	static void useSingleton(){
		Singleton singleton = Singleton.getInstance();
		print("s6", singleton);
	}

	private static void print(String s, Singleton s1) {
		System.out.println(String.format("Object: %s, Hashcode: %d", s, s1.hashCode()));
	}
}
