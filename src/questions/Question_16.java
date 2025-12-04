package questions;

import java.util.Arrays;

public class Question_16 {

	public static double oldAns = 0;
	public static double[] inputArray;
	
    public static void permute(int[] a, int k) {

    	if (k == a.length){
    		if(a[0] > a[1] && a[3] > a[4]) {
    			doCalculation(a[0], a[1], a[2], a[3], a[4], a[5]);
    			}

    	} 

    	else {
    		for (int i = k; i < a.length; i++) {
    			int temp = a[k];
    			a[k] = a[i];
    			a[i] = temp;
			
    			permute(a, k + 1);
			
    			temp = a[k];
    			a[k] = a[i];
    			a[i] = temp;
			}
		}
    }
    
    private static void doCalculation(double u1, double un, double n, double  v1, double vm, double m) {
    	double answer =  Math.abs(u1 / (1 - Math.pow(un/u1, 1/(n-1) ) )  - v1 / (1 - Math.pow(vm/v1, 1/(m-1) ) ));
    	double [] input = {u1, un, n, v1, vm, m};
    	
    	if(oldAns == 0) {
    		oldAns = answer;
    	}
    	else if(answer > oldAns) {
    		inputArray = input;
    		oldAns = answer;
    	}
    }
    
    public static void main(String args[]) {
    	int[] sequence = {2,3,4,5,6,7};
    	
    	permute(sequence, 0);
    	
    	System.out.println("Answer: " + oldAns);
    	
    	System.out.println("Sequence used: " + Arrays.toString(inputArray));

	    }

}
