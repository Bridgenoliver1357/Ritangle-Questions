package questions;

public class Question_17 {

	public static void main(String[] args) {
		
		float p, pTemp;
		float q, qTemp;
		float r, rTemp;
		float temp;
		float validCounter = 0;
		float totalCounter = 0;
		
		for (p = 1; p<7; p++) {
			for (q = 1; q<7; q++) {
				for (r = 1; r<7; r++) {
					temp = p + q + r;
					temp = 180 / temp;
					pTemp = temp * p;
					qTemp = temp * q;
					rTemp = temp * r;
					if(pTemp > 90 || qTemp > 90 || rTemp > 90) {
						validCounter++;
					}
					totalCounter++;
				}
			}
		}

		System.out.println(validCounter / totalCounter);

	}

}
