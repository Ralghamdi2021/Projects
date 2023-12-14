package SourceCode;

import javax.swing.JOptionPane;
//this(ConcreteStrategy) is related to Strategy from Behavioral Design Pattern

public class VisaPay implements Payment {

    private String cardNo;  // Creadit Card Number
    private String cvvNo;   // cvv Number
    private String year;  //expire year
    private String month;  //expire month
    private String expDate; //expire date
    private Boolean checkingcardNo, checkingcvvNo, checkingexpDate;

    public VisaPay() {

    }

    public VisaPay(String cardNo, String cvvNo, String expDate) {
        this.cardNo = cardNo;
        this.cvvNo = cvvNo;
        this.expDate = expDate;

    }

    public VisaPay(String cardNo, String cvvNo, String month, String year) {
        this.cardNo = cardNo;
        this.cvvNo = cvvNo;
        this.expDate = expDate;
        this.month = month;
        this.year = year;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCvvNo() {
        return cvvNo;
    }

    public void setCvvNo(String cvcNo) {
        this.cvvNo = cvcNo;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public void updateCeditCardInfo(String cardNo, String cvvNo, String expDate) {
        this.cardNo = cardNo;
        this.cvvNo = cvvNo;
        this.expDate = expDate;

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

    //checking if the max card number is 16
    public boolean checkCardNo(String cardNo) {
        this.cardNo = cardNo;

        if (cardNo.length() == 16 && isNumeric(cardNo)) {
            checkingcardNo = true;
            return true;

        }
        return false;
    }

    //checking if the max cvv number is 3
    public boolean checkCVV(String cvv) {

        this.cvvNo = cvvNo;

        if (cvv.length() == 3 && isNumeric(cvv)) {
            checkingcvvNo = true;
            return true;
        }
        return false;
    }

    //checking if the max date(year&month) number is less than 3
    public boolean checkExpDate(String month, String year) {

        this.expDate = month + year;

        if (month.length() < 3 && year.length() < 3) {

            if (isNumeric(month) && isNumeric(year)) {

                //checking that months within 12 and yesr more or equal 21
                if (Integer.parseInt(month) < 13 && Integer.parseInt(year) >= 21) {
                    checkingexpDate = true;
                    return true;

                }
            }
        }
        return false;
    }

    @Override
    public Boolean VerfiyPayment() {
        if (checkingexpDate == true && checkingcvvNo == true && checkingcardNo == true) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void pay() {
        System.out.println("You paid by using Visa");    }
    

}
