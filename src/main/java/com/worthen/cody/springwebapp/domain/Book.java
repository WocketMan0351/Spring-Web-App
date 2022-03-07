package com.worthen.cody.springwebapp.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // annotation to make this a JPA entity (Java Persistence API)
public class Book {

	@Id // each entity needs an ID
	@GeneratedValue(strategy = GenerationType.AUTO) // underlying database provides the generation
	private Long id;

	private String title;
	private String isbn;
	private Set<Author> authors;

	public Book() {
		super();
	}

	public Book(String title, String isbn, Set<Author> authors) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.authors = authors;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

}
