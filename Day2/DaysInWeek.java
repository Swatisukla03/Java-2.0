package Day2;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int no_of_days=sc.nextInt();
        String days;

        switch(no_of_days){
            case 1:
            days="Monday";
            break;
            case 2:
            days="Tuesday";
            break;

            case 3:
            days="Wednesday";
            break;

            case 4:
            days="Thursday";
            break;

            case 5:
            days="Friday";
            break;

            case 6:
            days="Saturday";
            break;

            case 7:
            days="Sunday";
            break;

            default:
            days="Invalid Day";
            break;
        }
        System.out.println("Days are:"+days);
    }
    
}
