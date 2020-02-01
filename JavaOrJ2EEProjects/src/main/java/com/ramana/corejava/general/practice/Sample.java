/**
 * 
 */
package com.ramana.corejava.general.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author RamanaGorle
 *
 */
public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Long> arr = new ArrayList<>();
		arr.add(1L);
		arr.add(3L);
		arr.add(9L);
		arr.add(9L);
		arr.add(27L);
		arr.add(81L);
		
		System.out.println(countTriplets(arr, 3L));
	}
	 static long countTriplets(List<Long> arr, long r) {
	        long count = 0;
	        Collections.sort(arr);
	        Map<Long, Integer> map = new TreeMap<>();
	        for(int i=0;i<arr.size();i++){
	            if(!map.containsKey(arr.get(i)))
	                map.put(arr.get(i),1);
	            else {
	                int v = map.get(arr.get(i));
	                map.put(arr.get(i), v+1);
	            }
	        }

	        Long first = -1L;
	        for(Map.Entry<Long, Integer> entry: map.entrySet()){
	            if(first==-1)
	                first = entry.getKey();
	            Long second = first * r;
	            Long third = second * r;

	            if(map.containsKey(second) && map.containsKey(third)){
	                int firstV = map.get(first);
	                int secondV = map.get(second);
	                int thirdV = map.get(third);

	                if(firstV>1)
	                    count = count + firstV;
	                if(secondV>1)
	                    count = count + secondV;
	                if(thirdV>1)
	                    count = count + thirdV;
	                if (firstV==secondV && secondV==thirdV && thirdV==1)
	                    count = count + 1;
	                first = -1L;
	            }

	        }

	        return count;
	    }
	
}
