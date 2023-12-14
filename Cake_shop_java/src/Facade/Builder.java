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
public class Builder implements DesignPattern{

    public Builder(){}
    public String patterndescription() {
        return ("  ..... Builder Desgin Pattern ......  \n\n"+
                "We use it to build the user order that \n"
                +"consists of his/her choice of only one \n"
                +"layer size, one cake base flavor and many \n"
                +"toppings as well as user choice of deliver \n"
                +"the order or recepit from the store \n"
                +"   for more details see Builder package\n");
    
    }
}
