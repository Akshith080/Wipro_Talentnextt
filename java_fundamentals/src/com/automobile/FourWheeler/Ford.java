package com.automobile.FourWheeler;
import com.automobile.*;
public class Ford extends Vehicle {
	int speed=150;
	int temp=30;
	public int speed() {
		return speed;
	}
	public int tempcontrol() {
		System.out.println("Temparature Control");
		return temp;
	}
	@Override
	public String getModelName() {
		return "Ford";
	}
	@Override
	public String getRegistrationNumber() {
		return "AP1RC2198709";
	}
	@Override
	public String getOwnerName() {
		return "Ssai";
	}
}


