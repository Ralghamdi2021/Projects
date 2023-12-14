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
public class Delivery implements Item{

    
    public String name() {
        return "Home Delivery";
    }

  
    public float price() {
        return 30;
    }

    @Override
    public int getLayers() {
        return 0;
    }

    @Override
    public String getFlavor() {
        return null;
    }

    
}
