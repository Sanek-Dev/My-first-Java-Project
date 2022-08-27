package com.sanek228.utils;
import com.sanek228.execs.*;
import java.io.*;
public class Console {
	public static void log(String text) {
    System.out.println(text);
	}

	
  
  public static float calc(int num1,char method,int num2) {
		float result;
		switch(method) {
			case '+':
				result = num1+num2;
				break;
			case '-':
				result = num1-num2;
				break;
			case '*':
				result = num1*num2;
				break;
			case '/':
				result = num1/num2;
				break;
			default:
				result = 0;
				break;
		};

		return result;
	}
  public static void print(String text) {
		System.out.print(text);
	}
}