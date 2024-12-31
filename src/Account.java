public class Account{
    
    double balance;

    public Account(double balance) throws IllegalArgumentException{
        if(balance < 0){
            throw new IllegalArgumentException("Initial account balance cannot be negative.");
        }
        this.balance = balance;
    }
    public Account(){
        this(0);
    }

    public void withdraw(double amount) throws IllegalArgumentException, Exception{
        if(amount <= 0){
            throw new IllegalArgumentException("you can not withdraw numbers <= 0");
        }
        if(balance-amount < 0){
            throw new Exception("not enough money on your bank account to withdraw %.2f from %.2f".formatted(amount,balance));
        }
        balance -= amount;
    }
    public void deposit(double amount) throws IllegalArgumentException, Exception{
        if(amount <= 0){
            throw new IllegalArgumentException("you can not deposit numbers <= 0");
        }
        if(balance+amount > 100000){
            throw new Exception("you can not deposit on the account if %.2f + %.2f is more than 100k Euro".formatted(balance,amount));
        }
    }
}