package com.interview.preparation.beans;

import java.math.BigDecimal;

public class Invoice {

	private BigDecimal quantity;
	private BigDecimal amount;

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
