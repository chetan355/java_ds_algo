package string;

public class SplittingBinaryString {

	public static void main(String[] args) 
	{
		int count=0;
		String str = "0100110101";
		int zero_count=0;
		int one_count=0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='0') {
				zero_count++;				
			}else
				one_count++;
			if(zero_count==one_count)
				count++;
		}
		System.out.println(count);
	}

}
