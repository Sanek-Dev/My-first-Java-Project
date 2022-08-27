package com.sanek228.utils;
public class Test {
	enum Size { SMALL('A'), MEDIUM('B'), BIG('C');
		char cl;
		Size(char cl) {
      this.cl = cl;
		}
	};

	public char getClass(String cls) {
		Size size = Size.MEDIUM;
		char cl = size.cl;
		return cl;
	}
}