package com.worthen.cody.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.worthen.cody.springwebapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
