package OOPS;
import java.util.Objects;
@SuppressWarnings("all")
public class Rec {
    public static void main(String[] args) {
        EmpRec e = new EmpRec("ABC", 0);
        System.out.println(e.hashCode());

        testRecord t = new testRecord("PQR",1);
        System.out.println(t.hashCode());

    }

    
}
//immutable by default so no Setter method
//intead of making complete class having getter setter for the normal data we can make Record instead


record EmpRec(String name,int id){//canonical Constructor(automatically generated)
    //no class inheritance allowed bit inferface can

    //we can create the instance method
    //No non static instance field
    public String nmupper(){
        return name.toUpperCase();
    }

    static void printSome(){ //associate with the class itself instead of the instance;
        System.out.println("hey");

    }

}

class testRecord{
   
    
    private int id;
    private String name;
    testRecord(){

    }
    testRecord(String name,int id){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return this.getClass()+"{id ="+id+" name="+name+" }";

    }
    @Override
    public int hashCode(){
        return Objects.hash(name,id);

    }



}
