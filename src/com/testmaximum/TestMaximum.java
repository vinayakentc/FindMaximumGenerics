package com.testmaximum;

import java.util.ArrayList;
import java.util.Collections;

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
		if(list.size() == 0)
			return null;
		else
	        return Collections.max(list);
	}
}