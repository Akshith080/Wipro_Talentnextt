package com.automobile.FourWheeler;
import com.automobile.Vehicle;
public class Logan extends Vehicle {
	int speed=120;
	int gps=90;
	public int speed() {
		return speed;
	}
	public int gps() {
		System.out.println("Accurate Gps location");
		return gps;
	}
	@Override
	public String getModelName() {
		return "Logan";
	}
	@Override
	public String getRegistrationNumber() {
		return "KA1CR2198709";
	}
	@Override
	public String getOwnerName() {
		return "Akshith";
	}
}
