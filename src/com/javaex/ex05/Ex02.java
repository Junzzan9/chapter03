package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		
		String a=new String(" abcd");
		String b=new String(",efg ");
		
		System.out.println(a.concat(b));
		
		a=a.concat(b);  //문자열 합체
		System.out.println(a);
		
		a=a.trim();     //공백 없애기
		System.out.println(a);
		
		a=a.replace("ab", "12");
		System.out.println(a);
		
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		String[] as=a.split("d");
		for(int i=0;i<as.length;i++) {
			System.out.println(as[i]);
		}
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		String str = "Hello java!";
		
		System.out.println(str.charAt(4));
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		String result = str.substring(3);
		System.out.println(result);
		
		String result2 = str.substring(3, 8);
		System.out.println(result2);
		
		
	}

}
