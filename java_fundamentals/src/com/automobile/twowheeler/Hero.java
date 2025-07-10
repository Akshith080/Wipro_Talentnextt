package com.automobile.twowheeler;
import com.automobile.Vehicle;
public class Hero extends Vehicle {
	int speed=80;
	public int getspeed() {
		return speed;
	}
	public void radio() {
		System.out.println("Playing radio");
	}
	@Override
	public String getModelName() {
		return "Hero";
	}
	@Override
	public String getRegistrationNumber() {
		return "KA1CR21CS027";
	}
	@Override
	public String getOwnerName() {
		return "Anchal Singh";
	}

}
