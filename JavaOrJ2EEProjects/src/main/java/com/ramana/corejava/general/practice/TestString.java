package com.ramana.corejava.general.practice;
import java.util.ArrayList;
import java.util.List;

public class TestString {

	public static void main(String args[]){
		String first = "Business.t-mobile.com";
		List<String> list = new ArrayList<String>(); 
		list.add("intuit.com");
		list.add("business.t-mobile.com");
		list.add("qat.t-mobile.com");
		list.add("t-mobile.com");

		for(String second: list){
			if(first.toLowerCase().contains(second.toLowerCase())){
				System.out.println("yes it's a substring.. ");
				break;
			} else {
				System.out.println("It's not substring..");
			}
		}
		
		/*
		int result = first.compareTo(second);
		if(result == 0){
			System.out.println("a"+ result);
			System.out.println("Both are equal strings..");
		} else if(result >0){
			System.out.println("b"+ result);
			if(first.toLowerCase().contains(second.toLowerCase())){
				System.out.println("yes it's a substring.. ");
			} else {
				System.out.println("It's not substring..");
			}
		} else if(result<0){
			System.out.println("c"+ result);
			if(second.toLowerCase().contains(first.toLowerCase())){
				System.out.println("yes it's a substring.. ");
			} else {
				System.out.println("It's not substring..");
			}
		}*/
	}
}
