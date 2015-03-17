package com.cheng.ssy.javase.s002;

/**
 * 
 * @author cheng.jun
 *
 * 八种原生数据类型,长度以及取值范围
 */
public class Primitive {
	
	public static void main(String[] args) {
		
		long l64 = Long.MAX_VALUE;
		
		int l32 = Integer.MAX_VALUE;
		
		short l16 = Short.MAX_VALUE;
		
		byte l8 = Byte.MAX_VALUE;
		
		float l = Float.MAX_VALUE;
		
		float f = (float) 1.11111111;
		
		System.out.println(f);
		
		double d = 111111111111111333333333333333333666.111111111111111111111;
		
		System.out.println(d);
		
		int c16 = Character.SIZE;
		
		char c = '中';
		
	}
}
