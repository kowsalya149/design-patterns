package com.adapterpattern.birdsound;

public class BirdAdapterToy implements ToyBird {

	Bird bird;
	
	public BirdAdapterToy(Bird bird) {
		this.bird = bird;
	}

	@Override
	public void squeak() {
		bird.makeSound();
	}

}