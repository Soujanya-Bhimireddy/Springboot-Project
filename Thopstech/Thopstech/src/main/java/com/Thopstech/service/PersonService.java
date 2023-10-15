package com.Thopstech.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Thopstech.model.Person;
import com.Thopstech.repository.PersonRepository;

@Service
public class PersonService
{
@Autowired
PersonRepository PersonRepository;

public List<Person> getAllPerson() 
{
List<Person> Person = new ArrayList<Person>();
PersonRepository.findAll().forEach(Person1 -> Person.add(Person1));
return Person;
}

public Person getPersonById(int id) 
{
return PersonRepository.findById(id).get();
}

public void saveOrUpdate(Person Person) 
{
PersonRepository.save(Person);
}

public void delete(int id) 
{
PersonRepository.deleteById(id);
}

public void update(Person id, int Personid) 
{
PersonRepository.save(id);
}
}