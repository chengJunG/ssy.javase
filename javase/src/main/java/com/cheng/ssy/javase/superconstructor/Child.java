package com.cheng.ssy.javase.superconstructor;

/**
 * 
 * @author cheng.jun
 *
 * 如果在定义一个类的时候，没有为类声明构造方法，那么Java编译器会自动为类添加一个没有参数且方法体为空的构造方法（默认的构造方法）
 * 
 * 如果构造函数没有显示得调用父类的构造函数，会隐式得调用父类无参的构造函数，如果父类没有无参的构造函数将会报错。
 * 如果构造函数显示得调用父类的构造函数，需要在第一行
 * 
 */
//Implicit super constructor Parent() is undefined for default constructor. Must define an explicit constructor
public class Child extends Parent {
//Implicit super constructor Parent() is undefined. Must explicitly invoke another constructor
	public Child(int i) {
//		Constructor call must be the first statement in a constructor
//		System.out.println();
		super(i);
		// TODO Auto-generated constructor stub
	}
	
//	public Child(int i){
//	}
	
//	public static void main(String[] args) {
//		new Child(0);
//	}
}
