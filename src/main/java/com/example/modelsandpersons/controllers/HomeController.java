package com.example.modelsandpersons.controllers;

import com.example.modelsandpersons.models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        Person person = new Person();
        person.setId(27);
        person.setFirstName("David");
        person.setLastName("Lu");

        model.addAttribute("id", person.getId());
        model.addAttribute("firstName", person.getFirstName());
        model.addAttribute("lastName", person.getLastName());

        Person anotherPerson = new Person(11, "Lee", "Lu");
        model.addAttribute("anotherPerson", anotherPerson);

        return "home/index";
    }
}
