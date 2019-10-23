package com.trungtamjava.model;


public class Car {

	private int id;
	private String name;
	private long price;
	private String manufacture;

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getManufacturer() {
		return manufacture;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacture = manufacturer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
