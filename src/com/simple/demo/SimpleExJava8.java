package com.simple.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleExJava8 {
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,5,3,6,8);
		List<Integer> n=numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(n);
	}

}
