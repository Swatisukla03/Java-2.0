package Day4;

public class pythogorous {
    public static void main(String args[]){
        int a=13;
        int b=16;
        int c=87;
        int max=a;
        if(b>=max){
            max=b;
        }
        if(c>=max){
            max=c;
        }
        if(max==a){
            boolean flag=((b*b)+(c*c)==(a*a));
            System.out.println(flag);
        }
        else if(max==b){
            boolean flag=((a*a)+(c*c)==(b*b));
            System.out.println(flag);
        }
        else{
            boolean flag=((b*b)+(a*a)==(c*c));
            System.out.println(flag);

        }
    }
    
}
