package Day8;


// class base{

//     void earnings(){
//         System.out.println("Annual income id more than 300000000");
//     }

// }


// class derived extends base{

//     void display(){
//         super.earnings();
//     }

// }
class base{

    base(){
        System.out.println("Base class Constructor");
    }

}


class derived extends base{

    derived(){
        super();
        System.out.println("Derived class Constructor");
    }

}

public class superVar1 {

    public static void main(String args[]){
        derived d=new derived();
        // d1.display();

    }
    
}
