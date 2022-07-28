package Day4;

public class automorphic {
    public static void main(String args[]){
        System.out.println(isAutomorphic(76)?"Automorphic":"Not Automorphic");
        System.out.println(isAutomorphic(25)?"Automorphic":"Not Automorphic");

    }
    static boolean isAutomorphic(int num){
        int square=num*num;
        while(num>0){
            if(num%10 !=square%10)
                return false;

                num=num/10;
                square=square/10;
        }
        return true;
            

        }
    }
    

