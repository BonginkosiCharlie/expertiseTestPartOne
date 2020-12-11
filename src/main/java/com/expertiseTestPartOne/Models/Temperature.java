package com.expertiseTestPartOne.Models;

public class Temperature {
	private double temp;

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}
	
	public void convertK2C() {
		this.temp = this.temp - 275.15;
	}
	
	public void convertC2K() {
		this.temp = this.temp + 275.15;
	}

	@Override
	public String toString() {
		return "Temperature [temp=" + temp + "]";
	}
}
