package com.heroku.workshop.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.heroku.workshop.entities.Person;

@RepositoryRestResource
public interface PersonRepository extends CrudRepository<Person, Long> {

}
