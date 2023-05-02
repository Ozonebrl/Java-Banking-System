
/**
 * Write a description of class DebitCard here.
 *
 * @author (your name)


 * @version (a version number or a date)
 */
public class DebitCard extends BankCard
{
   private int pinNumber;
   private double withdrawalAmount;
   private String dateofWithdrawal;
   private boolean hasWithdrawan;

   public DebitCard(double balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName, int pinNumber){
       super(cardId,issuerBank,bankAccount,balanceAmount); //calling the attributes of the parent class

       //initializing the values of constructor parameters
       this.pinNumber = pinNumber;
       super.setclientName(clientName);
       this.hasWithdrawan = false; 

   }
   //accessor method
   protected int getpinNumber(){
       return pinNumber;
   }
    protected double getwithdrawalAmount(){
        return withdrawalAmount;
    }
    protected String getdateofWithdrawal(){
        return dateofWithdrawal;
    }
    protected boolean gethasWithdrawan(){
        return hasWithdrawan;
    }
//mutator method
   protected void setwithdrawalAmount(double newwithdrawalAmount){
       this.withdrawalAmount = newwithdrawalAmount;
   }

public void withDraw(double withdrawalAmount, String dateofwithdrawal, int pinNumber){
       if(this.pinNumber == pinNumber && super.getbalanceAmount()>= withdrawalAmount){
        this.hasWithdrawan = true;
         double newbalanceAmount = super.getbalanceAmount() - withdrawalAmount;
         super.setbalanceAmount(newbalanceAmount);
       }
       if(this.pinNumber != pinNumber){
           System.out.println("Invalid pin number");
       }
       if (super.getbalanceAmount()< withdrawalAmount){
           System.out.println("There is no sufficient balance in your account");
        }
    }                                                       
//display method
 public void display(){
        super.display();// calling display of parent class BankCard
        if(this.hasWithdrawan = true){
            System.out.println("Pin Number: "+ this.pinNumber);
            System.out.println("Withdrawal Amount: "+ this.withdrawalAmount);
            System.out.println("Date of Withdrawal: "+ this.dateofWithdrawal);

        }else{
            System.out.println("Your balance amount: "+super.getbalanceAmount());
        }
    }
}