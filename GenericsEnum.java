import java.util.ArrayList;

public class GenericsEnum {
    public static void main(String[] args) {
        DAY d = DAY.SAT;
        System.out.println(d);
        int a = 10;
        //Double c = a.doubleValue();
        
    }
    
}

enum DAY{
    S,M,T,W,TH,FR,SAT;

    //enum funtion
    public <T> void hey(){

    }
}


class A{
    //Constructor Generics
    <T> A(T val){
        System.out.println(val);
    }
}
class B{
    public <T> void hey(){
        //method Constructor
    }
}

//Wildcard generics (?)
class C{
    
    void hey(ArrayList<?> list){ // only performing read operation

    }
}


