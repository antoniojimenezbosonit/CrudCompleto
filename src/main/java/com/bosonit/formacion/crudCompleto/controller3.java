package com.bosonit.formacion.crudCompleto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")
public class controller3 {

    @Autowired
    ServicePerson sp;

    @DeleteMapping("deletePerson/{id}")
    public String deletePerson(@PathVariable Integer id){
        return sp.deletePerson(id);
    }
}
