package com.sanek228.utils;
public class Mathem {
  float[] nums = new float[2];
	public Mathem(float num1, float num2) {
		this.nums[0] = num1;
		this.nums[1] = num2;
	}
	float result;
	public float plus() {
		result = nums[0] + nums[1];
		return result;
	}
	public float minus() {
		result = nums[0] - nums[1];
		return result;
	}
	public float mult() {
		result = nums[0] * nums[1];
		return result;
	}
	public float del() {
		result = nums[0] / nums[1];
		return result;
	}
	
}