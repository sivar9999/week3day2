package week3.Day2.Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

// Week 3 Day 2 Assignments - 2.1
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Given String
		String givenText = "We learn java basics as part of java sessions in java week1";

		// Split the String and Store into String Array
		String[] splitText = givenText.split(" ");

		// Create Set to remove Duplicates
		Set<String> addToSet = new LinkedHashSet<String>();
		
		//addToSet.addAll(Arrays.asList(splitText));

		// Add the String Array into Set
		for (int j = 0; j < splitText.length; j++) {

			if (addToSet.add(splitText[j])) {
				System.out.print(splitText[j] + " ");
			}
		//System.out.println(addToSet);
		}
	}
}
