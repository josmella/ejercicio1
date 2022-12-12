package com.example.maestroUno;

public class Wizard extends Human {

	public Wizard() {
		super();
		this.health = 50;
		this.intelligence = 8;
	}

	public void heal(Human human) {
		System.out.println("WIZARD - heal");
		human.setHealth(human.getHealth() + this.intelligence);
		System.out.println("salud aumentada a: " + human.getHealth());

	}

	public void fireBall(Human human) {
		System.out.println("WIZARD - fireBall");
		human.setHealth(human.getHealth() - (this.intelligence * 3));
		System.out.println("salud disminuida a: " + human.getHealth());
	}

}
