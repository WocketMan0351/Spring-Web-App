package com.worthen.cody.springwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.worthen.cody.springwebapp.repositories.BookRepository;

@Controller // Tells Spring to make this into a Spring MVC Controller
public class BookController {

	private final BookRepository bookRepository; // injects instance of BookRepository

	public BookController(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	@RequestMapping("/books") // maps to a specific URL
	public String getBooks(Model model) {
		// Spring provides a model. We add the books from the db to the model under an
		// attribute.
		model.addAttribute("books", bookRepository.findAll()); // gets books from the db and assigns it to "books"
		return "books/list"; // returns a string that tells Spring MVC to apply the view "books"
	}

}
