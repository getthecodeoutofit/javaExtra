package OOPS;

//Runtime exception are unchecked exception 
public class EHandling2 {

    public static void main(String[] args) throws AgeException{
        funtionAge(0);
        
    }
    
    private static void funtionAge(int a) throws AgeException{
        if (a<=0){
            try{
                div(1,0);

            }
            catch (Exception e){

                throw new AgeException("Age exception caused by :",e);
            }

        }
        System.out.println("accepted");
    
    }
    private static void div(int a ,int b) throws ArithmeticException{
        int ans = a/b;
        System.out.println("The ans is "+ ans);
    }
}
class AgeException extends Exception{
    public AgeException(){}

    public AgeException(String m){
        super(m);
    }
    //throwable as parameter
    //exception caused due to another exception
    public AgeException(String s,Throwable c){
        super(s,c);
    }

}



