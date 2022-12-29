package com.spring.project.complex_bean_problem;

public class Garden {

	Flower flower;
	Fruit fruit;

	public Garden() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Garden(Flower flower, Fruit fruit) {
		super();
		this.flower = flower;
		this.fruit = fruit;
	}

	public Flower getFlower() {
		return flower;
	}

	public void setFlower(Flower flower) {
		this.flower = flower;
	}

	public Fruit getFruit() {
		return fruit;
	}

	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}

	@Override
	public String toString() {
		return "Garden [flower=" + flower + ", fruit=" + fruit + "]";
	}

}
