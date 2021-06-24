package com.logical.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

class Demo {
	public String toString() {
		return "demo";
	}
	public void finalize() {
		System.out.println("Finalize method is called"); //Finalize method is called for WeakHashMap
	}
}

public class WeakHashMapExmp {
	public static void main(String[] args) throws Exception {
		//Using Hash Map
		Map<Demo, String> m = new HashMap<>();
		Demo d = new Demo();
		m.put(d, "Hello");
		System.out.println(m); //{demo=Hello} 
		d = null;
		// garbage collector is called
		System.gc();
		Thread.sleep(4000);
		System.out.println(m); //{demo=Hello}
		
		//Using Weak Hash Map
		Map<Demo, String> wm = new WeakHashMap<>();
		Demo d1 = new Demo();
		wm.put(d1, "Hello");
		System.out.println(m); //{demo=Hello} 
		d1 = null;
		// garbage collector is called
		System.gc();
		Thread.sleep(4000);
		System.out.println(m); //{demo=Hello}
	}

}
