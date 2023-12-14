
package SourceCode;
//this (Context)is related to Strategy from Behavioral Design Pattern

public class Pay {
    Payment pay;

    public Pay(Payment pay) {
        this.pay = pay;
    }
            
         public void selectPaymentMethod(){
         
         pay.VerfiyPayment();
         }
            
            
}
