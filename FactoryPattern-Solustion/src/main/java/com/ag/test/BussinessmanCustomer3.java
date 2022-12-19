package com.ag.test;
import com.ag.comp.BudgetCar;
import com.ag.comp.Car;
import com.ag.factory.CarFactory;
public class BussinessmanCustomer3 {
	
	
	public static void main(String[] args) {
		Car car=CarFactory.createCar("budget","MP18GA3264");
		
		car.drive();
		System.out.println("==============");
	}

}
