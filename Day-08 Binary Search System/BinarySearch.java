import java.util.*;

class BinarySearch {
        public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array:- ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Inputs:- ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        

        while (true) {

            
            System.out.println("\n---- Binary Search Menu ----");
            System.out.println("1. Display Sorted Array");
            System.out.println("2. Binary Search Element");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 :
                    System.out.println("Sorted Array is:-  ");
                    for(int i = 0; i < n; i++){
                        System.out.print( arr[i] + " ");
                    }System.out.println();
                    
                    break;

                case 2 :
                    System.out.println("Enter the number to search:-  ");
                    int key = sc.nextInt();

                    int low = 0;
                    int high = n - 1;

                    boolean Found = false;

                    while(low <= high) {
                        int mid = (low + high)/ 2;

                        if( arr[mid] == key) {
                            System.out.println("Found element at index " + mid);
                            Found = true;
                            break;
                        }
                        else if (arr[mid] < key){
                            low = mid + 1;
                        } 
                        else {
                            high = mid - 1;
                        }
                    }
                    
                    if (!Found) {
                        System.out.println("Element not found");
                    }

                    break;

                case 3 :
                    System.out.println("Exiting...");
                    sc.close();
                    return;
            
                default: 
                    System.out.println("Invalid choice");

                    break;
            }
        }
    }
}
