package SourceCode;
//this(ConcreteStrategy) is related to Strategy from Behavioral Design Pattern

public class Paypal implements Payment {

    private String Email;  //email and password used for paypal account
    private String Password;
    
    public boolean checkEmail, checkPassword;

    public Paypal() {
    }

    public Paypal(String Email, String Password) {
        this.Email = Email;
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Boolean Email(String Email) {
        if (Email.contains("@")) {
            checkEmail = true;
            return true;
        } else {
            return false;
        }

    }

    public Boolean Password(String Password) {
        if (Password.length() > 10) {//minimum password character is 10
            checkPassword = true;
            return true;
        } else {
            return false;
        }

    }

    @Override
    public Boolean VerfiyPayment() {

        if (checkEmail == true && checkPassword == true) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void pay() {
        System.out.println("You paid by using Paypal");    }

}
