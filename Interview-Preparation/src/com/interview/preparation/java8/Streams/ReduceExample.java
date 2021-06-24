package com.interview.preparation.java8.Streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.interview.preparation.beans.Invoice;

public class ReduceExample {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println(Arrays.stream(numbers).reduce(0, (a, b) -> a + b));// 55

		// Shortcut
		System.out.println(Arrays.stream(numbers).reduce(0, Integer::sum)); // 55

		List<Invoice> invoicesList = new ArrayList<>();
		
		Invoice invoice = new Invoice();
		invoice.setQuantity(BigDecimal.valueOf(3));
		invoice.setAmount(BigDecimal.valueOf(200));
		invoicesList.add(invoice);
		
		Invoice invoice1 = new Invoice();
		invoice1.setQuantity(BigDecimal.valueOf(2));
		invoice1.setAmount(BigDecimal.valueOf(300));
		invoicesList.add(invoice1);
		
		BigDecimal sum = invoicesList.stream().map(item -> item.getAmount().multiply(item.getQuantity())).reduce(BigDecimal.ZERO,BigDecimal::add);
		System.out.println(sum);//1200

	}

}
