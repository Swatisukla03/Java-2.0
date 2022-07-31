package Day8;


class animal{
    protected String name;
    protected void display(){
        System.out.println("I am an Animal.");
    }
}


class dog extends animal{
    public void getInfo(){
        System.out.println("My name is "+ name);
    }
}

 class protect {
    public static void main(String args[]){
        dog d1=new dog();
        d1.name="Sweety";
        d1.display();
        d1.getInfo();

    }
    
}
