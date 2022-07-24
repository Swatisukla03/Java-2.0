import java.util.Scanner;

public class NoOfPrime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int n = 2;
		while (n <= num) {
			int count = 0;
			boolean flag = true;
			
			int i = 2;
			while(i<=n-1)
			{
				if(n%i==0)
				{
 
					count = 1;
					flag = false;
				}
				i += 1;
            
			}
		 
			if(flag)
			{
				System.out.println(n);
			}
 		 
			n += 1;
		}

	}

}