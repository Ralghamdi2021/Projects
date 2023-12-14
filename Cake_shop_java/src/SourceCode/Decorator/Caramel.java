package SourceCode.Decorator;

import SourceCode.Builder.Cake;



public class Caramel extends ToppingsDecorator{

    public Caramel(Cake decoratorcake) {
        super(decoratorcake);
    }

    @Override
    public String name() {
        return "Caramel";
    }

    @Override
    public float price() {
        return 15f;
    }
    

    
}