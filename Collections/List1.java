package Collections;
import java.util.*;

public class List1 {
    public static void main(String[] args) {
        List<Integer> l = new LinkedList<>();
        List<Integer> a = new ArrayList<>(); //more Prefered Universallt used Interface(List)
        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(1,2));

        a.add(100); // indexing also works a.get()
        int lenA = a.size();

        for(var t:a2){
            System.out.println(t);
        }
        System.out.println(lenA);

        a.set(0, 9);
        System.out.println(a.get(0));
         


        
    }
    
}
