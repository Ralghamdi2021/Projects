package SourceCode.Decorator;

import SourceCode.Builder.Cake;



public class Sprinkles extends ToppingsDecorator{

    public Sprinkles(Cake decoratorcake) {
        super(decoratorcake);
    }

    @Override
    public String name() {
        return "Sprinkles";
    }

    @Override
    public float price() {
        return 5f;
    }
    

}