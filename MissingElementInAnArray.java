package week3.Day2.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Week 3 Day 2  Assignments - 2.3.2
public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Find the Missing Element Using List
		Integer[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		
		//Add Array to List
		List<Integer> arrToList = new ArrayList<Integer>();
		arrToList.addAll(Arrays.asList(arr));
		Collections.sort(arrToList);
		System.out.println("The Given Numbers in the List : " + arrToList);
		
		//Find the Missing Number in the List
		for (int j1 = 0; j1 < arrToList.size(); j1++) {
			if (arrToList.get(j1) != j1 + 1) {
				System.out.println("The Missing Number in the List : " + (j1 + 1));
				break;
			}
		}
	}
}
