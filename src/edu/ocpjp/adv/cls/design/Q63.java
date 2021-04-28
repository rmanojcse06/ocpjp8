package edu.ocpjp.adv.cls.design;

import java.io.IOException;

class FuelNotAvailException extends Exception{}
class Vehicle{
	protected void ride() throws FuelNotAvailException{
		System.out.println("Happy Journey!");
	}
}
class SolarVehicle extends Vehicle{
	public void ride() throws FuelNotAvailException {
		super.ride();
	}
} 

public class Q63 {
public static void main(String[] args) throws Throwable{
	Vehicle v = new SolarVehicle();
	v.ride();
}
}
