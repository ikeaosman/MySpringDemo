package com.example.myspringdemo.Service;

import com.example.myspringdemo.Model.Person;
import com.example.myspringdemo.Resopository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonService {
    @Autowired
    PersonRepo personRepo;
    public List<Person> fetchAll(){
        return personRepo.fetchAll();
    }
    public void addPerson(Person p){
        personRepo.addPerson(p);
    }
    public Person findPersonById(int id){
        return personRepo.findPersonById(id);
    }
    public Boolean deletePerson(int id){
        return personRepo.deletePerson(id);
    }
    public void updatePerson(int id, Person p){
        personRepo.updatePerson(id, p);
    }
}