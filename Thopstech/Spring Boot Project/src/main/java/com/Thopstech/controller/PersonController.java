
package com.Thopstech.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Thopstech.model.Person;
import com.Thopstech.service.PersonService;

@RestController
public class PersonController 
{

@Autowired
PersonService PersonService;
 
@GetMapping("/Person")
private List<Person> getAllPerson() 
{
return PersonService.getAllPerson();
}

@GetMapping("/Person/{Personid}")
private Person getPerson(@PathVariable("Personid") int Personid) 
{
return PersonService.getPersonById(Personid);
}

@DeleteMapping("/Person/{Personid}")
private void deletePerson(@PathVariable("Personid") int Personid) 
{
	PersonService.delete(Personid);
}

@PostMapping("/Person")
private int savePerson(@RequestBody Person Person) 
{
	PersonService.saveOrUpdate(Person);
return Person.getPersonid();
}
 
@PutMapping("/Person")
private Person update(@RequestBody Person Person) 
{
	PersonService.saveOrUpdate(Person);
return Person;
}
}
