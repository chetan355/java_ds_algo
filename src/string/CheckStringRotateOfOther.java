package string;
//A Program to check if strings are rotations of each other or not
public class CheckStringRotateOfOther 
{
	static boolean isRotationOfOtherString(String str1,String str2){
		return (str1.length()==str2.length()&&(str1+str2).indexOf(str2)!=-1);
	}
	public static void main(String[] args) 
	{
		String str1 = "chetan";
		String str2 = "anchet";
		System.out.println(isRotationOfOtherString(str1, str2));
	}

}
