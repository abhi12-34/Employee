import java.util.Scanner;


public class Account {

    //classs level variables
    int accNum;
    String holderName;
    double balance;

    // constructor ya setter method detailsset krne k liye
    public Account(int a, String h, double b){
        accNum = a;
        holderName = h;
        balance = b;
    }

    public void deposit(  Scanner scanner){
        

        // Scanner dep = new Scanner(System.in); // create a Scanner object
        System.out.println("how much u want to deposit"); // asking for account number
        double depAmt = scanner.nextDouble(); //read user input

       

        balance += depAmt ;
        System.out.println("Done ! Now , your currrent balance is:"+ balance);

        
        
    }

    public void withdrawn(  Scanner scanner){

        

        
        System.out.println("how much u want to withdrawn"); // asking for account number
        
        double amt = scanner.nextDouble(); //read user input
            
        
        if (balance > amt ){
            balance -= amt ;
            System.out.println("your currrent balance is:"+ balance);
        }else{
            System.out.println("Insufficient Balance");
            return ;
        }       
        
    }

    public void checkBalance( ){
        System.out.println("Hello "+ holderName );
        System.out.println("your accont number is:"+ accNum);
        System.out.println("your current balance is:"+ balance);
    }


    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in); // create a Scanner object


        System.out.println("enter your account number"); // asking for account number
        int a = scanner.nextInt(); //read user input
        scanner.nextLine();
        

        // Scanner name = new Scanner(System.in); // create a Scanner object
        System.out.println("enter your holder name"); // asking for account number
        String h = scanner.nextLine(); //read user input
         

        // Scanner bal = new Scanner(System.in); // create a Scanner object
        System.out.println("enter your account balance"); // asking for account number
        Double b = scanner.nextDouble(); //read user input
        

        System.out.println("Account Created Successfully");

        Account user1 = new Account(a, h , b);
        // bal.close(); // close scanner
        // name.close(); // close scanner
        // acc.close(); // close scanner

        

        user1.deposit( scanner );
        user1.withdrawn( scanner);
        user1.checkBalance();

        scanner.close();

        
        

    }

}


