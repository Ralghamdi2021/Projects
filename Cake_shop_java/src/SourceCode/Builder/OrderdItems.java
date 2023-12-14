/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SourceCode.Builder;

import SourceCode.Decorator.ToppingsDecorator;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class OrderdItems {
    private List<Item> items = new ArrayList<Item>();
    private List<ToppingsDecorator> toppings = new ArrayList<ToppingsDecorator>();
    boolean isDeliver;
    
    public void setDeliver(){
        isDeliver = true;
    }

    public List<Item> getItems() {
        return items;
    }
    public boolean getDeliver(){
        return isDeliver;
    }

    public void addItem(Item item) {
        items.add(item);
    }
    public void addTopping(ToppingsDecorator topping) {
        toppings.add(topping);
        addItem(topping);
    }

    public float getCost() {
        float cost = 0.0f;

        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public String showItems() {
        String s ="";
        for (Item item : items) {
            s = s+"   "+item.name()+" "+item.price();

        }
        return s;
    }
    public String showToppings(){
        String s ="";
        for (ToppingsDecorator topping : toppings) {
            if(s=="")
                s = topping.name();
            else
                s = s+" ,"+topping.name();

        }
        return s;
    }
    
}
