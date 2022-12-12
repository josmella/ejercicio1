package com.example.maestroUno;

public class Samurai extends Human {
	
	public int con=10;

	public Samurai() {
		super();
		this.health = 200;
	}

	public void deathBlow(Human human) {
		System.out.println("Samurai - deathBlow");
		human.setHealth(0);
		this.health = this.health / 2;
		System.out.println("salud humano :"+human.getHealth());
		System.out.println("health samurai: "+this.health);

	}

	public void meditate() {
		System.out.println("Samurai - meditate");
		this.health = this.health + (this.health / 2);
		System.out.println("health samurai: "+this.health);
	}

	public void howMany() {
		
		//ciclo(contar cantidad de samurais)=cont++; 
		
		System.out.println("Samurai - howMany");
		System.out.println("cantidad samurais :"+con);
		// devuelve cuantos Samurai tenemos actualmente.
	}
	
	
	

}
