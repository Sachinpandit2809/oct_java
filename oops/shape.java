package oops;
public class shape
{
    public static void main(String[] args) {
        
    }
}


// class Automobile{
//     // private String drive() {
//     //     return"Driving vehicle";
//     // }
//     protected String drive() {
//         return"Driving vehicle";
//     }
// }
// class Car extends Automobile{
//     protected String drive() {
//         return"Driving car";
//     }
// }
//     public class ElectricCar extends Car{
//         @Override public final String drive() {
//             return"Driving electric car";
//         }
//         public static void main(String[]wheels) {
//             final Automobile car =new ElectricCar();
//             System.out.print(car.drive());}
//         }
        

///////////////////////////////////////////////////////
/// 

 class Shape{
    protected void display(){
        System.out.println("Display- base");

    }
}

// Circle.java
 class Circle extends Shape{
    // public  void display(){
    //     System.out.println("Display- derived");

    // }
    protected  void display(){
        System.out.println("Display- derived");

    }

}