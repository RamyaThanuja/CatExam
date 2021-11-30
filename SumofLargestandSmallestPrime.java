package CatExam;
public class SumofLargestandSmallestPrime{
	public static void main(String args[]) {
	        int count, sum = 0, p = 0;
	        for (int number = 1; number <= 50; number++) {
	            count = 0;
	            for (int i = 2; i <= number / 2; i++) {
	                if (number % i == 0) {
	                    count++;
	                    break;
	                }
	            }
	 
	            if (count == 0) {
	                if (number > 1 && number < 50) {
	                    //System.out.println(number);
	                    p = number;
	                    p = p - 97;
	 
	                }
	 
	            }
	        }
	         System.out.println("Therefore The value of primes is : " +p);
	    }
	}