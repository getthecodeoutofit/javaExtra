public class MThread2 extends Thread {
    
    @Override
    public void run(){
        System.out.println("hello");
        try{
            Thread.sleep(10000);
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
    }

    
}
