package com.in28minutes.com.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{
	public int[] sort(int[] numbers) {
		// Logic for Bubble Sort
		return numbers;
	}

}
