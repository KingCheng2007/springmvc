package com.solomon.utils;

public class Printer {

	private int count = 0;
	public void print(String type){
		System.out.println(type+" printer: "+count++);
	}
}
