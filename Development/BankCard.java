
/**
 * Write a description of class BankCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankCard
{
    //declaring  attributes
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private double balanceAmount;

    //constructors
    public BankCard( int cardId, String issuerBank, String bankAccount, double balanceAmount){
        //initializing the value of attributes
        this.clientName ="";
        this.cardId = cardId;
        this.issuerBank = issuerBank;
        this.bankAccount = bankAccount;
        this.balanceAmount = balanceAmount;
    }

    //accesor method
    protected int getcardID(){
        return cardId;
    }
    protected String getissuerBank(){
        return issuerBank;
    }
    protected String getbankAccount(){
        return bankAccount;
    }
    protected double getbalanceAmount(){
        return balanceAmount;
    }

    //mutator method
    protected void setclientName (String newClientName){
        this.clientName = newClientName;
    }
    protected void setbalanceAmount (double newBalanceAmount){
        this.balanceAmount = newBalanceAmount;
    }
    //display method
    public void display(){
        System.out.println("Card ID: "+ this.cardId);
        if (clientName !=""){
            System.out.println("Client Name: "+ this.clientName);
        }else{
            System.out.println("Please enter your name!");
        }
        System.out.println("Issuer Bank: "+ this.issuerBank);
        System.out.println("Bank Account: "+ this.bankAccount);
        System.out.println("Balance Amount: "+ this.balanceAmount);
    }
}
