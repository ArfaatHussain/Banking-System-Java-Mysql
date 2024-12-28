///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Backend;
//
///**
// *
// * @author DELL
// */
//import java.util.Scanner;
//import java.util.Properties;
//import javax.mail.*;
//import javax.mail.internet.*;
//
//public class Bank {
//
//    private Account accounts;
//    private String bankName;
//    private String bankAddress;
//    public final String bankEmail = "bankaljazira8@gmail.com";
//    public final String bankGmailPassword = "otmi tpfu vvqr bngm";
//
//
//    Bank() {
//        accounts = new Account();
//        bankName = "Bank AlJazira";
//        bankAddress = "Attock City";
//        
//    }
//    Scanner input=new Scanner(System.in);
//    
//    public void run(){
//        try{
//            
//        System.out.println("\nWhat do you want to do?.\n1. Create Account \n2. Login \n3. Close Application\n\nSelect Your option?");
//        
//        int Choice=input.nextInt();
//        
//        if(Choice==1){
//            this.createAccount();
//        }
//        else if(Choice==2){
//            this.login();
//        }
//        
//        else if(Choice==3){
//            System.out.println("Application Closed");
//               System.exit(0);
//        }
//        else{
//            System.out.println("\nWrong input try again");
//            System.exit(0);
//        }
//        }catch(Exception exe){
//            System.out.println("\nInvalid Entry Encountered.");
//        }
//    }
//
//    public void login(){
//        try{
//        int accountNumber=0;
//        int pin=0;
//        
//        String per="yes";
//        boolean condition=false;
//       String termination = "";
//       
//      while(true){
//        System.out.println("\nEnter Account Number: ");
//         int accNumber=input.nextInt();
//         accountNumber=accNumber;
//         
//        System.out.println("\nEnter Pin: ");
//        int accPin=input.nextInt();
//        pin=accPin;
//        
//        if(accounts.isAccountExists(accountNumber) && accounts.isPinCorrect(accountNumber, pin)){
//            break;
//        }
//        else{
//            System.out.println("\nWrong Account Number or Pin.  Try again\n1. Navigate to Home Page\n2.Try again for login");
//            int con=input.nextInt();
//            
//            if(con==1){
//                this.run();
//            }
//            else{
//                this.login();
//            }
//        }
//      }
//       
//        if(accounts.isAccountExists(accountNumber) && accounts.isPinCorrect(accountNumber , pin)){
//            accounts.activeAccount(accountNumber);
//            
//           while(per.equalsIgnoreCase("yes")){
//           System.out.println("\nSelect what you want to do?\n1. Deposit \n2. Withdraw \n3. Transfer Money \n4. Delete Account \n5. Update Account Information \n6. Display Account Information \n7. Logout \n8. Close Application ");
// 
//         
//           int choice=input.nextInt();
//                    
//           switch(choice){
//               
//               case 1:
//                   
//                   int amountDeposit=accounts.deposit(accountNumber);
//                   String bodyDeposit=accounts.getEmailBody(choice,amountDeposit);
//                   this.sendEmail(bodyDeposit,"Tansaction Happenened");
//                   break;
//                   
//               case 2:
//                   
//                int amountWithdraw=accounts.withdraw(accountNumber);
//                String bodyWithdraw=accounts.getEmailBody(choice, amountWithdraw);
//                this.sendEmail(bodyWithdraw,"Tansaction Happenened");
//                break;
//                
//               case 3:
//                   
//                    int array[]=new int[2];
//                    array=this.transferFunds(accountNumber);
//                    int toAccountNumber=array[0];
//                    int amount=array[1];
//                    String senderBody=accounts.getEmailBody(3,amount,toAccountNumber ,1 );
//                    String receiverBody=accounts.getEmailBody(3, amount, toAccountNumber, 2);
//                    
//                    this.sendEmail(senderBody,"Tansaction Happenened");
//                    this.sendEmail(receiverBody,toAccountNumber,"Tansaction Happenened");
//                   break;
//                   
//               case 4:
//                   
//                   this.deleteAccount(accountNumber);
//                   this.run();
//                   break;
//                   
//               case 5:   
//                   
//                   while(true){
//                       
//                   System.out.println("\nEnter Pin to verify its you?");
//                   int accountPin=input.nextInt();
//        
//                   if(accounts.isPinCorrect(accountNumber, accountPin)){
//                        if(accounts.isAccountActive(accountNumber)){
//                            accounts.updateAccountInformation(accountNumber,accountPin);
//                            break;
//                   }
//                   }
//                   else{
//                       System.out.println("\nError! Wrong pin try again");
//                   }
//                   
//                   }
//                   break;
//               case 6:
//                   
//                   accounts.displayAccount(accountNumber);
//                  
//                   break;
//                   
//               case 7:
//                   
//                   condition=true;
//                   accounts.deavtivateAccount();
//                   this.run();
//                   break;
//               case 8:
//                   termination="close";
//                   System.out.println("Application Closed");
//                   System.exit(0);
//                   break;
//                   
//           }
//           if(condition==true){
//               break;
//           }
//           
//           
//        }
//           
//                
//}
//        else{
//            if(accounts.isAccountExists(accountNumber)== false){
//                System.out.println("Error! Wrong Account Number");
//            }
//            else if(accounts.isPinCorrect(accountNumber, pin) == false){
//                System.out.println("Error! Wrong pin");
//            }
//            else{
//                System.out.println("Error");
//            }
//        
//        }
//        }catch(Exception exe){
//           System.out.println("\nInvalid Entry Encountered.");
//        }
//    
//}
//    public void createAccount() {
//        try{
//            
//        int CNIC=0;
//        
//        System.out.println("\nEnter Name:");
//        String name=input.next();
//        
//        input.nextLine();
//        System.out.println("\nEnter Address:");
//        String address=input.nextLine();
//        
//        while(true){
//            
//        System.out.println("\nEnter CNIC:");
//        int cnic=input.nextInt();
//        CNIC=cnic;
//        
//        String comparissionCNIC=String.valueOf(cnic);
//        
//        if(comparissionCNIC.length() == 6 && accounts.isCNICExist(cnic)==false){
//        
//            break;
//            
//        }
//        else{
//            if(comparissionCNIC.length()!=6){
//                System.out.println("\nEnter valid CNIC ( Check length )");
//            }
//            else{
//            System.out.println("\nAccount already registered on the CNIC. Try another CNIC ");
//            }
//
//        }
//}
//        String contact;
//         input.nextLine();
//        while(true){
//            
//            System.out.println("\nEnter contact Email:");
//             contact=input.nextLine();
//             if(contact.equals(bankEmail)){
//                 System.out.println("\nEnter valid email you are not allowed to  enter bank official Email.");
//             }
//             else if(contact.contains("@gmail.com")){
//                break;
//            }
//            
//            else{
//                System.out.println("\nEmail format is not correct. Enter correct email");
//            }
//                    
//        }
//        int accountNumber=accounts.assignAccountNumber();
//        
//        int pin;
//        while(true){
//        System.out.println("\nEnter Pin:");
//         pin=input.nextInt();
//        String accountPin=String.valueOf(pin);
//        
//        if(accountPin.length()==4){
//            break;
//        }
//        
//        else{
//            if(accountPin.length()<4){
//            System.out.println("\nPin length can't less than 4 digit");
//            }
//            else{
//                System.out.println("\nPin length can't exceed 4 digit");
//            }
//        }
//        }
//        
//        int balance=0;
//        accounts.addAccount(name, address, CNIC, contact ,accountNumber, pin ,balance);
//        String body="\n      -------Bank AlJazira-------\n\n\nDear "+name+"\n      Your account is registered in our bank. Your account number is "+accountNumber+"\n\n             Thanks for registration";
//        String title="Account Registered";
////        this.sendEmail(contact,body,title);
//        this.run();
//        }catch(Exception exe){
//             System.out.println("\nInvalid Entry Encountered.");
//        }
//    }
//    
//    public void deleteAccount(int accountNumber) {
//
//        if(accounts.isAccountExists(accountNumber) && accounts.isAccountActive(accountNumber)){
//            accounts.deleteAccount();
//        }
//        else{
//            System.out.println("Account does not exist.");
//        }
//    }
//
//    public void listsAccount() {
//        
//        accounts.displayAccounts();
//
//    }
//
//    public int [] transferFunds(int accountNumber) {
//          int array[]=new int[2];
//        try{
//        int amount;  
//        int pin;
//        int toAccountNumber;
//        while(true){
//        System.out.println("\nEnter Account Number in which you want to transfer money: ");
//         toAccountNumber=input.nextInt();
//        if(accountNumber!=toAccountNumber && accounts.isAccountExists(toAccountNumber)){
//            break;
//        }
//        else{
//            if(accounts.isAccountExists(toAccountNumber) ==false){
//                System.out.println("\nAccount does't exist. Try another account");
//            }
//            else if(accountNumber==toAccountNumber){
//            System.out.println("\nYou can't enter your account number try another account");
//            }
//        }
//        }
//        
//        while(true){
//            
//        System.out.println("\nEnter your Account Pin:");
//        int accountPin=input.nextInt();
//        
//        if(accounts.isPinCorrect(accountNumber, accountPin)){
//            pin=accountPin;
//            break;
//        }
//        else{
//            System.out.println("Wrong Pin Try again");
//        }
//        }
//        
//        while(true){
//        System.out.println("\nEnter Amount: ");
//         amount=input.nextInt();
//        if(amount>0 && accounts.isAmountAvalible(accountNumber, amount)){
//            break;
//        }
//        else if(amount >0 && accounts.isAmountAvalible(accountNumber, amount)==false){
//            System.out.println("\nInsufficient amount in your account. Try again");
//        }
//        else if(amount<=0){
//            System.out.println("\nEnter valid amount. Try again");
//        }
//        
//        }
//        // checking both account exists and amount avalible 
//        if(accounts.isAccountExists(accountNumber)&&accounts.isAccountExists(toAccountNumber) && accounts.isAmountAvalible(accountNumber, amount) && accounts.isPinCorrect(accountNumber, pin)){
//            accounts.transferFunds(accountNumber, toAccountNumber, amount);
//            array[0]=toAccountNumber;
//            array[1]=amount;
//        }
//        else{
//            if(accounts.isAccountExists(accountNumber)==false || accounts.isAccountExists(toAccountNumber)==false){
//                System.out.println("Error! Account Does't Exist");
//            }
//            else if(accounts.isAmountAvalible(accountNumber, amount) ==false){
//                System.out.println("Error! Amount is not sufficient in your account");
//            }
//            else if(accounts.isPinCorrect(accountNumber, pin) == false){
//                System.out.println("Error! Wrong Pin");
//            }
//            else{
//                System.out.println("Error");
//            }
//        }
//        }catch(Exception exe){
//            System.out.println("\nInvalid Entry Encountered.");
//            return array;
//        }
//        return array;
//    }
//    
//    void sendEmail(String body,String title){
//        
//        String recipientEmail = accounts.getEmailOfActiveAccount();
//        
////        this.sendEmail(recipientEmail,body,title);
//        
//        
//    }
//    void sendEmail(String body,int accountNumber,String title){
//        
//        String recipientEmail = accounts.getEmailOfAccontNumber(accountNumber);
//        
////        this.sendEmail(recipientEmail,body,title);
//        
//        
//    }
//    
//  
////    private void sendEmail(String recipientEmail,String body,String title){
////        Properties props = new Properties();
////        props.put("mail.smtp.auth", "true");
////        props.put("mail.smtp.starttls.enable", "true");
////        props.put("mail.smtp.host", "smtp.gmail.com");
////        props.put("mail.smtp.port", "587");
////
////        Session session = Session.getInstance(props,
////                new javax.mail.Authenticator() {
////                    @Override
////                    protected PasswordAuthentication getPasswordAuthentication() {
////                        return new PasswordAuthentication(bankEmail, bankGmailPassword);
////                    }
////                });
////
////        try {
////            Message message = new MimeMessage(session);
////            message.setFrom(new InternetAddress(bankEmail));
////            message.setRecipients(Message.RecipientType.TO,
////                    InternetAddress.parse(recipientEmail));
////            
////            message.setSubject(title);
////            
////            message.setText(body);
////
////            Transport.send(message);
////
////            System.out.println("Email sent successfully.");
////
////        } catch (MessagingException e) {
////            throw new RuntimeException(e);
////        }
////    }
//
//    public void setBankName(String name) {
//        this.bankName = name;
//    }
//
//    public String getBankName() {
//        return bankName;
//    }
//
//    public void setBankAddress(String address) {
//        this.bankAddress = address;
//    }
//
//    public String getBankAddress() {
//        return bankAddress;
//    }
//
//}