package SourceCode.Builder;

import SourceCode.Decorator.ToppingsDecorator;
import java.util.ArrayList;
import java.util.List;

public class RedVelvet extends Flavors{
    
    public RedVelvet(Cake cake) {
        super(cake);
    }

    @Override
    public String getFlavor() {
        return this.name();
    }

    @Override
    public String name() {
            return "Red Velvet"; 
    }
    @Override
    public float price() {
        return 20f;
    }
    
}
