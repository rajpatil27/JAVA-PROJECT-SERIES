import java.util.*;
import java.util.ArrayList;

class StudentRecord{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList<String> studentName = new ArrayList<>();
        ArrayList<Integer> studentMarks = new ArrayList<>();
        
        int choice;

        while(true) {

        System.out.println("------STUDENT RECORD SYSTEM-------\n");

        System.out.println("1. Add Student Name and Marks:- ");
        System.out.println("2. Display All Records:- ");
        System.out.println("3. Exit:- ");

        System.out.println("Enter your choice(1 to 3)");
        choice = sc.nextInt();
        sc.nextLine();

            switch(choice) {

                case 1 : 
                        System.out.print("Enter Student Name:-  ");
                        String name = sc.nextLine();

                         

                        System.out.print("Enter Student Marks:-  ");
                        int marks = sc.nextInt();

                        if(marks < 0 || marks > 100){
                            
                            System.out.println("Invalid Marks");

                        } else{

                        studentName.add(name);
                        studentMarks.add(marks);
                        System.out.println("\nStudent Records added successfully\n");
                    
                        }
                break;
                
                case 2 : if( studentName.isEmpty()){
                    System.out.println("No records Available");

                } else {
                    System.out.println("Name" + "\tMarks");
                    for( int i = 0; i < studentName.size(); i++){
                        System.out.println(studentName.get(i) + "\t" + studentMarks.get(i));
                    }
                }
                break;
                
                case 3 : 
                        System.out.println("\nExiting...");
                        sc.close();
                        return;

                default : 
                        System.out.println("Invalid Choice");
            }

        }
        
    }
}