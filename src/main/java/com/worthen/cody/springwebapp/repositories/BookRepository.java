package com.worthen.cody.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.worthen.cody.springwebapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
