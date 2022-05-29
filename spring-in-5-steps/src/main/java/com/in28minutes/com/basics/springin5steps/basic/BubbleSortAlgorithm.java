package com.in28minutes.com.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm{
	public int[] sort(int[] numbers) {
		// Logic for Bubble Sort
		return numbers;
	}
}
