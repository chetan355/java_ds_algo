package string;

public class DuplicateCharInString {
	
	// Another logic for find duplicate chars:
	public static void findDuplicates(String str) {
		String characters = "";
		String duplicates = "";
		for(int i = 0; i < str.length(); i++) 
		{
			String sent = Character.toString(str.charAt(i));
			
			if(characters.contains(sent)) 
			{
				if(!duplicates.contains(sent))
					duplicates+=sent;
			}
			
			characters += str.charAt(i);
			
		}
		for(int i = 0; i < duplicates.length(); i++) {
			System.out.println(duplicates.charAt(i));
		}
	}
	
	
	
	
	
	public static final int NO_OF_CHAR = 256;
	public static void duplicateCharCount(String str, int []count) 
	{
		for(int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]= count[str.charAt(i)] + 1;
		}
	}
	public static void printDuplicateChar(String str) {
		int count[] = new int[NO_OF_CHAR];
		duplicateCharCount(str, count);
		for(int i = 0; i < NO_OF_CHAR; i++) {
			if(count[i]>1) {
				System.out.println((char)i);
			}
		}		
	}

	public static void main(String[] args) 
	{
//		printDuplicateChar("geeksforgeeks");
		findDuplicates("geeksforgeeks");
		
	}

}
