/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SourceCode.Builder;

import SourceCode.Decorator.Caramel;
import SourceCode.Decorator.Nuts;
import SourceCode.Decorator.Sprinkles;
import SourceCode.Decorator.Strawberries;

/**
 *
 * @author user
 */
public class OrderBuilder {
    Cake cake;
    OrderdItems itemsOrder;

    public OrderdItems prepareCake(String base, int layer, boolean delivery){
        itemsOrder = new OrderdItems();
         if(base.trim().equals("Chocolate")){
                cake = new Chocolate(cake);
                itemsOrder.addItem(cake);
                addLayers(layer);
                addDelivery(delivery);
         }else if(base.trim().equals("Vanilla")){
                cake = new Vanilla(cake);
                itemsOrder.addItem(cake);
                addLayers(layer);
                addDelivery(delivery);
         }else if(base.trim().equals("RedVelvet")){
                cake = new RedVelvet(cake);
                itemsOrder.addItem(cake);
                addLayers(layer);
                addDelivery(delivery);
         } 
         return itemsOrder;
    }
         public OrderdItems addLayers(int layer){
             if(layer==1){
                    cake = new OneLayer(cake);
                    itemsOrder.addItem(cake); 
             }else if(layer==2){
                    cake = new TwoLayers(cake);
                    itemsOrder.addItem(cake); 
             }else if(layer==3){
                    cake = new ThreeLayers(cake);
                    itemsOrder.addItem(cake); 
             }
            return itemsOrder;        
         }
        
         
         public OrderdItems addDelivery(boolean delivery){
             if(delivery==true)
                 itemsOrder.addItem(new Delivery());
            return itemsOrder;  
         }
         public Cake getCake(){
             return cake;
         }

   
}
