package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class BookController {
	@Autowired  
	BookService bookService; 
	@GetMapping("/getbook")
	private List<BookMODL> getAllBooks()   
	{  
	return bookService.getAllBooks();  
	}  
	
	@GetMapping("/book/{bookid}")  
	private BookMODL getBooks(@PathVariable("bookid") int bookid)   
	{  
	return bookService.getBooksById(bookid);  
	}  
	
	@DeleteMapping("/deleteBook/{bookid}")  
	private void deleteBook(@PathVariable("bookid") int bookid)   
	{  
		bookService.delete(bookid);  
		
	}  
	
	@PostMapping("/saveBook")  
	public int saveBook(@RequestBody BookMODL bookMODL)   
	{  
		bookService.saveOrUpdate(bookMODL);  
	    return bookMODL.getBookId();  
	}  

	@PutMapping("/updatebook")  
	private BookMODL update(@RequestBody BookMODL bookMODL)   
	{  
	bookService.saveOrUpdate(bookMODL);  
	return bookMODL;  
	}
}


