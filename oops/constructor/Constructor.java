package oops.constructor;

public class Constructor {
     public static void main(String[] args) {
        StudentDetails s = new StudentDetails("sachin");
     }
}

class StudentDetails{
    String name;
    int roll;
    StudentDetails(String name){
        this.name = name;
        System.out.println(this.name);

    }

}