package com.javaex.ex05;

public class Ex01 {
	
	public static void main(String[] args) {
		String s01=new String("hi");
		String s02=new String("hi");
		
		System.out.println(s01==s02);
		System.out.println(s01.equals(s02));
		
		String s03="hello";
		String s04="hello";
		
		System.out.println(s03==s04);
		System.out.println(s03.equals(s04));
		
		s03="hello!!";
		
		System.out.println(s04);
	}
}
