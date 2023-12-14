package SourceCode.Builder;


public class ThreeLayers extends Layers{
   
     public ThreeLayers(Cake cake) {
        super(cake);
    }

    @Override
    public String name() {
            return "Three layers"; 
    }
    @Override
    public float price() {
        return 60f;
    }
    @Override
    public int getLayers() {
        return 3;
    }
    
    
  
    
    
    
}
