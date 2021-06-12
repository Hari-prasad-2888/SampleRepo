package org.hcl;

public class Axis extends Bank {
	@Override
	public void fixed() {
		System.out.println("7%");
	}
	@Override
	public void savings() {
		System.out.println("8%");
	}
	public static void main(String[] args) {
		Axis a = new Axis();
		a.fixed();
		a.savings();
		a.loan();    
	}
}
