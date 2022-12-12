package com.example.maestroUno;

public class Human {

	public Integer strength = 3;
	public Integer stealth = 3;
	public Integer intelligence = 3;
	public Integer health = 100;

	public Human() {

	}

	public void attack(Human human) {

		System.out.println("Human - attack");

		human.setHealth(human.getHealth() - this.strength);

		System.out.println("el humado atacado tiene: " + human.getHealth());
	}

	public Integer getStrength() {
		return strength;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	public Integer getStealth() {
		return stealth;
	}

	public void setStealth(Integer stealth) {
		this.stealth = stealth;
	}

	public Integer getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}

	public Integer getHealth() {
		return health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}

}
