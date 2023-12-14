package SourceCode.Builder;




public class TwoLayers extends Layers{
  
     public TwoLayers(Cake cake) {
        super(cake);
    }
    @Override
    public String name() {
        return "Two layers";
    }

    @Override
    public float price() {
        return 40f;
    }

    @Override
    public int getLayers() {
        return 2;
    }
   

    
    
}