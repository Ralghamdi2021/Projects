
package SourceCode;

import Singleton.UserFile;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class User {
    private String firstName;
    private String lastName;
    private String Email;
    private String Password;
    private String ConfirmPassword;
    private String Phone;
    private String Address;

    public User( String firstName, String lastName, String Email, String Password, String Phone, String Address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Email = Email;
        this.Password = Password;
        this.Phone = Phone;
        this.Address = Address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPassword() {
        return Password;
    }

    public void setConfirmPassword(String ConfirmPassword) {
        this.ConfirmPassword = ConfirmPassword;
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getPhone() {
        return Phone;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getAddress() {
        return Address;
    }

    public static boolean isUser(String currentEmail) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(UserFile.getInstance().getUsersFile()));
        String line = "";
        while ((line = input.readLine()) != null) {
            String[] info = line.split(" ");
            String firstName = info[0];
            String lastName = info[1];
            String Email = info[2];
            String Password = info[3];
            String Phone = info[4];
            String Address = info[5];
            if (Email.equals(currentEmail)) {
                return false;

            }
        }
        return true;
    }
    
    public static boolean dataVerification(String currentEmail, String currentpassword) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(UserFile.getInstance().getUsersFile()));
        String line = "";
        while ((line = input.readLine()) != null) {
            String[] info = line.split(" ");
            String firstName = info[0];
            String lastName = info[1];
            String Email = info[2];
            String Password = info[3];
            String Phone = info[4];
            String Address = info[5];
            
            if (Email.trim().equals(currentEmail) && Password.trim().equals(currentpassword)) {
                return true;
            }
        }
        return false;
    }

    public void writeInFile(String f_name, String l_name, String email, String pass, String phone, String address) throws IOException {
        BufferedWriter userFile = new BufferedWriter(new FileWriter(UserFile.getInstance().getUsersFile(), true));
        userFile.write(f_name + " " + l_name + " " + email + " " + pass + " " + phone + " " + address + "  \n");
        userFile.close();

    }

    public static User findCurrenetUser(String currentEmail) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(UserFile.getInstance().getUsersFile()));
        String line = "";
        while ((line = input.readLine()) != null) {
            String[] info = line.split(" ");
            String firstName = info[0];
            String lastName = info[1];
            String Email = info[2];
            String Password = info[3];
            String Phone = info[4];
            String Address = info[5];
            if (Email.trim().equals(currentEmail)) {
                return new User(info[0],info[1],info[2],info[3],info[4],info[5]);
            }
        }
        return null;
    }


}
