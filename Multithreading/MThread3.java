package Multithreading;
public class MThread3 {
    public static void main(String[] args) {
        try{
            System.out.print("Executing");
            for(int i=0;i<5;i++){
                Thread.sleep(500);
                System.out.print(".");
            }
            System.out.println();
            Thread.sleep(2000);
            Thread t = Thread.currentThread();
            t.setName("Ravi");
            System.out.println(t);
        }
        catch(Exception e){
            System.out.println("Exception: "+e);

        }
    }
    
}
