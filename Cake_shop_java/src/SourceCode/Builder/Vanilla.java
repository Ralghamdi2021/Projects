package SourceCode.Builder;

import SourceCode.Decorator.ToppingsDecorator;
import java.util.ArrayList;
import java.util.List;

public class Vanilla extends Flavors{
   public Vanilla(Cake cake) {
        super(cake);
    }

    @Override
    public String getFlavor() {
        return this.name();
    }
    
    @Override
    public String name() {
        return "Vanilla";
    }

    @Override
    public float price() {
        return 10f;
    }

    
}