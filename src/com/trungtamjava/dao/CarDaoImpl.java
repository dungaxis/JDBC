package com.trungtamjava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.trungtamjava.model.Car;

//Extends JDBCConnection de ke thua la ham Connection

public class CarDaoImpl extends JDBCConnection implements CarDao {

	@Override
	public void create(Car car) {
		// Trong java index dau ? bat dau tu so 1
		try {
			String sql = "INSERT INTO car(name, price, manufacture) " + "VALUES(?,?,?);";

			/// Set up cau lenh
			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setString(1, car.getName());
			statement.setLong(2, car.getPrice());
			statement.setString(3, car.getManufacturer());

			/// Gui cau lenh di
			statement.executeUpdate();

		} catch (Exception e) {
			System.out.println("Loi sql " + e);
		}
	}

	@Override
	public void update(Car car) {
		try {
			String sql = "UPDATE Car SET name = ?, price = ?, manufacture = ? WHERE id = ?;";

			/// Set up cau lenh
			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setString(1, car.getName());
			statement.setLong(2, car.getPrice());
			statement.setString(3, car.getManufacturer());
			statement.setInt(4, car.getId());

			/// Gui cau lenh di
			statement.executeUpdate();

		} catch (Exception e) {
			System.out.println("Loi sql " + e);
		}
	}

	@Override
	public void delete(int id) {
		try {
			String sql = "DELETE FROM car where id = ?;";

			/// Set up cau lenh
			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setInt(1, id);

			/// Gui cau lenh di
			statement.executeUpdate();

		} catch (Exception e) {
			System.out.println("Loi sql " + e);
		}
	}

	@Override
	public Car get(int id) {
		return null;
	}

	@Override
	public List<Car> search(String name) {
		return null;
	}

}
