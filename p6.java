import java.util.Scanner;
abstract class Bank{
    String name;
    int accNo;
    double balance;

    Scanner sc = new Scanner(System.in);
    void readData(){
        System.out.print("Enter customer  name:");
        name = sc.nextLine();
        System.out.print("Enter account numebr:");
        accNo = sc.nextInt();
        System.out.print("Enter balance:");
        balance = sc.nextDouble();
    }
    void DisplayDetails(){
        System.out.print(
        "Name:"+name+
        "\nAccount name:"+accNo+
        "\nBalance:"+balance);
    }

    abstract void calculateInterest();
}

class CityBank extends Bank {
    void calculateInterest(){
        double rate  = 5.0;
        double interest = (balance * rate)/100 ;
        DisplayDetails();
        System.out.println("Bank:CityBank");
        System.out.println("Interest Earned:"+interest);

    }

}
class CanaraBank extends Bank {
@Override
void calculateInterest() {
double rate = 5.5; // 5.5% interest
double interest = (balance * rate) / 100;
DisplayDetails();
System.out.println("Bank: Canara Bank");
System.out.println("Interest Earned: " + interest);
}
}
class SBIbank extends Bank {
@Override
void calculateInterest() {
double rate = 6.0; // 6% interest
double interest = (balance * rate) / 100;

DisplayDetails();
System.out.println("Bank: SBI Bank");
System.out.println("Interest Earned: " + interest);
}
}


public class p6 {
    public static void main(String[] args){
    int choice=0;
    Scanner sc = new Scanner(System.in);
    Bank bank = null;
    while(choice!=4){
        System.out.println("\nChoose Bank:");
        System.out.println("1. City Bank");
        System.out.println("2. SBI Bank");
        System.out.println("3. Canara Bank");
        System.out.println("4. Exit");
        System.out.println("Enter your choice:");
        choice = sc.nextInt();
        switch (choice) {
    case 1:
    bank = new CityBank();
    break;
    case 2:
    bank = new SBIbank();
    break;
    case 3:
    bank = new CanaraBank();
    break;
        case 4:
    System.out.println("Exiting...");
    break;
    default:
        System.out.println("Invalid choice!");
    }
     if(bank!=null){
        bank.readData();
        bank.calculateInterest();
    }
    }
    sc.close();

    }
   
    
}
