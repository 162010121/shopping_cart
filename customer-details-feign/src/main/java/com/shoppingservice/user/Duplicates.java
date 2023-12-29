package com.shoppingservice.user;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicates {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,7,9,2,3);
//		List<Integer> dups = nums.stream().collect(Collectors.groupingBy(Function.identity(),
//				Collectors.counting())).entrySet().stream().filter(ent-> ent.getValue()>1).map(ent -> ent.getKey()).collect(Collectors.toList());
//		System.out.println(dups);
		
		Set<Integer> set=new HashSet<>();
		
		List<Integer> duplicates=nums.stream().filter(num -> !set.add(num)).collect(Collectors.toList());
		System.out.println(duplicates);
	}

}
