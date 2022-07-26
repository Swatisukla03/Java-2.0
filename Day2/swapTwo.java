package Day2;

public class swapTwo {
    public static void main(String args[]){
        double firstNum=12.5;
        double secondNum=13.6;
        System.out.println("First Number is :"+firstNum);
        System.out.println("Second  Number is :"+secondNum);

        double temp=firstNum;
        firstNum=secondNum;
        secondNum=temp;

        System.out.println("After Swapping the two Numbers :");
        System.out.println("First Num:"+firstNum);
        System.out.println("Second Num:"+secondNum);


    }

    
}
