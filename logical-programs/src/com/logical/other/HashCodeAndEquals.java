package com.logical.other;

class Price {
	public String name;
	public int id;

	Price(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		Price price = (Price) obj;
		return (price.name == this.name && price.id == this.id);

	}

	@Override
	public int hashCode() {
		return this.id;
	}
}

public class HashCodeAndEquals {

	public static void main(String[] args) {
		Price g1 = new Price("aa", 1);
		Price g2 = new Price("aa", 1);
		
		if (g1.hashCode() == g2.hashCode()) {
			if (g1.equals(g2))
				System.out.println("Both Objects are equal. "); //Both Objects are equal. 
			else
				System.out.println("Both Objects are not equal. ");
		} else
			System.out.println("Both Objects are not equal. ");
	}

}
