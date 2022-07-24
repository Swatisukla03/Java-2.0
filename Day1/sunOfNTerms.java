import java.util.Scanner;

public class sunOfNTerms {
    public static void main(String args[]){
        System.out.println("Hi");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n){
            sum=sum+i;
            i++;

        }
        System.out.println(sum);
        System.out.println("Bye");
    }
    
}
