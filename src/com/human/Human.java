package com.human;

public class Human {
	
	protected int strength = 3;
	protected int stealth = 3;
	protected int intelligence = 3;
	protected int health = 100;
	
	public void displayHumanStats(){
		
		System.out.println("Strength: " + this.strength);
		System.out.println("Stealth: " + this.stealth);
		System.out.println("Intelligence: " + this.intelligence);
		System.out.println("Health: " + this.health);
		
	}
	
	public void attack(Human target) {
		
		target.health -= this.strength;
	
	}
	
}
