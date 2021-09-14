package com.bosonit.formacion.crudCompleto;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CrudCompletoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudCompletoApplication.class, args);
	}

	//se ejecuta la primera al iniciar la aplicacion por estar en el main
	@PostConstruct
	void ejcutate(){
		System.out.println("Hola desde la clase inicial");
	}

	@Bean
	@Primary
	public ServicePerson getServicePerson(){
		ServicePerson sp = new ServicePersonImp();
		return sp;
	}
}


