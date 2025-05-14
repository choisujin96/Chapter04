package com.javaex.ex07;

public class Triangle {
	
	
	//필드
	private int weight;
	private int height;

	
	//생성자
	public Triangle() {
	
	}
	
	public Triangle(int weight, int height) {
		this.weight = weight;
		this.height = height;
	}

	
	//메소드gs
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}


	//메소드일반
	@Override
	public String toString() {
		return "Triangle [weight=" + weight + ", height=" + height + "]";
	}	
	

}
