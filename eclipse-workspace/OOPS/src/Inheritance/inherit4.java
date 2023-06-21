package Inheritance;

import java.util.*;

import java.util.*;
class Account {
    protected String accName;
    protected String accNo;
    protected String bankName;

    public void setaccName(String accName){
        this.accName = accName;
    }
    public String getaccName(){
        return accName;
    }
    public void setaccNo(String accNo){
        this.accNo = accNo;
    }
    public String getaccNo(){
        return accNo;
    }
    public void setbank(String bankName){
        this.bankName = bankName;
    }
    public String getbank(){
        return bankName;
    }
    protected void display(){
        System.out.println("get");
    }
}
class CurrentAccount extends Account{
    private String tinNumber;
    CurrentAccount(){

    }
    CurrentAccount(String accName,String accNo,String bankName,String tinNumber){
        this.accName = accName;
        this.accNo = accNo;
        this.bankName = bankName;
        this.tinNumber = tinNumber;
    }

    public void display(){
        System.out.println(accName);
        System.out.println(accNo);
        System.out.println(bankName);
        System.out.println(tinNumber);
    }
}
class SavingsAccount extends Account{
    private String orgName;
    SavingsAccount(){

    }
    SavingsAccount(String accName,String accNo,String bankName,String orgName){
        this.accName = accName;
        this.accNo = accNo;
        this.bankName = bankName;
        this.orgName = orgName;
    }
    public void display(){
        System.out.println(accName);
        System.out.println(accNo);
        System.out.println(bankName);
        System.out.println(orgName);
    }
}
class inherit4 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        CurrentAccount obj = new CurrentAccount();
        SavingsAccount obj1 = new SavingsAccount();
        if(f==1){
            String accname = sc.next();
            String accnum = sc.next();
            String bankname = sc.next();
            String orgname = sc.next();
            obj.setaccName(accname);
            obj.setaccNo(accnum);
            obj.setbank(bankname);
            CurrentAccount  s = new CurrentAccount( accname, accnum, bankname, orgname);
            s.display();
        }else{
            String accname = sc.next();
            String accnum = sc.next();
            String bankname = sc.next();
            String tinnumber = sc.next();
            obj1.setaccName(accname);
            obj1.setaccNo(accnum);
            obj1.setbank(bankname);
            SavingsAccount s1 = new SavingsAccount(accname,accnum, bankname,tinnumber);
            s1.display();
        }
    }
}