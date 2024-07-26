package com.example.demo.model;

public class Alien {
	private int aid;
	private String name;
	
	public Alien(int aid, String name) {
		super();
		this.aid = aid;
		this.name = name;
	}
	
	public int getAid() {
		return aid;
	}
	
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", name=" + name + "]";
	}
}
