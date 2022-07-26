package Day3.pattern;

public class pattern2 {
    public static void main(String args[]){
        int n = 5;
		
		int nst = 5;
		int row = 1;
		
		while(row <= n)
		{
		
			int cst = 1;
			
			while(cst <= nst)
			{
				if(row == 1 || row == n || cst == 1|| cst == nst)
//				if(cst == row || cst + row == n+1)
				System.out.print("* ");
				else
				{
					System.out.print("  ");
				}
				cst+=1;
			}
			
			row += 1;
			System.out.println();
		}
    }
    
}
