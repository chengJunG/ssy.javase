package com.cheng.ssy.javase.s002;
/**
 * 
 * @author cheng.jun
 * 
 * java中除出现的结果可能不是想要的
 */
public class Operator {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		System.out.println( a * b);
		
		System.out.println( b / a);
		System.out.println( a / b);
		System.out.println( 1.0 / b);
		
		int c = (int) 0.5;
		
		System.out.println(c);
		
//		取模运算
		System.out.println("-5 mod 3 = " + -5 % 3);
	}
}
