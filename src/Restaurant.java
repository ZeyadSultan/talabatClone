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
public class Restaurant {
    private String  name; 
    private String address;
    private String phone;
    private String description;

  
    public ArrayList<Meal> meals = new ArrayList<Meal>();   /*to get all the meals of the restaurant  */
    public ArrayList<Order> orders = new ArrayList<Order>();
    private int ID;
//    public void getRestById(int id){
//        for(int i=0;i<Talabat.owners.size();i++){
//            for(int j=0;j<Talabat.owners.get(i).restaurants.size();j++){
//                if(Talabat.owners.get(i).restaurant.getID()==currOrder.meals.get(j).getID())
//                {
//                    Talabat.owners.get(i).restaurant.orders.add(currOrder);
//                }
//            }
//        }
//    }
    //setters and getters
    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
      public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    


    // This function check the name of meal , if it exist, will return
    public boolean CheckMeal(String name)
    {
        Boolean exist = false;
        int indexOfMeals = 0;
        Meal meal;
        for(int i=0; i<meals.size(); i++)
        {
            meal = meals.get(i);
            if(name==meal.getName())
            {
                exist = true;
            }
        }
       return exist;

    }

    public void addmeal(String name, String description, float price, int ID){
           Meal newMeal = new Meal(name,description,price,ID);//create a new object from class meal
           //to set the the input that the user entered
           
           meals.add(newMeal);// a method in class ArrayList
    }
    //a method to remove the meal
    public void removeMeal(String name)
    {
        int Found =0;
        for(int i=0; i<meals.size();i++)
        {
            Meal meal = meals.get(i);
            if(meal.getName()==name)
            {
                Found = i;
                break;
            }
        }
        meals.remove(Found);
    }
    public void editMeals(String oMeal,String newName, String newDescription, float newPrice){
        int index=0;
        for(Meal m : meals)
        {
            if(oMeal==m.getName())
            {
                break;
            }
            index++;
        }
        meals.set(index,new Meal(newName,newDescription,newPrice));
    }
    
    public boolean checkCode(int ID)
    {
        boolean valid = true;
        for(int i=0; i<Talabat.owners.size();i++)
        {
            if(Talabat.owners.get(i).restaurant.getID()==ID)
            {
                valid = false;
            }
        }
        return valid;
    }
    
   

}



