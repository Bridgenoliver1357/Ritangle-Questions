package questions;

import java.util.HashSet;
import java.util.Set;

public class Question_13 {


	public static void main(String[] args) {
		
		String aS, bS, cS;
		String conString;
		
		int counter = 0;
		
		Set<Character> uniqueDigit = new HashSet<>();
		
		for (int a = 0; a < 100; a++) {
			for (int b = 0; b < 60; b++) {
				for (int c = 0; c < 60; c++) {
					if (a < 10) {
						aS = String.format("%02d", a);
					}
					else {
						aS = Integer.toString(a);
					}
					
					if (b < 10) {
						bS = String.format("%02d", b);
					}
					else {
						bS = Integer.toString(b);
					}
					
					if (c < 10) {
						cS = String.format("%02d", c);
					}
					else {
						cS = Integer.toString(c);
					}
					conString = aS + bS + cS;
					for (char digit : conString.toCharArray()) {
						uniqueDigit.add(digit);
					}
					if(uniqueDigit.size() == 2) {
						counter++;
						uniqueDigit.clear();
					}
					uniqueDigit.clear();
				}
			}
		}
		
		System.out.println(counter);

	}
	
	
	

}
