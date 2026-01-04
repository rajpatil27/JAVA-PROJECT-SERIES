import java.util.*;

class Grade_calculator {
    public static void main (String args[]) {


        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO GRADE CALCULATOR\n");
        
        System.out.println("GRADE SYSTEM");
        System.out.println("A = 100 to 90");
        System.out.println("B = 89 to 80");
        System.out.println("C = 79 to 60");
        System.out.println("D = 59 to 40");
        System.out.println("F = Less than 40");

        System.out.println("ENTER MARKS (0 to 100)");
        int marks = sc.nextInt();

        if(marks < 0 || marks > 100) {
            System.out.println("Invalid Marks");
        } else if(marks >= 90){
            System.out.println("A Grade");
        } else if(marks >= 80){
            System.out.println("B Grade");
        } else if (marks >= 60) {
            System.out.println("C Grade");
        } else if (marks >= 40){
            System.out.println("D Grade");
        } else {
            System.out.println("F Grade");
        }
        

    }

}