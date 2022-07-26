package Day2;

import java.util.Scanner;

public class size {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size :");
        int num=sc.nextInt();
        String size;
        switch(num){
            case 29:
            size="Small";
            break;


            case 42:
            size="Medium";
            break;


            case 44:
            size="Large";
            break;



            case 48:
            size="Extra Large";
            break;

            default:
            size="Unknown Size";
            break;
        }
        System.out.println("Size is :" +size);
    }
    
}
