package com.trungtamjava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import com.trungtamjava.model.Book;

public class BookDaoImpl extends JDBCConnection implements BookDao {

	@Override
	public void create(Book book) {

		try {
			String sql = "INSERT INTO book(title, description, publisher) VALUES(?,?,?);";

			// Goi connection
			Connection conn = super.getConnection();
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setString(0, book.getTitle());
			statement.setString(1, book.getDescription());
			statement.setString(2, book.getPublisher());

			// Gui cau lenh, thuc thi tren SQL
			statement.executeUpdate();

		} catch (Exception e) {
			System.out.println("Loi" + e);
		}
	}

	@Override
	public void update(Book book) {
	}

	@Override
	public void delete(int id) {
	}

	@Override
	public Book get(int id) {
		return null;
	}

	@Override
	public List<Book> search(String name) {
		return null;
	}

}
