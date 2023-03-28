package com.example.myspringdemo.Resopository;

import com.example.myspringdemo.Model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;


@Repository
public class PersonRepo {
    @Autowired
    JdbcTemplate template;
    public List<Person> fetchAll(){
        String sql = "SELECT * FROM person";
        RowMapper<Person> rowMapper = new BeanPropertyRowMapper<>(Person.class);
        return template.query(sql, rowMapper);
    }
    public void addPerson(Person p){
        String sql = "INSERT INTO person (id, first_name, last_name) VALUES (?, ?, ?)";
        template.update(sql, p.getId(), p.getFirst_name(), p.getLast_name());
    }
    public Person findPersonById(int id){
        String sql = "SELECT * FROM person WHERE id = ?";
        RowMapper<Person> rowMapper = new BeanPropertyRowMapper<>(Person.class);
        Person p = template.queryForObject(sql, rowMapper,id);
        return p;
    }
    public Boolean deletePerson(int id){
        String sql = "DELETE FROM person WHERE id = ?";
        return template.update(sql,id) > 0;
    }
    public void updatePerson(int id, Person p){
        String sql = "UPDATE person SET first_name = ?, last_name = ? WHERE id = ?";
        template.update(sql,p.getFirst_name(), p.getLast_name(), p.getId());

    }
}
