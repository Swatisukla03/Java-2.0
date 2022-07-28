package Day3.pattern;

import java.util.PrimitiveIterator.OfDouble;

public class pattern9 {
    public static void main(String args[]){
        int row=3;
        for(int i=0;i<row;i++){
            for(int j=row-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=row;i<2*row;i++){
            for(int j=0;j<2*(row-i)-1;j++){
                System.out.print("p");
            }
            for(int j=2*row+1;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
