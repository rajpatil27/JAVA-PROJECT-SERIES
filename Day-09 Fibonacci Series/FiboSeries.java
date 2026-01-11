import java.util.*;

class FiboSeries {
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of series:- ");
        int n = sc.nextInt();

        int firstNum = 0, secondNum = 1;
        
        System.out.print("Fibonacci Series is :- ");
        for(int i = 1; i <= n; i++){
            System.out.print(firstNum + " ");
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum; 
        }
        sc.close();
    }
}