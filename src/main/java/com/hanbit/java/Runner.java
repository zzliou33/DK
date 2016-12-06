package com.hanbit.java;

import com.hanbit.animal.Cat;
import com.hanbit.animal.Dog;
import com.hanbit.animal.Hamster;

public class Runner {
	
	public static void main(String[] args) {
		Dog dog = new Dog("진돗개","흰색");
		Cat cat = new Cat("두식","터키쉬앙고라","흰색");
		Hamster hamster = new Hamster("뽀로리","몰라","흰색");
		
		dog.setName("");
		cat.setName(null);
		hamster.setName(null);
		
		
		System.out.println(dog);
		System.out.println(cat);
		System.out.println(hamster);


		}
	
}