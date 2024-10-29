package basic_functions;

import java.util.Scanner;

public class parameterised_function {
    public static int addTwoNum(int a , int  b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first numbers");
        int a  =  sc.nextInt();
        System.out.println("enter second numbers");
        int b = sc.nextInt();
        int sum = addTwoNum(a,b);
        System.out.println("the sum of two numbers is - " + sum);
sc.close();        
    }
}
