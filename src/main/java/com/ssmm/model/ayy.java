package com.ssmm.model;

import java.util.ArrayList;
import java.util.HashSet;

public class ayy {
	
	static Book book; 
	static Teacher teacher;
	
	public static void main(String[] args) {
		 ArrayList<Object> arrayList = new ArrayList<Object>();
		 String[] s1 = {};
		 String[] s2 = {};
		 arrayList.add(null);
		 arrayList.add(null);
		 arrayList.add(s1);
		 arrayList.add(s2);
		 arrayList.add(new Integer[] { 1, 2, 3 });
		 arrayList.add(new Integer[] { 1, 2, 3 });
		System.out.println(arrayList);
		removeDuplicate(arrayList);
		System.out.println(arrayList);
	}
	
	 
	
	
	
	public static void removeDuplicate(ArrayList arlList)
	  {
	   HashSet h = new HashSet(arlList);
	   arlList.clear();
	   arlList.addAll(h);
	  }

}
