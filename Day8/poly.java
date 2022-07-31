package Day8;

class bike{
    void run(){
        System.out.println("Average of 35km/hr");

    }
}

class splender extends bike{
    void run(){
        System.out.println("Touches 60km/hr");

    }
}

public class poly {

    public static void main (String args[]){
        bike b=new splender();
        b.run();
    }
    
}
