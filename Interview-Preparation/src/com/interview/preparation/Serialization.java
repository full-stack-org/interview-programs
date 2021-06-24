package com.interview.preparation;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

class Demo implements java.io.Serializable {
	private static final long serialVersionUID = 6157621820285930845L;
	public int a;
	public String b;

	// Default constructor
	public Demo(int a, String b) {
		this.a = a;
		this.b = b;
	}
}

public class Serialization {

	public static void main(String[] args) throws Exception {
		// Saving of object in a file
		FileInputStream file = new FileInputStream("abc.txt");
		ObjectInputStream in = new ObjectInputStream(file);

		// Method for deserialization of object
        Demo object1 = (Demo)in.readObject();
        
        System.out.println(object1.getClass());
          
		in.close();
		file.close();
	}

}
