package arrays;
/*
 1
 11
 12
 1121
 122111  
 */
public class LogicQueProblem1 {

	public static void main(String[] args) {
		int ans = 1;
		int prev_count = 0;
		int curr_count = 0;
		for(int i = 0; i < 5; i++) {
			prev_count = curr_count;
			curr_count = 0;			
			for(int j = 0; j <= i; j++) {
				System.out.print(ans+" ");
				if(prev_count>0)
					System.out.print(prev_count+" ");
				curr_count++;
			}
			System.out.println();
		}
	}

}
