
/**
 * Write a description of class CreditCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class CreditCard extends BankCard
{
    private int CVCnumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;

    public CreditCard( int cardId , String clientName , String issuerBank , String bankAccount , double balanceAmount , int CVCnumber , int interestRate , String expirationDate ){
    super(cardId , issuerBank , bankAccount , balanceAmount);
    super.setclientName(clientName);
    this.CVCnumber=3111;
    this.interestRate=6;
    this.expirationDate=expirationDate;
    this.isGranted= false;
    }

    protected int getCVCnumber(){
        return this.CVCnumber;
    }

    protected double getcreditLimit(){
        return this.creditLimit;
    }

    protected double getinterestRate(){
        return this.interestRate;
    }

    protected String getexpirationDate(){
        return this.expirationDate;
    }

    protected int getgracePeriod(){
        return this.gracePeriod;
    }

    protected boolean getisGranted(){
        return this.isGranted;
    }

    public void setcreditLimit(double creditLimit , int gracePeriod)
    {
     if(this.creditLimit <= (super.getbalanceAmount() * 2.5)){
        this.gracePeriod = gracePeriod ;
        this.isGranted = true ; 
        this.creditLimit = creditLimit ;
    }else{
      System.out.println("Insufficient Balance For Credit");
     }
    }
    
    public void cancelcreditCard()
    {
        this.CVCnumber = 0;
        this.creditLimit = 0;
        this.gracePeriod = 0;
        this.isGranted = false;
    }

    public void display()
    {
        if(this.isGranted == true){
            super.display();
            System.out.println("Grace Period is : " +this.gracePeriod);
            System.out.println("Credit Limit is : " +this.creditLimit);
        }else{
            System.out.println("CVC number is: " +this.CVCnumber );
            System.out.println("Interest Rate is :" +this.interestRate);
            System.out.println("Expiration Date is : " +this.expirationDate);
            System.out.println("Credit Granted is :" +this.isGranted);
        }
    }
}

