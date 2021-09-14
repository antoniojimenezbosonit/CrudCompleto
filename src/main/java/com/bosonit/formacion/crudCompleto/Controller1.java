package com.bosonit.formacion.crudCompleto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("person")
public class Controller1 {

    @Autowired
    ServicePerson sc;

    @GetMapping("getPerson/{id}")
    public Person getPerson(@PathVariable Integer id){
        return sc.getPerson(id);
    }

    @GetMapping("getAllPerson")
    public List<Person> getAllPerson(){
        return sc.getAllPerson();
    }
    //se ejecuta la segunda por que al pasar del main sigue el orden establecido en los archivos
    @Bean
    CommandLineRunner ejecutame2(){
        return p -> {
            System.out.println("Hola desde la clase secundaria");
        };
    }


}
