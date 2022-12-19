package com.ag.test;
import com.ag.comp.Car;
import com.ag.factory.CarFactory;

public class YouthCustomer2 {
	public static void main(String[] args) {
		
		Car car=CarFactory.createCar("sports", "MP18AH7890");
		car.drive();
		System.out.println("===========");
	}

}
