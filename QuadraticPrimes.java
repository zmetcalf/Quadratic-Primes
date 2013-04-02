import java.lang.Math;

public class QuadraticPrimes {
	
	public static void main(String[] args) {
		int test = 0;
		for(int n = 0; n < 39; n++) {
		    test = ((n * n) +3 * n + 41);
		    if(checkPrime(test)) {
		        System.out.println("This is prime " + test);
		    }
		    else {
		        System.out.println("This is not prime " + test);
		    }
		}
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
