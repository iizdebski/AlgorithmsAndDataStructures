package com.company;

import java.util.Arrays;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
	int[] intArray = new int[7];

	intArray[0] = 20;
	intArray[1] = 35;
	intArray[2] = -15;
	intArray[3] = 7;
	intArray[4] = 55;
	intArray[5] = 1;
	intArray[6] = -22;

	/*
	for (int i = 0; i < intArray.length; i++) {
        System.out.println(intArray[i]);
    }
	  Arrays.stream(intArray).forEach(System.out::println);
	 */

		int index = -1;
		for (int i = 0; i < intArray.length; i++){
			if (intArray[i] == 7){
				index = i;
				break;
			}
		}
		System.out.println("index = " + index);
    }
}

// constant time complexity O(1)