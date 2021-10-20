package com.human.test;
import com.human.*;

public class HumanTest {

    public static void main(String[] args) {
    	
        Human Juan = new Human();
        Human Maria = new Human();

        Juan.displayHumanStats();
        System.out.println("*===========================*");
        Maria.displayHumanStats();
        
        Juan.attack(Maria);
        Maria.displayHumanStats();
    }
    
}
