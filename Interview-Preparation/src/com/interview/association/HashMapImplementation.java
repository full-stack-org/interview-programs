package com.interview.association;

class Entry<K, V> {
	K key;
	V value;
	Entry<K,V> next;
	
	public Entry(K key, V value,Entry<K,V> next) {
		this.key=key;
		this.value=value;
		this.next= next;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public Entry<K, V> getNext() {
		return next;
	}

	public void setNext(Entry<K, V> next) {
		this.next = next;
	}
	
}

public class HashMapImplementation {

	public static void main(String[] args) {

	}

}
