package com.spring.project.autowire_byName;

public class Country {
	
	int state_no;
	String name;
	
	public int getState_no() {
		return state_no;
	}
	public void setState_no(int state_no) {
		this.state_no = state_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Country [state_no=" + state_no + ", name=" + name + "]";
	}
	
	

}
