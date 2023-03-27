package com.example.myspringdemo.Service;

import com.example.myspringdemo.Model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonService { //Jeg har kopiet det fra PersonRepo klassen og skrevet autowired
    @Autowired
    JdbcTemplate template;

    public List<Person> fetchALl(){ //Den har fat i database og man skal lave en sql string her
        String sql = "SELECT * FROM person";
        RowMapper<Person> rowMapper = new BeanPropertyRowMapper<>(Person.class); // lister af objekter, af alle række i databasen

        //Her kommer vores sql kode til at stå

        return null;
    }
    public void addPerson(Person p){

    }
    public Person findPersonById(int id){
        return null;
    }
    public Boolean deletePerson(int id){
        return null;
    }
    public void updatePerson(int id, Person p){

    }
}
