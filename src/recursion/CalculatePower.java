package recursion;

public class CalculatePower {
	static int stepCounter = 0;
	static int power(int n,int p) {
		stepCounter++;
		if(p==0) {
			return 1;
		}
		if(p%2==0) {
			return power(n*n , p/2);
		}		
		return n * power(n,p-1);		
	}
	public static void main(String[] args) {
		System.out.println(power(2,10)+" "+stepCounter);

	}

}
