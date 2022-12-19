package com.ag.comp;

public class LuxaryCar extends Car{
	private String regNo;
	public LuxaryCar(String regNo) {
		
		System.out.println("LuxaryCar::1-param constructor");
		this.regNo=regNo;
		
	}
	@Override
	public void drive() {
		System.out.println("Drive Luxary Car");
		
	}

}
