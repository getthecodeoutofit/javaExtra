package Collections;
import java.util.*;

public class List1 {
    public static void main(String[] args) {

        List<Integer> l = new LinkedList<>(); //each node is created dynamically  unlike arraylist having intial capacity
        //Double linked list



        List<Integer> a = new ArrayList<>(); //more Prefered Universallt used Interface(List)
        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(1,2)); //provide the initial capacity to the array when it fill it create another array and transfer it to another which laterer cause the overhead
        //stored in heap, logically contiguous but not physically it a array of references which refers to the integer at any specific location
        // obj-> [ref1][ref2][ref3]

        a.add(100); // indexing also works a.get()
        int lenA = a.size();

        for(var t:a2){
            System.out.println(t);
        }
        System.out.println(lenA);

        a.set(0, 9);
        System.out.println(a.get(0));

        l.add(10);


         


        
    }
    
}
