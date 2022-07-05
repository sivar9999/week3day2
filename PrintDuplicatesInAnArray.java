package week3.Day2.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Week3 Day2 Assignments - 2.3.3
public class PrintDuplicatesInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Given Array 
		Integer[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int c;
		
		//Add Array to List
		List<Integer> dupList = new ArrayList<Integer>();
		dupList.addAll(Arrays.asList(arr));
		Collections.sort(dupList);
		System.out.println("The Given Element Present in the List : " + dupList);
		
		//Find The Duplicate element in the List
		for (int j = 0; j < dupList.size(); j++) {
			c = 0;
			for (int k = j + 1; k < dupList.size(); k++) {
				if (dupList.get(j) == dupList.get(k)) {
					c++;
				}
			}
			//Print the Duplicate Element
			if (c > 0) {
				System.out.println(dupList.get(j));
			}
		}
	}
}
