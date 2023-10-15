package com.Thopstech.repository;
import org.springframework.data.repository.CrudRepository;

import com.Thopstech.model.Person;
public interface PersonRepository extends CrudRepository<Person, Integer>
{
}
