
package SourceCode.Decorator;

import SourceCode.Builder.Cake;

public abstract class ToppingsDecorator extends Cake {

      Cake cake;
    
     public ToppingsDecorator(Cake decoratorcake) {
        this.cake = decoratorcake;
    }
   @Override
    public String name() {
        return this.cake.name();
    }
    @Override
    public float price() {
       return this.cake.price();
    }
      @Override
    public int getLayers(){
        return cake.getLayers();
    }
    public String getFlavor(){
        return cake.getFlavor();
    }


 

}
