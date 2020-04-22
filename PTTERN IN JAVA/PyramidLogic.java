import java.util.Scanner;

public class PyramidLogic {

	
	
	public static void main(String args[]) {
		
		
	System.out.println("Enter the number of interation:");
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		
		System.out.println("number of interation:"+n);
		
		 pyramidL(n);
	}

	private static void pyramidL(int n) {
		
		
		
		for (int i=0;i<n;i++) {
			
			
			for(int j=n-1;j>i;j--)
			{
				System.out.print(" ");
			}
			
			
			
			
//			for(int j=0;j<i+1;j++)
//			{
//				
////				A
////				
////				   %
////				  %%
////				 %%%
////				%%%%
//				System.out.print("%");
//				
//				
//			}
//			
			
	
			
			
			
			
//			for(int j=0;j<i;j++)
//			{
//				
////				B
//				System.out.print("%");
//				
////				A+B
////				    %
////				   %%%
////				  %%%%%
////				 %%%%%%%
//			}
//		
			
			
			for(int j=0;j<i+1;j++)
			{
				
				
//				C
				
//				    % 
//				   % % 
//				  % % % 
//				 % % % % 


				System.out.print("% ");
				
				
			}

			
			System.out.println();
		}
		
	
		
	}
}
