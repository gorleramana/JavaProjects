/**
 * 
 */
package com.ramana.corejava.general.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author RamanaGorle
 *
 */
public class ListofLists {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> mainList = new ArrayList<>();
        for(int i=0;i<n;i++){
            int d = sc.nextInt();
            List<Integer> dList = new ArrayList<>();
            for(int j=0;j<d;j++){
                dList.add(sc.nextInt());
            }
            mainList.add(dList);
        }
        int q = sc.nextInt();
        for(int k=0;k<q;k++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(mainList.get(x) != null){
                if(mainList.get(x).get(y) != null){
                    System.out.println( mainList.get(x).get(y));
                } else {
                    System.out.println("ERROR!");
                }
            }
        }
        sc.close();
	}

}
