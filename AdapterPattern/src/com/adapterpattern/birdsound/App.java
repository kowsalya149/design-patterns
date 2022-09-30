package com.adapterpattern.birdsound;

public class App {
	public static void main(String[] args) {
		
		Bird crow = new Crow();
		crow.fly();
		crow.makeSound();
		
		System.out.println("\nToy behave like bird");
		
		ToyBird birdAdapterToy = new BirdAdapterToy(new Sparrow());
		birdAdapterToy.squeak();
		
		System.out.println("\nBird behave like toy");
		
		Bird birdAdapter = new BirdAdapter(new ToyDuck());
		birdAdapter.fly();
		birdAdapter.makeSound();
	}
}