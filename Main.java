package com.gmail.oastro36;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			intList.add(getRandomInt());
		}
		System.out.println("List before removing: " + intList);
		
		intList.remove(0);
		intList.remove(0);
		intList.remove(intList.size() - 1);
		System.out.println("List after removing: " + intList);

	}

	public static int getRandomInt() {
		int gen = (int) (Math.random() * 100);
		return gen;
	}
}
