package week3.Day2.Assignments;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

//Week3 Day2 Assignments - 2.2
public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Given Arrays
		Integer[] array1 = { 3, 2, 11, 4, 6, 7 };
		Integer[] array2 = { 1, 2, 8, 4, 9, 7 };

		//Add Array1 to Set 
		Set<Integer> set1 = new TreeSet<Integer>();
		set1.addAll(Arrays.asList(array1));
		System.out.println("First Array : " + set1);

		//Add Array2 to Set 
		Set<Integer> set2 = new TreeSet<Integer>();
		set2.addAll(Arrays.asList(array2));
		System.out.println("Second Array : " + set2);
		
		//Intersection of Two Arrays
		set1.retainAll(set2);
		System.out.println("Intersection of two Arrays : " + set1);
	}
}
