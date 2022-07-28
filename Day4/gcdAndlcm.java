package Day4;

public class gcdAndlcm {
    public static void main(String args[]){
        int n1=48;
        int n2=2;
        int num1=n1;
        int num2=n2;
        while(n1%n2 !=0){
            int rem=n1%n2;
            n2=rem;
            n1=n2;
        }
        int gcd=n2;
        int lcm=(num1*num2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
    
}
