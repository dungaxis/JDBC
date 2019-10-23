package com.trungtamjava.main;

import java.util.Scanner;

import com.trungtamjava.dao.CarDaoImpl;
import com.trungtamjava.model.Car;

public class CarMain {

	public static void main(String[] args) {

		//createCar();
		
		/*
		 * Update one object car in DataBase
		 */
		updateCar();
		deleteCar();

	}
	
	public static void updateCar() {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap car id can update: ");
		int id = sc1.nextInt();
		// UPDATE
		CarDaoImpl carDaoImpl = new CarDaoImpl();
		Car car = new Car();
		car.setId(id);
		input(car);
		carDaoImpl.update(car);
		System.out.println("Update completed");

	}

	public static void deleteCar() {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nhap car id: ");
		int id = sc1.nextInt();
		// XOA
		CarDaoImpl carDaoImpl = new CarDaoImpl();
		carDaoImpl.delete(id);
		System.out.println("Delete completed");

	}

	public static void createCar() {
		Car car = new Car();
		input(car);

		// TAO MOI
		CarDaoImpl carDaoImpl = new CarDaoImpl();
		carDaoImpl.create(car);
		System.out.println("Create completed");
	}

	public static void input(Car car) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Name: ");
		car.setName(sc1.nextLine());

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Price: ");
		car.setPrice(sc2.nextLong());

		Scanner sc3 = new Scanner(System.in);
		System.out.println("Manufacture: ");
		car.setManufacturer(sc3.nextLine());
	}

	public static void info(Car car) {
		System.out.println("Name is " + car.getName());
		System.out.println("Price is " + car.getPrice());
		System.out.println("Manufacture is " + car.getManufacturer());

	}

}
