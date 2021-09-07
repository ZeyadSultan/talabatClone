/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Pc
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Pc
 */
public class Order {
    private static int globalId = 0;
    private int orderId;
    private int quantity;
    private String additional_note;
    private String order_date;
    public ArrayList<Meal> meals = new ArrayList<Meal>();
    public int restId;

    public int getRestId() {
        return restId;
    }

    public void setRestId(int restId) {
        this.restId = restId;
    }

    public void setId() {
        this.orderId = globalId;
    }

    public int getId() {
        return orderId;
    }
    
    public Order() {
       globalId++;
    }
 
    
    public void setMeals(ArrayList<Meal> meals) {
        this.meals = meals;
    }
    
    public void addMeal(Meal meal){
        meals.add(meal);
    }
    
    //setters and getters

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setAdditional_note(String additional_note) {
        this.additional_note = additional_note;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getAdditional_note() {
        return additional_note;
    }

    public String getOrder_date() {
        return order_date;
    }
    public float getTotalPrice(Order o){
        float price = 0;
        for(int i=0;i<o.meals.size();i++){
            price += o.meals.get(i).getPrice();
        }
        return price;
    }



}

