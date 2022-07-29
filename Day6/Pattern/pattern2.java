package Day6.Pattern;

public class pattern2 {
    public static void main(String args[]){
        int n=5;
        int row=1;
        int nst=n;
        while(row<=n){
            int cst=1;
            while(cst<=nst){
                System.out.print("* ");
                cst++;
            }
            nst--;
            row++;
            System.out.println();
        }
    }
    
}
