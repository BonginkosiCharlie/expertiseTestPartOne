package com.expertiseTestPartOne.Models;

public class Temperature {
	private double temp;

	// getter method
	public double getTemp() {
		return temp;
	}

	// setter method
	public void setTemp(double temp) {
		this.temp = temp;
	}
	
	/**
	 * Method to convert Kelvin to Celsius  
	 * */
	public void convertK2C() {
		this.temp = this.temp - 275.15;
	}
	
	/**
	 * Method to convert Celsius to Kelvin  
	 * */
	public void convertC2K() {
		this.temp = this.temp + 275.15;
	}

	@Override
	public String toString() {
		return "Temperature [temp=" + temp + "]";
	}
}
