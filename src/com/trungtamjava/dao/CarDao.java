package com.trungtamjava.dao;

import java.util.List;

import com.trungtamjava.model.Car;

public interface CarDao {

	void create(Car car);

	void update(Car car);

	void delete(int id);

	Car get(int id);

	List<Car> search(String name);

}
