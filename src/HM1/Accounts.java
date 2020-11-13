package HM1;

public class Accounts extends Customer {
    String accountName;

    public Accounts(String name, int ssn) {
        super(name, ssn);
    }


    public void savingAccount(String accntname){
        accountName = accntname;
    }
    public void checkingAccount(String acntName){
        this.accountName = acntName;
    }
}

