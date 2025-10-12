public class MThread2 extends Thread {
    public void run(){

    }
    public static void main(String[] args) throws Exception{
        MThread2 o = new MThread2();
        System.out.println(o.getState());
        o.start();
        System.out.println(o.getState());
        // System.out.println(Thread.currentThread().getState());
        Thread.sleep(100);
        
    }

    
}
