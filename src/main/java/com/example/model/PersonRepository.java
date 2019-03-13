package com.example.model;

import com.example.model.Person;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String>{
    public Person findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

}