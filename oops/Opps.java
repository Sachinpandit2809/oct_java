package oops;

public class Opps {
    //  
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.pointSize =2;
        System.out.println(p1.pointSize);
    }
}

class Pen{
    String name;
    int pointSize;
    void setPenName(String newName){
        name = newName;
    }
    void setPenSize(int size){
        pointSize = size;
    }

}
class Student{
    int roll;
    String name;
    double marks;

    void calculateMarks(int phy, int chem, int math){
        marks = (phy+chem+ math )/3;
    }
    
}

