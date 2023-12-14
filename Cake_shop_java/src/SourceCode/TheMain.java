package SourceCode;

import Facade.PatternMaker;
import Singleton.UserFile;
import SourceCode.Builder.Cake;
import SourceCode.Builder.OneLayer;
import SourceCode.Builder.OrderBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import SourceCode.Builder.OrderdItems;
import SourceCode.Builder.ThreeLayers;
import SourceCode.Builder.TwoLayers;
import SourceCode.Decorator.Caramel;
import SourceCode.Decorator.Nuts;
import SourceCode.Decorator.Sprinkles;
import SourceCode.Decorator.Strawberries;
import cpit252cakeproject.Home;
import cpit252cakeproject.Login;
import cpit252cakeproject.Signup;
import static cpit252cakeproject.Signup.userInfo;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TheMain {

    public static void main(String[] args) throws IOException {
      ///////////////////////////////////////Facade Design Pattern///////////////////////////////
      PatternMaker shapeMaker = new PatternMaker();
      System.out.println(shapeMaker.describeSingleton());
      System.out.println(shapeMaker.describeBuilder());
      System.out.println(shapeMaker.describeDecorator());
      System.out.println(shapeMaker.describeStrategy());
       ///////////////////////////////////////Singlrton Design Pattern///////////////////////////////
       UserFile usersFile = UserFile.getInstance();
       //------------------------------------------------------------- 
       // log in method
       User currentuser;
       System.out.println("---------- Golden Slice --------------\n");
       do{
          currentuser = login();
       }while(currentuser==null);
       //-------------------------------------------------------------    
       
        OrderBuilder builder=new OrderBuilder(); 
        OrderdItems orderedItems = null ;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean isDeliver;
       
        System.out.println("============================");
        System.out.println("        1. Home Deliver      ");
        System.out.println("        2. recieve from the shop\n");
        System.out.println("   Choice : ");
        int ch = Integer.parseInt(br.readLine());
        if(ch==1)
            isDeliver = true;
        else
            isDeliver = false;

        System.out.println(" Enter the choice of the cake you want");
        System.out.println("============================");
        System.out.println("        1. Chocolate cake      ");
        System.out.println("        2. Vanilla   cake   ");
        System.out.println("        3. RedVelvet cake   ");
        System.out.println("        4. Exit            ");
        System.out.println("============================");

        int cakeChoice = Integer.parseInt(br.readLine());//read int from the buffer
        int layer;
        String toppings;
        switch (cakeChoice) {
            case 1: layer = layers(br);
                    orderedItems = builder.prepareCake("Chocolate", layer, isDeliver);
                    toppings = toppings(br);
                    addToppings(orderedItems,toppings,builder.getCake());
                    break;
            case 2: layer = layers(br); 
                    orderedItems = builder.prepareCake("Vanilla", layer, isDeliver);
                    toppings = toppings(br);
                    addToppings(orderedItems,toppings,builder.getCake());
                    break;
            case 3: layer = layers(br); 
                    orderedItems = builder.prepareCake("RedVelvet", layer, isDeliver);
                    toppings = toppings(br);
                    addToppings(orderedItems,toppings,builder.getCake());
                    //orderedItems = builder.prepareCake("RedVelvet", layer,toppings, isDeliver);
                    break;   
            case 4: System.exit(0);
                    break;
        }//end of  Switch 
        
        System.out.println(orderedItems.getItems().size());
        for(int i = 0 ; i< orderedItems.getItems().size() ; i++){
            System.out.println(orderedItems.getItems().get(i).name()+"        "+orderedItems.getItems().get(i).price());
        }
        System.out.println("-------------------------\nTotal price :       "+orderedItems.getCost());
         
        ///////////////////////////////////////Strategy Design Pattern///////////////////////////////
        System.out.println("Please select the payment method you want:");
        System.out.println("------------------------");
        while (true) {
            System.out.println("1-Paypal\n2-Visa\n3-STC Pay\n4-Cash");
            Scanner scan = new Scanner(System.in);
            String choice = scan.next();
            //Pay pay;
            if (choice.matches("1")) {
                //Pay paypal=Pay(new Paypal());
//Pay pay=new Pay(new Paypal());
                System.out.println("Enter your Email:");
                String email = scan.next();
                Paypal paypal = new Paypal();

                while (!paypal.Email(email)) {
                    System.out.println("Enter correct Email address:");
                    email = scan.next();
                }

                System.out.println("Enter your password:");
                String password = scan.next();

                while (!paypal.Password(password)) {
                    System.out.println("Enter correct password:");
                    password = scan.next();
                }
                Pay pay = new Pay(new Paypal(email, password));
                pay.pay.pay();

                break;
            }
            if (choice.matches("2")) {
                VisaPay Visa = new VisaPay();
                System.out.println("Enter Creadit Card Number");
                String Creadit = scan.next();

                System.out.println("Enter cvv Number");
                String cvv = scan.next();

                System.out.println("Enter month");
                String month = scan.next();

                System.out.println("Enter year");
                String year = scan.next();

                while (!Visa.checkCVV(cvv) && !Visa.checkCardNo(Creadit) && !Visa.checkExpDate(month, year)) {
                    System.out.println("Enter correct information");
                    System.out.println("Enter Creadit Card Number");
                    Creadit = scan.next();

                    System.out.println("Enter cvv Number");
                    cvv = scan.next();

                    System.out.println("Enter month");
                    month = scan.next();

                    System.out.println("Enter year");
                    year = scan.next();

                }
                Pay pay = new Pay(new VisaPay(Creadit, cvv, month, year));
                pay.pay.pay();
                break;

            }
            if (choice.matches("3")) {
                System.out.println("Enter your phone number:");
                String phoneNumber = scan.next();

                STCpay stc = new STCpay();
                while (!stc.VerfiyPhoneNumber(phoneNumber)) {

                    System.out.println("Enter correct phone number:");
                    phoneNumber = scan.next();

                }
                Pay pay = new Pay(new STCpay());
                pay.pay.pay();
                break;

            }
            if (choice.matches("4")) {
                System.out.println("you selected to pay cash ");
                break;

            }
        }
        System.out.println("Thank you");

    }
    public static User login(){
        Scanner s = new Scanner(System.in);
       System.out.print("Entre user name : ");
       String username = s.nextLine();
       System.out.print("Entre password : ");
       String password = s.nextLine();
               
        if(!(username.equals("")) && !(password.equals(""))) {
            try {
                if (User.isUser(username) == false) {
                    username = username.trim();
                    password = password.trim();
                    if( User.dataVerification(username,password) == true){
                        System.out.println("Succfully log in");
                        return User.findCurrenetUser(username);
                       
                    }else{
                        System.out.println("you can't get into your account, email and pass does'nt match ");
                    }
                } else {
                    System.out.println( "Account Doesn't exit!! Please Try Again");
                }
            } catch (IOException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Please Fill All Fields Correctly");
        }
       return null;
    }
public static int layers(BufferedReader br) throws IOException{

                System.out.println("You ordered Chocolate cake");
                System.out.println("\n");
                System.out.println(" Enter the number of Layers: ");
                System.out.println("------------------------------");
                System.out.println("        1.One Layer        ");
                System.out.println("        2.Two Layer       ");
                System.out.println("        3.Three Layer        ");
                System.out.println("------------------------------");

                return Integer.parseInt(br.readLine());
}
public static String toppings(BufferedReader br) throws IOException{
                        System.out.println("Enter the types of toppings you want in one line ");
                        System.out.println("------------------------------------");
                        System.out.println("    1. Strawberries");
                        System.out.println("    2. Sprinkles ");
                        System.out.println("    3. Nuts");
                        System.out.println("    4. Caramel");
                        System.out.println("------------------------------------");

                        return br.readLine();
}
public static void addToppings(OrderdItems itemsOrder,String toppings, Cake cake){
             if(toppings.contains("1"))
                itemsOrder.addTopping(new Strawberries(cake));
             if(toppings.contains("2"))
                itemsOrder.addTopping(new Caramel(cake));
             if(toppings.contains("3"))
                itemsOrder.addTopping(new Sprinkles(cake));  
             if(toppings.contains("4"))
                itemsOrder.addTopping(new Nuts(cake));
               
         }
}

   

