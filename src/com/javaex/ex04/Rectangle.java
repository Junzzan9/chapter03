package com.javaex.ex04;

public class Rectangle {
	
	private double width;
	private double height;
	
	public Rectangle(double width,double height) {
		this.width=width;
		this.height=height;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Rectangle r=((Rectangle)obj);
		
		if(this.width==r.width&&this.height==r.height) {
			return true;
		}
		
		 if(this.area()==r.area()) {
			return true;
		}
		else {
			return false;
		}
		 
	}
	
	public double area() {
		return this.width*this.height;
	}
	
	
	
}

