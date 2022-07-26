package Day3.pattern;

public class pattern5 {

    public static void main(String args[]){
        int row=8;
        for(int i=0;i<row/2;i++){
            for(int j=(row-i);j>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=row/2+1;i<row;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=row-i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    
}

// for(int i=0;i<row;i++){
//     for(int j=row-i;j>0;j--){
//         System.out.print(" ");
//     }
//     for(int j=0;j<=i;j++){
//         System.out.print("* ");
//     }
//     System.out.println();
