package com.in28minutes.mockito.mockitodemo;

public class SomeBusinessImpl {
	private DataService dataService;
	
	int findTheGreatestFromAllData() {
		int max = Integer.MIN_VALUE;
		int[] data = dataService.retrieveAllData();
		for(int val : data) {
			if(val > max) {
				max = val;
			}
		}
		return max;
	}
}
