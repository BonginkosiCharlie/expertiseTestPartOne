package com.expertiseTestPartOne.Models;

public class Speed {
	private double unit;

	// getter method
	public double getUnit() {
		return unit;
	}

	// setter method
	public void setUnit(double unit) {
		this.unit = unit;
	}
	
	/**
	 * Method to convert Kilometer to Mile  
	 * */
	public void convertK2M() {
		this.unit = this.unit / 1.609344;
	}
	
	/**
	 * Method to convert Mile to Kilometer  
	 * */
	public void convertM2K() {
		this.unit = this.unit * 1.609344;
	}

	@Override
	public String toString() {
		return "Speed [unit=" + unit + "]";
	}
	
}
