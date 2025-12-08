package Multithreading;
class MThread{
    public static void main(String []arg){
        A aobj = new A();
        B bobj = new B();
        Thread t = new Thread(bobj);
        aobj.start();
        t.start();
        
        
    } 
}


class A extends Thread{
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello ");
        }     
    }
    
    
}

class B implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<190;i++){
            System.out.println("world");
        }
        
    }
    
}