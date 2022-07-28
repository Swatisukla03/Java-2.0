package Day4;

import javax.xml.transform.stream.StreamSource;

public class RotateNum {
    public static void main(String args[]){
        int n=45689;
        int k=2;
        int div=1;
        int mul=1;
        int temp=n;
        int nod=0;
        while(temp>0){
            temp=temp/10;
            nod++;
        }

        for(int i=1;i<=nod;i++){
            if(i<=k)
                 div=div*10;
            
            else
            mul=mul*10;
            
        }
        int q=n/div;
        int rem=n%div;
        int new_num=rem*mul+q;
        System.out.println(new_num);

    }
    
}
