package Day4;

public class primeFactor {
    public static void main(String args[]) {
        int n = 315;
        while(n%2==0){
            System.out.println(2+" ");
            n/=2;
        }
        for(int i=3;i<=Math.sqrt(n);i+=2){
            while(n%i==0){
                System.out.println(i);
                n/=i;
            }
        }
        while(n>2){
            System.out.println(n);
        }

    }
}
