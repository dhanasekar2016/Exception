package Exception;

public class Satck {
	public void findA() {
		findB();
	}
	public void findB() {
		findA();
	}
	public static void main(String[] args) {
		Satck s=new Satck();
		s.findA();
	}

}
