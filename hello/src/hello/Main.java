package hello;

public class Main {
	/**
	 * Main class of the Java program. 
	 * Implement and test your solutions here.
	 */


	    public static void main(String[] args) {
	     
	        //test your implementations here
	        
			System.out.println(isPrime(4));
			System.out.println(nextPrime(10));
	    }
	    
	    public static boolean isPrime(int n) {
	        //implement your solution here
	       int c=0,i;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
				c++;
					
		}
		if(c==2)
			return true;
		else 
			return false;
	}
		
		


	    
	    public static int nextPrime(int n) {
	        //implement your solution here
	      int c=0,i;
		while(c!=2){
			
		for(i=1;i<=n;i++)
		{
			
			if(n%i==0)
				c++;
					
		}
		
		if(c==2)
			return n;
		else 
			{
			n++;
			c = 0;
			}
		
		}
		
		return n;
		}
	}





