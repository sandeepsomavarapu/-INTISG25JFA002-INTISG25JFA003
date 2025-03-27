package com.cts.demo;

import java.util.Date;//ctrl+shift+O

class ParentEx {
	int result=245;
	public ParentEx() {
		System.out.println("ParentEx Default Constructor");
	}

	public ParentEx(int id) {
		System.out.println("ParentEx Param Constructor");
	}

	public void m1() {
		System.out.print("ParentEx m1 method");
	}
}

public class BasicEx extends ParentEx {
	int result = 123;
	public BasicEx() {
		//super()
		this("welcome");
		System.out.println("Default Constructor ");
	}
	public BasicEx(String name) {
		//this();
		System.out.println("Param Constructor " + name);//26
	}
	public void printDate(int result) {
		System.out.println(result+" "+this.result+" "+super.result);//111 111 111  
		Date date = new Date();
		System.out.println("Today's Date : " + date);
		this.m1();
		super.m1();
	}
	@Override
	public void m1() {
		System.out.print("ParentEx overriden m1 method");
	}
	public static void main(String[] args) {
		// classname objname=new constructor();
		BasicEx obj = new BasicEx();
		obj.printDate(111);
	}

}
