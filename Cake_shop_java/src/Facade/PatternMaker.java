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
public class PatternMaker {
    private DesignPattern Builder;
    private DesignPattern Decoratore;
    private DesignPattern Singleton;
    private DesignPattern Startegy;
    
    public PatternMaker(){
       Builder = new Builder();
       Decoratore = new Decorator();
       Singleton = new Singleton();
       Startegy = new Strategy();
    }
    public String describeSingleton(){
        return Singleton.patterndescription();
    }
    public String describeBuilder(){
        return Builder.patterndescription();
    }
    public String describeDecorator(){
        return Decoratore.patterndescription();
    }
    public String describeStrategy(){
        return Startegy.patterndescription();
    }

}
