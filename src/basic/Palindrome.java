package basic;

public class Palindrome {
	private static boolean isPalindome(int num){
		
		int temp,res=0;
		temp = num;
		while(temp!=0) {			
			res = res*10 + temp % 10;
			temp = temp / 10;
		}
		if(res==num)
			return true;
		return false;
	}
	public static void main(String[] args) 
	{
		Palindrome p = new Palindrome();
		System.out.println(isPalindome(121));
	}

}
