package com.testmaximum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class TestMaximum <E extends Comparable<E>>{
	
	ArrayList<E> list = new ArrayList<>();
	
	public TestMaximum(E...values) {
		for(E value : values)
			this.list.add(value);
	}
	public E max() {
		return testMax(list);
	}
	
	public static <E extends Comparable<E>> E testMax(ArrayList<E> list) {
		if(list.size() == 0) {
			System.out.println("The list is empty");
			return null;
		}
		else {
			E e = Collections.max(list);
			System.out.println("Max of the inputs : "+e);
	        return e;
		}
	}
}