package com.example.maestroUno;

public class Ninja extends Human {

	public Ninja() {
		super();
		this.stealth = 10;
	}

	public void steal(Human human) {
		System.out.println("Ninja - steal");
		human.setHealth(human.getHealth() - this.stealth);
		this.health += this.stealth;
		System.out.println("salud es: "+human.getHealth());
		System.out.println("tealth ninja es: "+this.health);

	}

	public void runAway() {
		System.out.println("Ninja - runAway");
		this.health = this.stealth-10;
		System.out.println("stealth ninja es: "+this.stealth);
	}

}
