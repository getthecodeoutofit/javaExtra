package Basics;
import java.util.Arrays;
import java.util.Scanner;

public class Strings{

    void checkReference(String a,String b){
        if(a==b){
            System.out.println("same");
        }
        else{
            System.out.println("different Pool");
        }

    }

    void checkEqualMethod(String a,String b){
        
        if(a.equals(b)){
            System.out.println("same Data ");
        }
        else{
            System.out.println("Different Data");
        }
    }


    @SuppressWarnings("all")
    public static void main(String[] args) {
        int i = 10;
        String name = "Ravi"; // stored in string pool in heap memory
        System.out.println(name);
        String a  = new String("ravi");
        String b = new String("ravi");

        Integer e = 10;
        Scanner s = new Scanner(System.in);
        // int data = s.nextInt();
        System.out.println(Arrays.toString(new int[]{1,2,3,4}));
        s.close();
        char chS[] = a.toCharArray();
        System.out.println(Arrays.toString(chS));


        //for concatination-> the charater get calculated as ASCII value, String will Get concatinated as it is
        // If we add int with String the integer will converted into wrapper class and .toString method will be used and it will be concatinated with string

        // . stripe() use to remove extra space, string.split(from)

        StringBuilder sb = new StringBuilder();
        sb.append('a');
                
    }
}