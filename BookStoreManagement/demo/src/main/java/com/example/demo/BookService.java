package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookService {
	@Autowired
	BookRepository bookRepository;

	public List<BookMODL> getAllBooks() {
		List<BookMODL> bookMODL = new ArrayList<BookMODL>();
		bookRepository.findAll().forEach(books1 -> bookMODL.add(books1));
		return bookMODL;
	}

	public BookMODL getBooksById(int id) {
		return bookRepository.findById(id).get();
	}

	public void saveOrUpdate(BookMODL bookMODL) {
		bookRepository.save(bookMODL);
	}

	public void delete(int id) {
		bookRepository.deleteById(id);
	}

//updating a record  
	public void update(BookMODL bookMODL, int bookid) {
		bookRepository.save(bookMODL);
	}
}
