package Day6.Pattern;

public class pattern1 {
    public static void main (String args[]){
        int n=5;
        int nst=5;
        int row=1;
        while(row<=n){
            int cst=1;
            while(cst<=nst){
                if(row==1 || row==n || cst==1 ||cst==nst)
                System.out.print("* ");
                else{
                    System.out.print("  ");
                }
                cst++;
            }
            row++;
            System.out.println();
        }
    }
    
}
