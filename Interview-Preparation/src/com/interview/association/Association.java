package com.interview.association;

class Bank{
	private String bankName;

	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
}

class Employee{
	private String employeName;

	public String getEmployeName() {
		return employeName;
	}
	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}
}

public class Association {
	public static void main(String[] args) {
	Bank bank = new Bank();
	bank.setBankName("HDFC");
	
	Employee employee =new Employee();
	employee.setEmployeName("Sunny");
	
	System.out.println(employee.getEmployeName() +" is a employee of "+ bank.getBankName());//Sunny is a employee of HDFC

	}

}
