package SourceCode.Decorator;

import SourceCode.Builder.Cake;



public class Strawberries extends ToppingsDecorator{

    public Strawberries(Cake decoratorcake) {
        super(decoratorcake);
    }
    
    @Override
    public String name() {
        return "Strabwbberries";
    }

    @Override
    public float price() {
        return 10f;
    }

}