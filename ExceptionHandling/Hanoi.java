package ExceptionHandling;

public class Hanoi {
    

    

        public static void toh(int N, int from, int to, int aux) {
            if(N==0)
            return;
            
            toh(N-1,from,aux,to);
            System.out.println("move disk"+N+ "from rod" +from+ " to rod "+aux);
            toh(N-1,aux,to,from);
            // Your code here
        }

        public static void main(String args[]){
            int n=4;
            int t1=10;
            int t2=11;
            int t3=12;
            toh(n,t1,t2,t3);
            
        }
    
    
}

    

