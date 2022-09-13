package com.bridgelabz;

public class Hotel {
	private final String name;
	private final int rate;

	public Hotel(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}

	public String getName() {
		return name;
	}

	public int getRate() {
		return rate;
	}
}

