package com.bosonit.formacion.crudCompleto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
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

    //se ejecuta la segunda por que al pasar del main sigue el orden establecido en los archivos
    @Bean
    CommandLineRunner ejecutame(){
        return p -> {
            System.out.println("Soy la tercera clase");
        };
    }

}
