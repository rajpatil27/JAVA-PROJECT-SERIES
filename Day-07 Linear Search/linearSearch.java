import java.util.*;

class linearSearch{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);


        while( true ){

        System.out.println("\nLinear Search using 1D & 2D Arrays\n");
        System.out.println("----MENU----");
        System.out.println("1 : Linear Searching in 1D Array");
        System.out.println("2 : Linear Searching in 2D Array");
        System.out.println("3 : EXIT");


        System.out.println("\n Enter your Choice :-");
        int choice = sc.nextInt();


        switch (choice) {
            case 1:
                System.out.println("Enter the size of Array");
                int size = sc.nextInt();

                int[] matrix = new int[size];

                System.out.println("Enter Inputs");
                for(int i = 0; i < size; i++){
                    matrix[i] = sc.nextInt();
                    
                }

                System.out.println("Enter the number for Linear Search");
                int y = sc.nextInt();

                boolean found = false;
                for(int i = 0; i < size; i++){
                    if(matrix[i] == y) {
                    System.out.println("Found the number at the location (" + i + ")");
                found = true;
                break;
    }
}

                if(!found){
                System.out.println("Number not found");
                }
                break;

            case 2: 

                System.out.println("Enter number of rows:-  ");
                int row = sc.nextInt();

                System.out.println("Enter number of columns:- ");
                int col = sc.nextInt();

                int[][] numbers = new int[row][col];
        
                System.out.println(" Enter Inputs");
                    for(int i = 0; i < row; i++){
                        for(int j = 0; j < col; j++) {
                            numbers[i][j] = sc.nextInt();
                        }
                    }

                System.out.println("Enter the number for Linear Search");
                int x = sc.nextInt();

                boolean found2D = false;

                for(int i = 0; i < row; i++){
                    for(int j = 0; j < col; j++) {
                        if (numbers[i][j] == x) {
                            System.out.println("Found the number at location (" + i + ", " + j + ")");
                        found2D = true;

                    break;
                }
            }
                    if(found2D) break;
}
                if(!found2D){
                System.out.println("Number not found");
}

                break;

            case 3: 
                System.out.println("Exiting....");
                sc.close();
                return;


        
            default:
                System.out.println("Invalid Choice");
                break;
            }
        }
    }
}