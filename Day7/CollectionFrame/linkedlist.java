package Day7.CollectionFrame;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {
    public static void main(String args[]){
        LinkedList<String>al=new LinkedList<>();
        al.add("gtjk");
        al.add("gtjk");
        al.add("gtjk");
        al.add("gtjk");
        al.add("gtjk");
        Iterator<String>itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
    
}
