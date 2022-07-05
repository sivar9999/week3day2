package week3.Day2.Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Week 3 day 2 Assignments - 2.3.1
public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Find Second Largest Element
		Integer[] data = { 3, 2, 11, 4, 6, 7 };
		
		//Add the Array to List
		List<Integer> dataToList = new ArrayList<Integer>();
		dataToList.addAll(Arrays.asList(data));
		
		//Find the Size of the List
		int sizeOfList = dataToList.size();
		System.out.println(" The List of Elements Before Sorting : " + dataToList);
		Collections.sort(dataToList);
		
		//Find the Second Largest Element
		System.out.println(" The List of Elements After Sorting : " + dataToList);
		System.out.println(" The Second Largest Number is : " + dataToList.get(sizeOfList - 2));
	}

}
