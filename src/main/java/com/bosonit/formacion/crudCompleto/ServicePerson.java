package com.bosonit.formacion.crudCompleto;

import java.util.ArrayList;
import java.util.List;

public interface ServicePerson {

    List<Person> listPerson = new ArrayList<>();

    public Person getPerson(Integer id);
    public List<Person> getAllPerson();
    public Person addPerson(String name, Integer age, String poblation);
    public String deletePerson(Integer id);
    public String updatePerson(Person person);

}
