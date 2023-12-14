/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author user
 */
public class Singleton implements DesignPattern{

    public Singleton(){}
    
    @Override
    public String patterndescription() {
        return (" ..... Singleton Desgin Pattern ......\n\n"+
                "We use this pattern to ensure that the \n"
               +"UserFile class has only one instance no\n"
               +"other UserFile instances can be made.  \n"
               +"UserFile class acts as a database where \n"
               +"we store users information and can be \n"
               +"accessd only by an instance of UserFile \n"
               +"class\n"
               +"   for more details see Singelton package\n");
    }
    
}
