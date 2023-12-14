package SourceCode.Builder;

public abstract class Cake implements Item{

    @Override
    public abstract String name();

    @Override
    public abstract float price();
    
    @Override
    public abstract int getLayers();
    
    @Override
    public abstract String getFlavor();
}
