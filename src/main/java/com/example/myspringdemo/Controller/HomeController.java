package com.example.myspringdemo.Controller;

import com.example.myspringdemo.Model.Person;
import com.example.myspringdemo.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    PersonService personService;

    @GetMapping("/")
    public String index(){
        List<Person> personList = personService.fetchALl();
        return "home/index";
    }
}
