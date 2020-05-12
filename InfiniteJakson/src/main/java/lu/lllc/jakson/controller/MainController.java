package lu.lllc.jakson.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lu.lllc.jakson.entity.Book;
import lu.lllc.jakson.entity.Customer;
import lu.lllc.jakson.repository.BookRepository;
import lu.lllc.jakson.repository.CustomerRepository;

@RestController
public class MainController {

	@Autowired
	CustomerRepository user_repository;
	
	@Autowired
	BookRepository book_repository;
	
	@GetMapping("/customers")
	List<Customer> customers(){
		List<Customer> customers = user_repository.findAll();
		
		return customers;
	}
	
	@GetMapping("/books")
	List<Book> books(){
		List<Book> books = book_repository.findAll();
		
		return books;
	}
}
