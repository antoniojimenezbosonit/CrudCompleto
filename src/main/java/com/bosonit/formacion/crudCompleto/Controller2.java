package com.bosonit.formacion.crudCompleto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("person")
public class Controller2 {

    @Autowired
    ServicePerson sp;

    @PostMapping("addPerson")
    public Person addPerson(@RequestBody Person person){
        return sp.addPerson(person.getName(), person.getAge(), person.getPoblation());
    }

}
