package com.worthen.cody.springwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.worthen.cody.springwebapp.repositories.AuthorRepository;

@Controller // Tells Spring to make this into a Spring MVC Controller
public class AuthorController {

	private final AuthorRepository authorRepository; // injects instance of AuthorRepository

	public AuthorController(AuthorRepository authorRepository) {
		super();
		this.authorRepository = authorRepository;
	}

	@RequestMapping("/authors") // maps to a specific URL
	public String getAuthors(Model model) {
		// Spring provides a model. We add the authors from the db to the model under an
		// attribute.
		model.addAttribute("authors", authorRepository.findAll()); // gets books from the db and assigns it to "authors"
		return "authors/list"; // returns a string that tells Spring MVC to apply the view "authors"
	}
}
