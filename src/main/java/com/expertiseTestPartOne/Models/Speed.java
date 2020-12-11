package com.expertiseTestPartOne.Models;

public class Speed {
	private double unit;

	public double getUnit() {
		return unit;
	}

	public void setUnit(double unit) {
		this.unit = unit;
	}
	
	public void convertK2M() {
		this.unit = this.unit / 1.609344;
	}
	
	public void convertM2K() {
		this.unit = this.unit * 1.609344;
	}

	@Override
	public String toString() {
		return "Speed [unit=" + unit + "]";
	}
	
}
