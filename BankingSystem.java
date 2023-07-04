import java.util.Scanner;
import java.math.BigDecimal;
import java.text.DecimalFormat;
/**
 * Write a description of class BankSoftware here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankingSystem
{
 Scanner sc =new Scanner(System.in);
String name,choice1,name2,add2,dob,occ,choice3,org,nat,vill,res45,res46;
int otp,choice,time,age,count,time2,appn,time3,ncount;
double rand,balance=15.0,amt,depo,wdrw,phn,uid,passport,loan1,rate,amt1,salary,accno,turn,busloan,rate1,amt2,pp,amt69,mv,pp2,mv2,time34,amt45,mv68;




public void choices(){
       BankingSystem ob=new BankingSystem();
    System.out.println("---------------------------------");
System.out.println("Enter N or n to Create A New Account");
System.out.println("Enter L or l to have loan");
System.out.println("Enter T or t for Transaction of the money!");
System.out.println("------------------------------------");
System.out.println("-------------------------------");
System.out.println("Enter Your Choice :-");
choice1=sc.nextLine();
System.out.println("--------------------------------");
if(choice1.equalsIgnoreCase("N")==true||choice1.equalsIgnoreCase("n")==true){
    System.out.println("-------------Welcome To The Form ----------------");
    ob.newacct();


}

if(choice1.equalsIgnoreCase("L")==true ||choice1.equalsIgnoreCase("l")==true){
ob.loan();
if(choice1.equalsIgnoreCase("t")==true ||choice1.equalsIgnoreCase("T")==true){
    ob.trans();
   

}


}
}

public void trans(){
BankingSystem ob=new BankingSystem();
   
System.out.println("Do You Want To do the Transactions !");
System.out.println("Enter yes/y or no/n");
if(res46.equalsIgnoreCase("yes")||res46.equalsIgnoreCase("y")==true){
    System.out.println("Enter Your Response:-");
    res46=sc.nextLine();
    System.out.println("Enter t or T for the Transactions of the Money !");
    res45=sc.nextLine();
if(res45.equalsIgnoreCase("t")||res45.equalsIgnoreCase("T")==true){
ob.process();

}
}
else{
System.out.println("You Entered the Wrong Value ");
System.exit(0);

}


}


public void newacct(){
       BankingSystem ob=new BankingSystem();
    System.out.println(".......................");
System.out.println("Enter Your Name :-");
name2=sc.nextLine();
System.out.println("Enter Your Address :- ");
add2=sc.nextLine();
System.out.println("Enter Your Date of Birth :-");
dob=sc.nextLine();
System.out.println("Enter Your Occupation");
occ=sc.nextLine();
System.out.println("Enter Your Phone Number :-");
phn=sc.nextDouble();
System.out.println(".............................");
System.out.println("*************New Account Created ............");
}
public void loan(){
 BankingSystem ob=new BankingSystem();
 System.out.println("Which Type Of Loan You Want To Take ?");
 System.out.println("Enter H or h for Home Loan ");
 System.out.println("Enter P or p for personal Loan ");
 System.out.println("Enter B or b for Buisness Loan ");
 choice3=sc.nextLine();
 if(choice3.equalsIgnoreCase("H")||choice3.equalsIgnoreCase("h")){
    ob.hloan();
    
    
    } 
    if(choice3.equalsIgnoreCase("P")||choice3.equalsIgnoreCase("p")){
    ob.personaloan();
    
    
    } 
     if(choice3.equalsIgnoreCase("B")||choice3.equalsIgnoreCase("b")){
    ob.busnsloan();
    
    
    } 
    
    


}
public void hloan(){
    BankingSystem ob=new BankingSystem();
    
    
System.out.println("****************WELCOME TO THE HOME LOAN SECTION OF OUR BANK***************");
System.out.println("Enter Your Name :-");
name=sc.nextLine();
System.out.println("Enter Your AAadhaar / UID No :-");
uid=sc.nextDouble();
System.out.println("Passport No.:");
passport=sc.nextDouble();
System.out.println("Organization Type:");
org=sc.nextLine();
System.out.println("Enter Your Monthly Salary !");
salary=sc.nextDouble();
if(salary<15000){
System.out.println("You are Not Eligible to have loan !");
System.exit(0);


}
System.out.println("*****************************DECLARATION*************************************");
System.out.println("I/We certify that the information and particulars provided by me/us in this application form (and all documents referred or provided herewith) are true, correct, complete and up to date !");
System.out.println(".........................................................................................................................................................");
System.out.println("...........................................................................................................................................................");
System.out.println("INTEREST RATE IS 5 %");
System.out.println("Enter The Amount You Want to Take !");
loan1=sc.nextDouble();
System.out.println("Enter The Time In Months");
time=sc.nextInt();

 double amt69=loan1*time*(time+1)/(2*12)*5/100;
 mv68=loan1*time+amt69;
 
System.out.println("The Amount After"+""+time+" "+"Months"+"is"+" Rs"+" "+""+mv68);
System.out.println("...................................");
System.out.println("................");




}


public void personaloan(){
      BankingSystem ob=new BankingSystem();
    
System.out.println("******************************Welcome To The Personal Loan Page Of Our Bank*********************************");
System.out.println("Enter Your Nationality:-");
nat=sc.nextLine();
if(nat.equalsIgnoreCase("indian")==true||nat.equalsIgnoreCase("India")==true||nat.equalsIgnoreCase("india")==true ||nat.equalsIgnoreCase("india")==true||nat.equalsIgnoreCase("Ind")==true){
System.out.println("Enter Your Age ");
age=sc.nextInt();
if(age<21 ||age>79){
System.out.println("You Are Not Eligible to Get A Loan ");
System.out.println("Your Age is not sufficient to get a loan ");
System.exit(0);

}
System.out.println("Enter The City/Town You Live In :-");
vill=sc.next();
System.out.println("Enter Your Account Number   :-");
accno=sc.nextDouble();


  while (accno != 0) {
      // num = num/10
      accno=count;
      accno /= 10;
      ++count;
    }

    
}
else
{
System.out.println("You are not eligible to get a loan because you are not an Indian.........");
System.out.println("Thanks for visiting us ..................");
System.out.println("System Closing...................................");
System.out.println(".....................................");
System.exit(0);



}
System.out.println("INTEREST RATE OF 6 %");
System.out.println("Enter the Amount You Want To Take :-");
pp2=sc.nextDouble();
System.out.println("Enter the Tenure In Months ");
time34=sc.nextInt();
amt45=pp2*time34*(time34+1)/(2*12)*6/100;
    mv68=pp2*time34+amt45;
    


System.out.println("The Amount is"+" "+"Rs"+" "+amt45+" "+"in"+" "+time34+" "+"Months");






}

public void busnsloan(){
    BankingSystem ob=new BankingSystem();
    
System.out.println("********************Welcome To The Business Loan Section Of Our Bank****************************");
System.out.println("Enter Your Name :-");
name=sc.nextLine();
System.out.println("Enter the Minimum Business turnover :-");
System.out.println("Minimun Turnover of more than RS 4000000 lakhs");
turn=sc.nextDouble();
if(turn<=4000000){
System.out.println("You Are Not Eligible To have a loan A minimum of 40 Lakhs Rs Is Needed !");
System.exit(0);

}
System.out.println("How Many Years of Experience do you have in business");
System.out.println("You Need a minimum of 5 years of Experience");
time2=sc.nextInt();
if(time2<5){
System.out.println("You are not eligible to get a loan ");
System.out.println("You need a minimum 5 years of exoerience");
System.exit(0);

}
System.out.println("Enter the age of the applicant :-");
appn=sc.nextInt();
if(appn<21 ||appn>65){
System.out.println("You are not eligible to get a loan");
System.out.println("You need a age between 21 years to 65 years ");
System.exit(0);
}
System.out.println("INTEREST RATE IS 7 %");

System.out.println("Enter The Amount You Want <><>?");
busloan=sc.nextDouble();
System.out.println("Enter the Tenure(In Months)");
time3=sc.nextInt();

 double amt34=busloan*time3*(time3+1)/(2*12)*7/100;
double mv1=busloan*time3+amt34;




System.out.println("Your Amount To be paid"+"\t"+" "+mv1+"in "+" "+time3+""+" " +"Months");
System.out.println(".........................................................");
System.out.println("...........................................");
System.out.println(",.............................................");



}

 public void input(){
BankingSystem ob=new BankingSystem();
     System.out.println("**********************************");
     System.out.println("Welcome To the Prabuddha Pal Bank");
     System.out.println("**********************************");
System.out.println("Enter Your Name :-");
name=sc.nextLine();

rand=Math.random()*5421;

System.out.println("Your OTP :-"+(int)rand);
System.out.println("Enter Your OTP :- ");
otp=sc.nextInt();
if(otp!=(int)rand){
System.out.println("You Entered The Wrong OTP...");
System.exit(0);
}

}
public void process(){
    System.out.println("Enter 1 To Check Your Balance");
    System.out.println("...............................");
    System.out.println("...............................,");
    System.out.println("Enter 2 to Deposit Your Money");
     System.out.println("...............................");
    System.out.println("...............................,");
    System.out.println("Enter 3 to Withdraw Your Money ");
    System.out.println("................................");
    System.out.println("Enter 4 to Exit");
    System.out.println("..............................");
    
do{
System.out.println("Enter Your Choice !");
choice=sc.nextInt();
switch(choice){
case 1:
     System.out.println("-------------------------------------------------------");
                System.out.println("Balance = "+balance);
                System.out.println("-------------------------------------------------------");
                System.out.println("\n"+balance);
                break;
 case 2:
      System.out.println("-------------------------------------------------------");
                System.out.println("Enter an amount to deposit ");
                System.out.println("-------------------------------------------------------");

                amt =sc.nextDouble();
                
                balance=balance+amt;
                System.out.println("\n"+balance);
                break;
    case 3:
           System.out.println("-------------------------------------------------------");
                System.out.println("Enter an amount to withdraw ");
                System.out.println("-------------------------------------------------------");

                wdrw=sc.nextDouble();
                if(wdrw>balance){
                System.out.println("Transaction is Not Possible Because the Balance is Not Sufficient");
                break;
                
                }
                balance=balance-wdrw;
                System.out.println("\n"+balance);
                break;


}
System.out.println("Thanks For Visiting Us !");
}while(choice!=4);
    

}

public void man(){
BankingSystem ob=new BankingSystem();
System.out.println(".............................");
System.out.println("*****************************");

}
public void main(){
BankingSystem ob=new BankingSystem();
System.out.println("......");
System.out.println("***********************************");
System.out.println("-----------------------------------");

ob.choices();

ob.trans();





 


}
}
