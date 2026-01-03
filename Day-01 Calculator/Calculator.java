import java.util.*;

class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Simple Calculator");

        System.out.println("Select Operation");
        System.out.println("1 : Addition");
        System.out.println("2 : Subtraction");
        System.out.println("3 : Multiplication");
        System.out.println("4 : Division");
        System.out.println("5 : Modulo");

        int Operation = sc.nextInt();

        System.out.println("Input first number");
        int a = sc.nextInt();

        System.out.println("Input second number");
        int b = sc.nextInt();


        switch(Operation){

            case 1 : System.out.println("Result = " + (a + b));
            break;

            case 2 : System.out.println("Result = " + (a - b));
            break;

            case 3 : System.out.println("Result = " + (a * b));
            break;

            case 4 : if(b != 0){
                System.out.println("Result = " + (a / b));
            } else 
                System.out.println("Division by zero not possible");
            break;

            case 5 : if(a != 0){
                System.out.println("Result = " + (a % b));
            } else 
                System.out.println("Modulo by zero not possible");
            break;

            default : System.out.println("INVALID CHOICE");
            

        }

    }

}

