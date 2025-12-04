package questions;

import java.util.Random;

public class Question_19 {
	
	public static int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,	73, 79, 83, 89, 97};

	public static void main(String[] args) {
		
		Random randIndex = new Random();
		
		
		double matchCount = 0;
		
		
		for (int i = 0; i < 10000000; i++) {
			int P = P(randIndex);
			int E = E(randIndex);
			
			int PSequence = 0;
			for (int j = 1000 * E; j > 0; j -= P) {
				if (j == 1000 * E) {
					PSequence = P;
				}
				if (j == PSequence) {
					//System.out.println(PSequence + " " + j);
					//System.out.println(P + " " + E);
					matchCount++;
					//System.out.println(matchCount);
					break;
				}
				else {
					//System.out.println(PSequence + " " + j);
					PSequence = PSequence + E;
				}
			}
		}
		
		System.out.println(matchCount / (double) 10000000);
		
	}
	
	
	public static int P(Random randIndex) {
		return primes[randIndex.nextInt(0, 25)];
	}
	
	public static int E(Random randNum) {
		return 2 * randNum.nextInt(1, 50);
	}

}
