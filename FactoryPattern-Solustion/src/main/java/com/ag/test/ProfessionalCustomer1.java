package com.ag.test;
import com.ag.comp.BudgetCar;
import com.ag.comp.Car;
import com.ag.factory.CarFactory;

public class ProfessionalCustomer1 {
	
	public static void main(String[] args) {
		Car car=CarFactory.createCar("budget", "MP18GA7070");
	}
	
	

}
