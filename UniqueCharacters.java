package week3.Day2.Assignments;


import java.util.HashSet;
import java.util.Set;

//Week 3 Day2 Assignments - 4 
public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Babu";
		String formatText = text.toLowerCase();

		// convert to Charcater Array
		char[] storeChar = formatText.toCharArray();

		// Add to set to remove duplicates
		Set<Character> name = new HashSet<Character>();
		for (int i = 0; i < storeChar.length; i++) {
			if (name.add(storeChar[i]))	;	
		}
		// Print the Set without Duplicates
		System.out.println("The Unique Character present in Set : " + name);
	}
}
