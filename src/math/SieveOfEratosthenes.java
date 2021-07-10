package math;

import java.util.Arrays;

// if I wanna to find prime numbers from 1 to n then no need to 
// check for each element for the range. Sieve of Eratosthenes this algorithm
// will give solution.
public class SieveOfEratosthenes {

	public static void main(String[] args) {
		boolean primeArr[] = primeCheck(15);
		for(int i = 0; i < primeArr.length;i++) {
			System.out.println(i+" "+primeArr[i]);
		}
	}
	static boolean[] primeCheck(int n) {
		boolean isPrime[] = new boolean[n+1];
		Arrays.fill(isPrime, true);
		isPrime[0]=false;
		isPrime[1]=false;
		for(int i = 2; i*i <= n; i++)
		{
			for(int j=2*i; j <= n; j+=i) {
				isPrime[j]=false;
			}
		}
		return isPrime;
	}

}
