package org.interview.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Loops {
	public static void main(String[] args){
		
		
		List<Integer> numbers = Arrays.asList(1,2,3,4);
		/*
		numbers.forEach(new Consumer<Integer>(){
			public void accept(Integer value){
				System.out.print(value);
			}
		});
		
		//simplify
		numbers.forEach((Integer value)-> System.out.println(value));
		
		//simplify
		numbers.forEach(value->System.out.println(value));
		
		//simplify
		numbers.forEach(System.out::println);
		
		//simplify- using stream
		numbers.stream()
				.map(String::valueOf)
				.forEach(System.out::println);
		*/
		
		System.out.println(
		numbers.stream()
				.filter(e -> e%2 == 0)
				.mapToInt(e -> e*2)
				.sum());
		
//		List<Integer> numbersList =
//					numbers.stream()
//							.filter(e -> e%2 == 0)
//							.map(e -> e*2)
//							.collect(toList());
		
		
	}
}
