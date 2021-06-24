package com.interview.preparation.exceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModification {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("test");
		
		//Iterator
		  Iterator<String> iterator = list.iterator();
		    while (iterator.hasNext()) {
		        System.out.println(iterator.next());
		    }
		 // for loop
		    for (int i = 0; i < list.size(); i++) {
		        System.out.println(list.get(i));
		    }

		    // for loop advance
		    for (String temp : list) {
		        System.out.println(temp);
		    }

		    // while loop
		    int j = 0;
		    while (j < list.size()) {
		        System.out.println(list.get(j));
		        j++;
		    }
	}

}
