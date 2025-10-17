import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        ArrayList _ = new ArrayList();
        //Not type safe 
        //we can store any type of element
        //no compile time checking

        //so now Generics were introduced to make it type safe for the implementation
        ArrayList <Integer> i = new ArrayList<>();
        //Compile time checking
    }
}

class A{
    private Object obj;

    void setVal(Object o){
        this.obj = o;

    }
    
    Object getVal(){
        return obj;
    }
}

class B<T>{
    private T value;
    void setVal(T val){
        this.value = val;
    }

    T getVal(){
        return value;
    }

}

interface InnerGenerics<T>{
    public void set(T val);
    public T get();    
}

class C<T> implements InnerGenerics<T>{
    @Override
    public void set(T val){

    }
    T val;

    @Override
    public T get(){
        return val;

    }

}


//Bounded Type Parameter (use Conditions)
class D <T extends Number>{//we have put the boundation
    T hey;
}
//now this class only extends with Number Data types

// Class E <T extends class & interfaces> {} //convention


