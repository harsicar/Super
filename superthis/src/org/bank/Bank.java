package org.bank;

public class Bank {
	public Bank() {
	
	System.out.println("savings");
	}
	public Bank(int interest) {
		
		System.out.println("interest");
	}
	public Bank(String name) {
		this();
		System.out.println("name"+name);
	}

}
