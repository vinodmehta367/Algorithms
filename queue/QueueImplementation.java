package com.kunalkushwaha.queue;

import java.util.Arrays;

public class QueueImplementation {
	public static void main(String[] args) {
		int size = 5;
		int concatCount = 3;
		int[] arr = new int[size];
		arr[0] = 1;
		arr[1] = 31;
		arr[2] = 10;
		arr[3] = 18;
		arr[4] = 15;

		int[] bigArr = new int[size * concatCount];

		for (int i = 0; i < concatCount; i++) {
			for (int j = 0; j < size; j++) {
				bigArr[size * i + j] = arr[j];
			}
		}
		System.out.println("unsorted Array:");
		for (int j = 0; j < bigArr.length; j++) {
			System.out.print(bigArr[j] + "->");
		}

		Arrays.sort(bigArr);
		System.out.println("Sorted Array: ");
		for (int a : bigArr) {
			System.out.print(a + "->");
		}

		int k = 3;
		int[] elementAtIndex = new int[k];
		int[] finalArr = new int[k];
		elementAtIndex[0] = 3;
		elementAtIndex[1] = 7;
		elementAtIndex[2] = 13;

		for (int j = 0; j < k; j++) {
			finalArr[j] = bigArr[elementAtIndex[j]];
		}
		System.out.println("The final output Array:");
		for (int a : finalArr) {
			System.out.print(a + "->");
		}
	}
}
