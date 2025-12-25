package OOPS;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@SuppressWarnings("all")
//can be added to any thing in java
public class Annotat1 {
    public static void main(String[] args) {
        Cat c = new Cat();
        if(c.getClass().isAnnotationPresent(CustomAnnotation.class)){
            System.out.println("It is My custom annotation");
        }
        else{
            System.out.println("not Custom Annotation");
        }
        System.out.println(c.getClass());

        Dog d = new Dog();
        System.out.println(d.getClass().getDeclaredMethods());

        for(Method m : d.getClass().getDeclaredMethods()){
            if(m.isAnnotationPresent(CustomAnnotation.class)){
                System.out.println("Method "+ m.getName()+ " Annotation Is present");
            }
            else{
                System.out.println(m.getName() + " Is not Annotated");
            }

        }
    }
    
}

@CustomAnnotation
class Cat{

}

class Dog{

    @CustomAnnotation
    void hey(){

    }
    void b(){

    }

}

// @Target(ElementType.TYPE//for classes) //specy on which type of element it should be valid
// @Target(ElementType.METHOD) for Method


@Retention(RetentionPolicy.RUNTIME) //it tells java to keep this anno while running the program
@interface CustomAnnotation{
    

}

@interface MethodMy{
    int times() default 1;//specified like funtion but taken as variable it return the value we pass in
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface AnnoField{
    

}
