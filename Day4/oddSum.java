package Day4;

public class oddSum {
    public static void main(String args[]){
        int num=10;
        int sum=0;
        for(int i=1;i<=num;i++){
            if(i%2!=0){
                // sum+=i;
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println(sum);
    }
    
}
