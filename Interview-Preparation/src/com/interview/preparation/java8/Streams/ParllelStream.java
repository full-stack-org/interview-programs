package com.interview.preparation.java8.Streams;

import java.util.stream.IntStream;

public class ParllelStream {

	public static void main(String[] args) {
		System.out.println("Normal...");

		IntStream range = IntStream.rangeClosed(1, 2);
		System.out.println(range.isParallel()); //true
		range.forEach(x -> System.out.println("Thread : " + Thread.currentThread().getName() + ", value: " + x));
        //Thread : main, value: 1 Thread : main, value: 2
		
		System.out.println("Parallel...");

		IntStream range2 = IntStream.rangeClosed(1, 2);
		IntStream range2Parallel = range2.parallel();
		System.out.println(range2Parallel.isParallel());  //true
		range2.parallel()
				.forEach(x -> System.out.println("Thread : " + Thread.currentThread().getName() + ", value: " + x));
		//Thread : main, value: 2 Thread : ForkJoinPool.commonPool-worker-3, value: 1
	}

}
