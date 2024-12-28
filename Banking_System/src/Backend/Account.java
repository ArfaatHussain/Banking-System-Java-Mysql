/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

/**
 *
 * @author DELL
 */
import java.util.InputMismatchException;

import java.util.Scanner;

public class Account {

    

    class Node {

        int accountNumber, pin , cnic;
        double balance;
        String name, address,contact;
        boolean status;
        Node next, back;

        public Node(String name, String address, int cnic,String contact, int accountNumber, int pin ,double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
            this.name = name;
            this.pin=pin;
            this.contact=contact;
            this.address = address;
            this.cnic = cnic;
            this.status=false;
        }

    }
    Scanner input=new Scanner(System.in);
    Node head;
    Node tail;

    public Account() {
        head = null;
        tail = null;
    }

    
    public void addAccount(String name, String address, int cnic, String contact, int accountNumber, int pin ,double balance) {

       
        
        Node account = new Node(name, address, cnic,contact, accountNumber, pin,balance);

        if (head == null) {
            head = account;
            tail = account;
//            System.out.println("\nYour Account is registered. Your accountNumber is "+ accountNumber+" Remember it for login.");
        } else {

            tail.next = account;
            account.back = tail;
            tail = account;
//           System.out.println("\nYour Account is registered. Your accountNumber is "+ accountNumber +" Remember it for login.");
        }

    
    }
     public void deleteAccount() {

        // if none account is remaining
        if (head == null) {
            System.out.println("\nNo Account Exist");

        }

        // if last account is remaining
        if (head.next == null) {
            head = tail = null;
            return;
        }

        int indexOfAccount = getIndexOfAccount();

        // account is on first index so that we could update head refernce 
        if (indexOfAccount == 0) {
            head = head.next;
            head.back = null;

        } // account is on last index so that we could update tail refernce
        else if (indexOfAccount == getIndexOfLastAccount()) {

            tail = tail.back;
            tail.next = null;

        } // account is in middle
        else {

            Node prev = null;
            Node current = head;
            int counter = 0;

            while (counter < indexOfAccount) {
                prev = current;
                current = current.next;
                counter++;

            }

            prev.next = current.next;
            current.next.back = prev;
        }

    }
     
     public String getEmailOfActiveAccount(){
         Node temp = head;
         
         while(temp.status!=true){
             temp = temp.next;
         }
         
         return temp.contact;
     }
     
     public String getEmailOfAccontNumber(int accountNumber){
         String email="";
         Node temp=head;
         while(temp.next!=null){
             if(temp.accountNumber==accountNumber){
                 break;
             }
             else{
                 temp=temp.next;
             }
         }
         email=temp.contact;
         return email;
     }
     
     public String getEmailBody(int choice,int amount){
         String body="";
         
         Node temp=head;
         
         while(temp.status!=true){
             temp=temp.next;
         }
         
         if(choice==1){
             body="\n      -------Bank AlJazira-------\n\n\nDear "+temp.name+"\n     You deposited "+amount+" rupees to your account. Now your account balance is "+temp.balance+" rupees" ;
         }
         else if(choice==2){
              body="\n      -------Bank AlJazira-------\n\n\nDear "+temp.name+"\n    You withdraw "+amount+" rupees from your account. Now your account balance is "+temp.balance+" rupees" ;
         }
         else{
             System.out.println("\nError");
         }
         return body;
     }
     
      public String getEmailBody(int choice,int amount,int toAmmountNumber,int condition){
         String body="";
         
         Node senderTemp=head;
         while(senderTemp.status!=true){
             if(senderTemp.status==true){
                 break;
             }
             else{
                 senderTemp=senderTemp.next;
             }
         }
         
         Node receriverTemp=head;
         
         while(receriverTemp.accountNumber!=toAmmountNumber){
             if(receriverTemp.accountNumber==toAmmountNumber){
                 break;
             }
             else{
                 receriverTemp=receriverTemp.next;
             }
         }
         
         if(condition==1){
         
             body="      -------Bank AlJazira-------\n\n\n "+"Dear " +senderTemp.name  +"\n     "+ amount + " rupees transfer from your account to "+toAmmountNumber+" account number. Now your account balance is "+senderTemp.balance+" rupees";
         }
         else if(condition==2){
             body="      -------Bank AlJazira-------\n\n\n "+"Dear " +receriverTemp.name  +"\n     "+ amount + " rupees transfer to your account from  account number "+ senderTemp.accountNumber+". Now your account balance is "+receriverTemp.balance+" rupees";
         }
         
         return body;
     }
     
     
     
     public boolean isCNICExist(int cnic){
         boolean condition=false;
         
         if(head==null){
            return condition;
         }
         else{
             
             Node temp=head;
             
             while(temp!=null){
                 if(temp.cnic==cnic){
                     condition=true;
                     break;
                 }
                 
                 else{
                     temp=temp.next;
                 }
             }
         }
         return condition;
     }
     
     public int assignAccountNumber(){
         int accountNumber;
         
         if(head==null){
         accountNumber=1000;    
         }
         else{
             
             Node temp=head;
             
             while(temp.next!=null){
                 temp=temp.next;
             }
             accountNumber=temp.accountNumber+1;
         }
         return accountNumber;
     }

    public boolean isAccountExists(int accountNumber) {

        Node temp = head;

        boolean isAccountExists = false;

        while (temp != null) {

            if (temp.accountNumber == accountNumber) {
                isAccountExists = true;
                break;
            } else {
                temp = temp.next;
            }

        }

        return isAccountExists;

    }
    
    public boolean isPinCorrect(int accountNumber , int pin){
        
        boolean condition=false;
        Node accountNode = head;
       
        
        
        while(accountNode!=null){
            if(accountNode.accountNumber == accountNumber && accountNode.pin==pin){
               condition=true;
               break;
            }
            else{
                accountNode=accountNode.next;
            }
        }
       
        return condition;
    }
        
    

    public int getIndexOfLastAccount() {

        Node temp = head;
        int index = 0;

        while (temp.next != null) {
            index++;
            temp = temp.next;
        }

        return index;
    }

    public int getIndexOfAccount() {

        int index = 0;
        Node temp = head;

        while (temp.status != true) {
            System.out.println("Index  "+ index);
            index++;
            temp = temp.next;
            
        }

        return index;

    }
    
    public void activeAccount(int accountNumber){
        
        Node accountNode=head;
        
        while(accountNode.next!=null){
            if(accountNode.accountNumber == accountNumber){
                break;
            }
            else{
                accountNode=accountNode.next;
            }
        }
        accountNode.status=true;
       
    }
    
    public void deavtivateAccount(){
        Node accountNode=head;
        
        while(accountNode!=null){
            if(accountNode.status==true){
                accountNode.status=false;
                break;
            }
            else{
                accountNode=accountNode.next;
            }
        }
    }
    
    public boolean isAccountActive(int accountNumber){
        
        boolean condition=false;
        Node accountNode=head;
        
        while(accountNode!=null){
            if(accountNode.status==true && accountNode.accountNumber==accountNumber){
                condition=true;
                break;
            }
            else{
                accountNode=accountNode.next;
            }
        }
        return condition;
    }
    
    public void displayAccounts() {
        if (head == null) {
            System.out.println("No Account Exist");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print("\nAccount Owner:  "+  temp.name + "    Account Number:  "+  temp.accountNumber+"    Address:  "+  temp.address+"    CNIC:  "+  temp.cnic+"    Contact:  "+  temp.contact+"    Balance =   "+  temp.balance+"    Status:  "+temp.status);
            temp = temp.next; 
        }
        System.out.println();
    }
    
    public void displayAccount(int accountNumber){
        
        Node accountNode=head;
        
        if(isAccountExists(accountNumber)){
            
            while(accountNode!=null){
                if(accountNode.accountNumber==accountNumber && isAccountActive(accountNumber)){
                    break;
                }
                else{
                    
                    accountNode=accountNode.next;
                }
            }
                System.out.print("\nAccount Owner:  "+  accountNode.name + "\nAccount Number:  "+  accountNode.accountNumber+"\nAddress:  "+  accountNode.address+"\nCNIC:  "+  accountNode.cnic+"\nContact:  "+accountNode.contact+"\nBalance =  "+  accountNode.balance+"\nStatus:  "+accountNode.status+"\nPin:  "+accountNode.pin+"\n");
                  
        }
        else{
            System.out.println("Error! Account does'nt exist");
        }
        
    }
    
   public void transferFunds(int fromAccountNumber, int toAccountNumber, double amount) {
       
       Node fromAccount=head;
       
       
       while(fromAccount!=null){
          if(fromAccount.accountNumber==fromAccountNumber){
              break;
          }
          else{
              fromAccount=fromAccount.next;
          }
       }
       
       Node toAccount=head;
       
       while(toAccount!=null){
           if(toAccount.accountNumber==toAccountNumber){
               break;
           }
           else{
               toAccount=toAccount.next;
           }
       }
       
      fromAccount.balance=fromAccount.balance - amount;
      toAccount.balance=toAccount.balance + amount;
//       System.out.println("\n"+amount+" transfer from your account to "+ toAccountNumber+" Account Number");
   }
   
   public boolean isAmountAvalible(int accountNumber, double amount){
       boolean condition =false;
       
       Node accountNode=head;
       
       while(accountNode!=null){
           if(accountNode.accountNumber==accountNumber){
               break;
           }
           else{
               accountNode=accountNode.next;
           }
       }
       
       if(accountNode.balance >= amount){
           condition=true;
       }
       return condition;
   }
    public int withdraw(int accountNumber){
        int amount;
        try{
        int accountPin; 
        while(true){
            
        System.out.println("\nEnter Your Pin:");
        int pin=input.nextInt();
        accountPin=pin;
        if(isPinCorrect(accountNumber, pin)){
            break;
        }
        else{
            System.out.println("Wrong Pin Try again");
        }
        }
        
        while(true){
        System.out.println("\nEnter Amount:");
         amount=input.nextInt();
         
         if(this.isAmountAvalible(accountNumber, amount) && amount >0 && amount <=10000){
             break;
         }
         else if(amount<=0){
             System.out.println("\nEnter valid amount");
         }
         else if(this.isAmountAvalible(accountNumber, amount)==false){
             System.out.println("\nInsufficient amount in your account. Enter valid amount");
         }
         else{
             System.out.println("\nYou cannot withdraw amount more than 10000");
         }
        }
        if(this.isAccountExists(accountNumber) && this.isAmountAvalible(accountNumber, amount) && this.isPinCorrect(accountNumber, accountPin) && isAccountActive(accountNumber)){
            
            Node accountNode=head;
            
            while(accountNode!=null){
                if(accountNode.accountNumber==accountNumber){
                    break;
                }
                else{
                    accountNode=accountNode.next;
                }
            }
            accountNode.balance=accountNode.balance - amount;
//            System.out.println("\n"+amount+" is deducted from your account");
        }
        else if(this.isAccountExists(accountNumber)== false ){
            System.out.println("\nError! Account Does Not exist");
        }
        else if(this.isAmountAvalible(accountNumber, amount)==false){
            System.out.println("\nInsufficient Amount in your account");
        }
        else{
            System.out.println("\nError!");
        }
        }catch(Exception exe){
            System.out.println("\nInvalid Entry Encountered.");
            return 0;
        }
        return amount;
    }
    
    public int deposit(int accountNumber){
       int amount;
       try{
           while(true){
        System.out.println("\nEnter Amount:");
         amount=input.nextInt();
        if(amount >0 && amount<= 20000){
            break;
        }
        else if(amount<=0){
            System.out.println("\nEnter valid amount");
        }
        else{
            System.out.println("\nYou cannont deposit amount more than 20000 rupees in one time");
        }
           }
            if(isAccountActive(accountNumber)){
                
                Node accountNode=head;
                
                while(accountNode!=null){
                    
                    if(accountNode.status==true){
                        break;
                        
                    }
                    else{
                        accountNode=accountNode.next;
                    }
                }
                accountNode.balance=accountNode.balance+amount;
//                System.out.println("\n"+amount+" deposited to your account");
            }
            
           
       }catch(Exception exe){
           System.out.println("\nInvalid Entry Encountered.");
          return -1;
       }
        return amount;
    }

    
    public void updateAccountInformation(int accountNumber,int pin){
        
    try{
            
            System.out.println("\nWhat you want to update?\n1. Name \n2. Pin \n3. Address \n4. Contact Email \n5. Close ( No upadte )");
            int choice=input.nextInt();
            
            switch(choice){
                
                case 1:
                    input.nextLine();
                    System.out.println("\nEnter new name");
                    String newName=input.nextLine();
                    
                    Node nameNode=head;
                    
                    while(nameNode!=null){
                        if(nameNode.accountNumber== accountNumber){
                            break;
                        }
                        else{
                            nameNode=nameNode.next;
                        }
                    }
                    nameNode.name=newName;
                    System.out.println("\nName updated successfully");
                    this.updateAccountInformation(accountNumber,pin);
                    
                    break;
                    
                case 2:
                    System.out.println("\nEnter new pin");
                    int newPin=input.nextInt();
                    
                     Node pinNode=head;
                    
                    while(pinNode!=null){
                        if(pinNode.accountNumber== accountNumber){
                            break;
                        }
                        else{
                            pinNode=pinNode.next;
                        }
                    }
                    pinNode.pin=newPin;
                    System.out.println("\nPin updated successfully");
                    this.updateAccountInformation(accountNumber,pin);
                    
                    break;
                    
                case 3:
                    input.nextLine();
                    System.out.println("\nEnter new address");
                    String newAddress=input.nextLine();
                    
                    Node addressNode=head;
                    
                    while(addressNode!=null){
                        if(addressNode.accountNumber==accountNumber){
                            break;
                        }
                        else{
                            addressNode=addressNode.next;
                        }
                    }
                    addressNode.address=newAddress;
                    System.out.println("\nAddress updated successfully");
                    this.updateAccountInformation(accountNumber,pin);
                    
                            
                    break;
                    
                case 4:
                    String newContact="";
                    while(true){
                        input.nextLine();
                        System.out.println("\nEnter new contact Email");
                        newContact=input.nextLine();
                        
                        if(newContact.equals("mu40935305@gmail.com")){
                           System.out.println("\nEnter valid email you are not allowed to  enter bank official Email.");
                        }
                       else if(newContact.contains("@gmail.com")){
                            break;
                        }
                        else{
                            System.out.println("\nEmail format is not correct. Enter correct email");
                        }
                    }
                        
                    Node contactNode=head;
                    
                    while(contactNode.next!=null){
                        if(contactNode.status==true && contactNode.accountNumber==accountNumber){
                            break;
                        }
                        else{
                            contactNode=contactNode.next;
                        }
                    }
                    contactNode.contact=newContact;
                     System.out.println("\nContact Email updated successfully");
                    this.updateAccountInformation(accountNumber,pin);

                    break;
                case 5:
                    break ;
            }
        
        
        
    }catch(Exception exe){
        System.out.println("\nInvalid Entry Encountered.");
    }
} 
    }


