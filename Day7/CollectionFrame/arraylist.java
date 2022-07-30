package Day7.CollectionFrame;

import java.util.ArrayList;
import java.util.Iterator;

import javax.print.event.PrintJobListener;

public class arraylist {
    public static void main(String args[]){
        ArrayList<String>StuName=new ArrayList<>();
        StuName.add("Swati");
        StuName.add("Riya");
        StuName.add("Ashish");
        StuName.add("Tina");
        // StuName.forEach(System.out::println);
        Iterator itr=StuName.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }       


    }
    
}
