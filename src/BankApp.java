public class BankApp {
    public static void main(String[] args) {
        Account savings = new Account();
        try{
            savings = new Account(1235);
            Out.println("SUCCESS: no exception occured");
        }catch(IllegalArgumentException e){
            Out.println("ERROR: an exceptionof type IllegalArgumentException occured");
        }
        try{
            Account spendings = new Account(-333);
            Out.println("ERROR: the IllegalArgumentException did not occur");
        }catch(IllegalArgumentException e){
            Out.println("SUCCESS: IllegalArgumentException occured\t"+e.getMessage());
        }

        //expected working
        try{
            savings.withdraw(834);
            Out.println("SUCCESS: no exception occured");
        }catch(IllegalArgumentException e){
            Out.println("ERROR: IllegalArgumentException not expected\t"+e.getMessage());
        }catch(Exception e){
            Out.println("ERROR: Exception not expected\t"+e.getMessage());
        }
        try{
            savings.withdraw(33);
            Out.println("SUCCESS: no exception occured");
        }catch(IllegalArgumentException e){
            Out.println("ERROR: IllegalArgumentException not expected\t"+e.getMessage());
        }catch(Exception e){
            Out.println("ERROR: Exception not expected\t"+e.getMessage());
        }
        try{
            savings.deposit(78.63);
            Out.println("SUCCESS: no exception occured");
        }catch(IllegalArgumentException e){
            Out.println("ERROR: IllegalArgumentException not expected\t"+e.getMessage());
        }catch(Exception e){
            Out.println("ERROR: Exception not expected\t"+e.getMessage());
        }
        

        //expected throwing errors
        try{
            savings.withdraw(-33000);
            Out.println("ERROR: no Exception did occur at all");
        }catch(IllegalArgumentException e){
            Out.println("SUCCESS: IllegalArgumentException occured\t"+e.getMessage());
        }catch(Exception e){
            Out.println("ERROR: Exception not expected\t"+e.getMessage());
        }
        try{
            savings.deposit(-2332);
            Out.println("ERROR: no Exception did occur at all");
        }catch(IllegalArgumentException e){
            Out.println("SUCCESS: IllegalArgumentException occured\t"+e.getMessage());
        }catch(Exception e){
            Out.println("ERROR: Exception not expected\t"+e.getMessage());
        }
        try{
            savings.withdraw(0);
            Out.println("ERROR: no Exception did occur at all");
        }catch(IllegalArgumentException e){
            Out.println("SUCCESS: IllegalArgumentException occured\t"+e.getMessage());
        }catch(Exception e){
            Out.println("ERROR: Exception not expected\t"+e.getMessage());
        }
        try{
            savings.deposit(0);
            Out.println("ERROR: no Exception did occur at all");
        }catch(IllegalArgumentException e){
            Out.println("SUCCESS: IllegalArgumentException occured\t"+e.getMessage());
        }catch(Exception e){
            Out.println("ERROR: Exception not expected\t"+e.getMessage());
        }
        try{
            savings.withdraw(33000);
            Out.println("ERROR: no Exception did occur at all");
        }catch(IllegalArgumentException e){
            Out.println("ERROR: IllegalArgumentException not expected\t"+e.getMessage());
        }catch(Exception e){
            Out.println("SUCCESS: Exception occured\t"+e.getMessage());
        }
        try{
            savings.deposit(120000);
            Out.println("ERROR: no Exception did occur at all");
        }catch(IllegalArgumentException e){
            Out.println("ERROR: IllegalArgumentException not expected\t"+e.getMessage());
        }catch(Exception e){
            Out.println("SUCCESS: Exception occured\t"+e.getMessage());
        }
    }
}
