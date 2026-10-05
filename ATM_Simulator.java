import java.util.Scanner;
public class ATM_Simulator{
    static double balance = 10000.00;
    static void checkBalance(){
        System.out.printf("Your current balance is:₹%.2f%n" , balance);
    }
    static void deposit(Scanner sc){
        System.out.print("Enter amount to deposit:₹");
        double amount=sc.nextDouble();
        if(amount>0){
            balance+=amount;
            System.out.printf("₹%.2f deposited succcessfully %n",amount);
        }else{
            System.out.println("Invalid amount.Please enter a positive value.");

        }
}
static void withdraw(Scanner sc){
    System.out.print("Enter amount to withdraw:₹");
    double amount=sc.nextDouble();

    if(amount<=0){
        System.out.println("Amount must be greater than zero.");
    }else if(amount>balance){
        System.out.println("Insufficient balance.");
    }else{
        balance-=amount;
        System.out.printf("₹%.2f withdrawn successfully %n",amount);
    }
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int choice;
    System.out.println("+++++++++ATM Simulator+++++++++");
    do{
        System.out.println("\n1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.exit");
        System.out.print("Enter your choice:");
        choice=sc.nextInt();
        switch(choice){
            case 1:
                checkBalance();
                break;
            case 2:
                deposit(sc);
                break;
            case 3:
                withdraw(sc);
                break;
            case 4:
                System.out.println("Thank you for using the ATM Simulator.");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }while(choice!=4);
    sc.close();
    }
}