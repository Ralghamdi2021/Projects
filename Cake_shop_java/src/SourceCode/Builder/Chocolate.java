package SourceCode.Builder;

import SourceCode.Decorator.ToppingsDecorator;
import java.util.ArrayList;
import java.util.List;

public class Chocolate extends Flavors{

    public Chocolate(Cake cake) {
        super(cake);
    }

    @Override
    public String name() {
        return "Chocolate";
    }

    @Override
    public float price() {
        return 10f;
    }

    @Override
    public String getFlavor() {
        return this.name();
    }
    
    
}