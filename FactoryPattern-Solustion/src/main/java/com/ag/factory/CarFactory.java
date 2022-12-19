package com.ag.factory;
import com.ag.comp.BudgetCar;
import com.ag.comp.Car;
import com.ag.comp.LuxaryCar;
import com.ag.comp.SportCar;

public class CarFactory {
	
	public static Car createCar(String type,String regNo) {
		
		if(type.equalsIgnoreCase("sports")){
		     return new SportCar(regNo);
		}
		else if(type.equalsIgnoreCase("budget")){
		    return new BudgetCar(regNo);
		}
		else if(type.equalsIgnoreCase("luxory")) {
		    return new LuxaryCar(regNo);
		}
		else {
			throw new IllegalAccessError("invalid car type");
		}
		
	}
}
