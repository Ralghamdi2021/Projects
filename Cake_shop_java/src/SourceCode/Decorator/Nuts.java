package SourceCode.Decorator;

import SourceCode.Builder.Cake;



public class Nuts extends ToppingsDecorator{

    public Nuts(Cake decoratorcake) {
        super(decoratorcake);
    }

    @Override
    public String name() {
        return "Nuts";
    }

    @Override
    public float price() {
        return 20f;
    }

}