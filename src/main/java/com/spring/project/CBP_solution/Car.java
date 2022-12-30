package com.spring.project.CBP_solution;

public abstract class Car {

	Engine engine;

	protected abstract Engine createEngine();

	
	public Engine getEngine() {
		return createEngine();
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + "]";
	}

}
