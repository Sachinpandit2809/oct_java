package oops.constructor;
import java.util.*;

public class Par_Non_par_constructor {
    public static void main(String[] args) {
        Animal cat = new Animal("cat");
        // Animal a  = new Animal()
;        
    }
}

class Animal{
    String name;
    int height;
    // Animal(){
    //     System.out.println("Animal called not paramuterised constructor");
    // }
    Animal(String name){
        this.name = name;
        System.out.println(this.name);
    }
    Animal(int height ){
        this.height = height;
        System.out.println(this.height);
    }
}