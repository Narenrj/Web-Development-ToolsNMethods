/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movies.model;

import java.util.ArrayList;

/**
 *
 * @author naren
 */
public class Cart {

    private ArrayList<String> itemsList = new ArrayList<String>();
    

    public ArrayList<String> getItemsList() {
        return itemsList;
    }

    public void addItemsList(String[] items) {
        for(int i=0; i<items.length; i++)
        {
            itemsList.add(items[i]);
        }
    }
    
    public void removeItemsList(String s) {
        if(itemsList.contains(s)){
            System.out.println("Found");
        }else
             System.out.println("Not Found");
        itemsList.remove(s);
    }
    

    @Override
    public String toString() {
        return "Cart{" + "itemsList=" + itemsList + '}';
    }
}
