import java.util.*;

class ATM {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int balance = 10000;

         while (true) { 

        System.out.println("\nWELCOME TO ATM SIMULATION\n");

        System.out.println("-------ATM MENU-------");
        System.out.println("1 : Deposit money");
        System.out.println("2 : Withdraw money");
        System.out.println("3 : Check Balance");
        System.out.println("4 : Exit\n");

        System.out.println("Enter your Choice (1 to 4)");
        int choice = sc.nextInt();

        switch(choice) {
            case 1 : System.out.println("Enter Amount to Deposit");
                        int amount = sc.nextInt();

                        if(amount > 0){
                            balance += amount;
                            System.out.println("Deposit successful");

                        } else {
                            System.out.println("Invalid Amount");
                        }
                        break;
                        
            case 2 : System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextInt();

                    if (amount > 0 && amount <= balance) {
                        balance -= amount;
                        System.out.println("Please collect your cash");
                    } else if (amount > balance) {
                        System.out.println("Insufficient balance");
                    } else {
                        System.out.println("Invalid amount");
                    }
                    break;


            case 3 : 
                System.out.println("Current Balance is = " + balance);
                break;

            case 4 :   
                    System.out.println("Exiting.....Thank you for using ATM");
                    sc.close();
                    return;
                    

            default : 
                System.out.println("Invalid choice");
        }


    }

    }
}