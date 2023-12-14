package SourceCode;
//this(ConcreteStrategy) is related to Strategy from Behavioral Design Pattern

public class STCpay implements Payment {


    public String PhoneNumber;
 public STCpay() {
    }
    public STCpay(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }
    @Override
    public Boolean VerfiyPayment() {
        if(VerfiyPhoneNumber(PhoneNumber)==true)return true;
        else return false;
    }
    
      // checking if the input from user is numerical
    public boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public Boolean VerfiyPhoneNumber(String PhoneNumber) {
        this.PhoneNumber=PhoneNumber;

        boolean isNumber=isNumeric(PhoneNumber);
        if (isNumber==true&&PhoneNumber.startsWith("966") && PhoneNumber.length() == 12) {
            return true;
        }
        if (isNumber==true&&PhoneNumber.startsWith("05") && PhoneNumber.length() == 10) {
            return true;
        } else {
            return false;
        }
}

    @Override
    public void pay() {
        System.out.println("You paid by using STC pay");    }

}
