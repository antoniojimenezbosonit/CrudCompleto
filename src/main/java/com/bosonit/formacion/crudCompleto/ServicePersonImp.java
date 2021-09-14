package com.bosonit.formacion.crudCompleto;

import java.util.ArrayList;
import java.util.List;

public class ServicePersonImp implements ServicePerson{
    List<Person> listPerson = new ArrayList<>();
    Integer id = 0;

    @Override
    public Person getPerson(Integer id) {
        return listPerson.get(id);
    }

    @Override
    public List<Person> getAllPerson(){
        return listPerson;
    }

    @Override
    public Person addPerson(String name, Integer age, String poblation) {
        Person p = new Person();
        p.setId(id);
        p.setName(name);
        p.setAge(age);
        p.setPoblation(poblation);
        listPerson.add(p);
        id++;
        return p;
    }

    @Override
    public String deletePerson(Integer id) {
        if (listPerson.size() > id) {
            if (listPerson.get(id).id == id) {
                listPerson.remove(listPerson.get(id));
                return "borrado con exito";
            }else{
                return "Fallo al borrar";
            }
        } else {
            return "Usuario no encontrado";
        }


    }

    @Override
    public String updatePerson(Person person) {
        if(listPerson.get(person.id) != null){
            listPerson.get(person.id).name = person.name;
            listPerson.get(person.id).age = person.age;
            listPerson.get(person.id).poblation = person.poblation;
            return "Persona actualizada con existo " + person.toString();
        }else{
            return "Persona no encontrada";
        }
    }
}
