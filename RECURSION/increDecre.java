package RECURSION;

public class increDecre {


    public static void getIncre(int n){

        if(n==0)
        return;
        getIncre(n-1);
       System.out.println(n);
    

    }

    public static void getDecre(int n){

        if(n==0)
        return;
        
       System.out.println(n);
       getIncre(n-1);
    

    }
    public static void main(String args[]){
        int n=10;
        // System.out.println(n);
        getIncre(n);
        System.out.println("--------------------------------------------------------");
        getDecre(n);
      

    }
    
}
