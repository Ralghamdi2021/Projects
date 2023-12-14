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
public class Decorator implements DesignPattern{

    public Decorator(){}
    @Override
    public String patterndescription() {
        return (" ..... Decorator Desgin Pattern ......      \n"+
                "We use this pattern to let the user add \n"
                + "toppings as much as his/her wants, \n"
                + "their additional cost will be added \n"
                + "to the cake cost"
                +"   for more details see Decorator package\n");
    }
    
}
