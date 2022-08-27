package com.sanek228.utils;

public class Env {
	String result;

	public String getEnv(String name) {
		result = System.getenv(name);
    return result;
	}
}