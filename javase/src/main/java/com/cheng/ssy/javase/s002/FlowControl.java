package com.cheng.ssy.javase.s002;

public class FlowControl {
	public static void main(String[] args) {
		String a = "wangwu";
		//switch 类型为 wangwu short int char 
		//Cannot switch on a value of type long. Only convertible int values, strings or enum variables are permitted
		switch (a) {
		case "lisi":
			System.out.println("lisi");
			break;
			
		//应该添加break
		case "wangwu":
			System.out.println("wangwu");
		default:
			System.out.println("no name");
		}
	}
}
