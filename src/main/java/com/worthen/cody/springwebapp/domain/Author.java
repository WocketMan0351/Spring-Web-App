package com.worthen.cody.springwebapp.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // annotation to make this a JPA entity (Java Persistence API)
public class Author {

	@Id // each entity needs an ID
	@GeneratedValue(strategy = GenerationType.AUTO) // underlying database provides the generation
	private Long id;

	private String firstName;
	private String lastName;
	private Set<Book> books;

	public Author() {
		super();
	}

	public Author(String firstName, String lastName, Set<Book> books) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.books = books;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

}
