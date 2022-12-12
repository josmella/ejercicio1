package com.example.maestroUno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HumanTest {

	public static void main(String[] args) {
		SpringApplication.run(HumanTest.class, args);
		System.out.println("Inicio");

		Human human = new Human();

		System.out.println("humano sin atacar" + human.getHealth());

		human.attack(human);

		Wizard wizard =new Wizard();
		
		wizard.heal(human);
		
		
		
		
//		Ninja ninja = new Ninja();
//		
		Samurai samurai= new Samurai();
		
		
		samurai.howMany();
//		
//		
//		
//
//		ninja.steal(human);
		




		
		
		
		
		
		
		
		
	}

}
