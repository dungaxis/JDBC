package com.trungtamjava.dao;

import java.util.List;

import com.trungtamjava.model.Book;

public interface BookDao {
	
	void create(Book book);

	void update(Book book);

	void delete(int id);

	Book get(int id);

	List<Book> search(String name);

}
