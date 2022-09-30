package com.adapterpattern.birdsound;

public class BirdAdapter implements Bird {

	ToyBird toyBird;
	
	public BirdAdapter(ToyBird toyBird) {
		this.toyBird = toyBird;
	}

	@Override
	public void fly() {
		System.out.println("Toybird donot fly");
	}

	@Override
	public void makeSound() {
		toyBird.squeak();
	}

}