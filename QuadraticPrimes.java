import java.lang.Math;

public class QuadraticPrimes {
	
	public static void main(String[] args) {	
		int testN = 0;
        int highestA = 0;
        int highestB = 0;
        int highestN = 0;
        
        for(int a = -1000; a < 1000; a++) {
            for(int b = -1000; b < 1000; b++) {
                while(true) {
                    if(((testN * testN) + (a * testN) + b) < 1) {
                        testN = 0;
                        break;
                    }
                    if(checkPrime((testN * testN) + (a * testN) + b)) {
                        testN++;
                    }
                    else {
                        if(testN > highestN) {
                            highestA = a;
                            highestB = b;
                            highestN = testN;
                        }
                        testN = 0;
                        break;
                    }
                }
            }
        }
        System.out.println(highestA + " " + highestB + " " + highestN);
        System.out.println(highestA * highestB);
	}
	
	private static boolean checkPrime(int checkNum) {
	    int i = 2;
	    double maxCheck;
	    
	    maxCheck = Math.sqrt((double) checkNum);
	    
	    while(i <= maxCheck) {
	        if(checkNum % i == 0) {
	            return false;
	        }
	        i++;
	    }
	    return true;
	}
}
