public class MThread2 extends Thread {
    
    @Override
    public void run(){
        System.out.println("hello");
        try{
            Thread.sleep(10000); // it it necessary to handle the sleep method
        }
        catch(Exception e){


        }

    }
    public static void main(String[] args) throws Exception{
        MThread2 o = new MThread2();
        System.out.println(o.getState());
        o.start();
        System.out.println(o.getState());
        Thread.sleep(100);
        System.out.println(o.getState());
        o.join();
        System.out.println(o.getState());
        A t=hey();
        t.join();

    }
    static A hey(){
        A t = new A();
        t.start();
        //run by JVM 
        return t;
    }

    
}


//when to use runnable Interface and when to use Thread class

class A extends Thread{

    @Override
    public void run(){

    }


}


class B extends A implements Runnable{ // here A is base class here we can't use Thread or extends thread because java doesnot support multiple inheritance thatswhy we use Runnable interface
// but now we have to Override the Run method and it is necessary as Runnable is abstract 
@Override
public void run(){

}

}

// on other conditions we can use either T or R




