import java.util.Scanner;

public class Grades {
    public static void main(String args[]){
        System.out.println("Enter the marks :");
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>=90){
            System.out.println("A");
        }
        else if(marks>=80){
            System.out.println("B");

        }
        else if(marks>=70){
            System.out.println("C");
        }
        else if(marks>=60){
            System.out.println("D");
        }
        else{
            System.out.println("Poor Performance");
        }
    }
    
}
