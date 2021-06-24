package com.datastructure.examples;

import java.util.Arrays;

public class CustomArrayList {

	private Object[] store;
	private int currentSize = 0;

	public CustomArrayList() {
		store = new Object[10];
	}

	public void add(Object input) {
		if (store.length - currentSize < 5) {
			store = Arrays.copyOf(store, store.length * 2);
		} else {
			store[currentSize++] = input;
		}
	}

	public Object get(int index) {
		Object data = null;
		if (index < currentSize) {
			data = store[index];
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
		return data;
	}

	public Object remove(int index) {
		if (index < currentSize) {
			store[index] = null;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
		return store;
	}

	public int size() {
		return currentSize;
	}

	public static void main(String[] args) {
		CustomArrayList mal = new CustomArrayList();
		mal.add(2);
		mal.add(5);
		for(int i=0;i<mal.size();i++){
            System.out.print(mal.get(i)+" "); //2 5
        }
		
	    System.out.println("Element at Index 1:"+mal.get(1)); //Element at Index 1:5
	    System.out.println("Removing element at index 1: "+mal.remove(1));
	    
	    for(int i=0;i<mal.size();i++){
            System.out.print(mal.get(i)+" "); //2 null
        }

	}

}
