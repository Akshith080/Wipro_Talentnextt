package com.automobile.twowheeler;
import com.automobile.Vehicle;
public class Honda extends Vehicle {
	int speed=90;
	public int getspeed() {
		return speed;
	}
	public void cdplayer() {
		System.out.println("Playing CD");
	}
	@Override
	public String getModelName() {
		return "Honda";
	}
	@Override
	public String getRegistrationNumber() {
		return "KA1CR21CS027";
	}
	@Override
	public String getOwnerName() {
		return "Anchal Roy";
	}

}

