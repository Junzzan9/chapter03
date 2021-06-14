package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {
		
		Integer i01=new Integer(10);
		Integer i02=new Integer(7);
		
		Integer result=i01+i02;
		
		//Integer result=new Integer(19)+new Integer(7);
		
		System.out.println(result);
		/*
		int i10=7;
		Integer i11=10; //==Integer i11=new Integer(10);
		
		Integer i100=15;
		int i101=i100;
		System.out.println(i101);
		*/
		
		int i10=7; //i10. <-- 값이 들어있음
		i01.intValue();
		
		Integer i11=10;
		
		int i101=i11;
		System.out.println(i101);
		
		System.out.println("문자열 -->정수");
		
		Integer i999=new Integer(999);
		int num=i999.parseInt("12345");
		System.out.println(num);
		
		int num2=Integer.parseInt("12345");
		System.out.println(num2);
		
		//정수 --> 문자열
		/*
		String str=new String("hi");
		String rslt=str.valueOf(123456);
		System.out.println(rslt);
		*/
		
		String strResult2=String.valueOf(123456);
		System.out.println(strResult2);
		
		String strResult3=""+9876;
		System.out.println(strResult3);
		
		String inputText="y";
		//String retry ="y";
		//String inputText=new String("y");
		//inputText=null;
		
		
		//인풋 텍스트값이 없으면 오류
		try {
			if(inputText.equals("y")) {
				System.out.println("게임 다시 시작");
			}
		} catch(NullPointerException e) {
			System.out.println("입력된 값이 없습니다.");
		}
		
		//이 방법 선호(항상 .equals를 사용할 수 있음)
		if("y".equals(inputText)) {
			System.out.println("게임 다시시작");
		}
		
		//다름 기본 자료형
		Byte b =new Byte((byte)1);
		Short s = new Short((short)1);
		
		
		
	}

}
