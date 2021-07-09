package basic;

public class Armstrong 
{
	static boolean isArmstrong(int num)
	{
		int temp,res=0,rem;
		temp = num;
		while(temp>0) {
			rem = temp % 10;
			res = res + rem*rem*rem;
			temp = temp/10;
		}
		if(res==num)
			return true;
		return false;		
	}
	public static void main(String[] args) {
		Armstrong ar = new Armstrong();
		System.out.println(ar.isArmstrong(153));
	}

}

