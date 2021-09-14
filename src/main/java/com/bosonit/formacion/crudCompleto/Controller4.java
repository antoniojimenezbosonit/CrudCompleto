package com.bosonit.formacion.crudCompleto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("person")
public class Controller4 {

    @Autowired
    ServicePerson sc;

    @PutMapping("updatePerson/{id}")
    public String updatePerson(@RequestBody Person person){
        return sc.updatePerson(person);
    }
}
