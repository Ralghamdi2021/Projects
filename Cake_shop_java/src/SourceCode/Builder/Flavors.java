/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SourceCode.Builder;

/**
 *
 * @author user
 */
public abstract class Flavors extends Cake{
    Cake cake;
    
     public Flavors(Cake cake) {
        this.cake = cake;
    }
  
    @Override
    public int getLayers(){
        return cake.getLayers();
    }
    
}
