package com.worthen.cody.springwebapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.worthen.cody.springwebapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
