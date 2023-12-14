package SourceCode.Builder;




public class OneLayer extends Layers{

    public OneLayer(Cake cake) {
        super(cake);
    }
    
    @Override
    public String name() {
        return "One layer";
    }

    @Override
    public float price() {
        return 20f;
    }

    @Override
    public int getLayers() {
        return 1;
    }
}