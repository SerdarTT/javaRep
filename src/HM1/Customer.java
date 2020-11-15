package HM1;

public class Customer extends Accounts{

    String name;
    int ssn;
    String city;
    double balance;
    int NumberOfAccount = 0;
    static int CustomerCount = 0;
    int accntNum;


    public Customer(String name, int ssn) {
        NumberOfAccount = ++CustomerCount;
        this.name = name;
        this.ssn = ssn;
    }

    public Customer(String name, int ssn, String city){
        NumberOfAccount = ++CustomerCount;
        this.name = name;
        this.ssn = ssn;
        this.city = city;
        Accounts ca = new Accounts();
        ca.checkingAccount("");




    }
    public void makeDeposit(double amount){

        balance+=amount;
    }
    public void withDraw(int amount){
        balance -= amount;}

    public void custSummary(){
        System.out.println("Name of the bank: JPMorgan Chase");
        System.out.println("Bank branch: Queens Blvd, Forest Hills");
        if(balance < 1000) {
            System.out.println("Please increase your balance above $1000 or your account will be blocked! " );
        }else{
            System.out.println("Balance is: "+balance);
        }
        System.out.println("Name of the customer: "+name);
        System.out.println("SSN of customer: "+ssn);
        System.out.println("The city of customer: "+city);
        System.out.println("Customer account number: "+accntNum);



    }
    public void accountNum(int accnt){
        accntNum = accnt;
    }


}
