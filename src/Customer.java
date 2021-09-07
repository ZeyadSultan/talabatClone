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
public class Customer extends Person{
    private String mob_number;
    private String address;
    public ArrayList<Order> latestOrders = new ArrayList<Order>();
    //public ArrayList<Meal> ordered_meals = new ArrayList<Meal>(); 
    public Order currOrder;
    public static int foundCustomer = 0;
    public static int Order = 0;
    
    
    public Customer()
    {

    }
    
    public Customer(String username, String password) {
        super(username, password);
    }

    
    public Customer(String username, String password, String mob_number,String address) {
        super(username, password);
        this.mob_number = mob_number;
        this.address = address;
    }

    public void setMob_number(String mob_number) {
        this.mob_number = mob_number;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMob_number() {
        return mob_number;
    }

    public String getAddress() {
        return address;
    }

    public void createOrder(int restId)
    {
        currOrder = new Order();
        currOrder.setRestId(restId);
        currOrder.setId();
    }
    
    public static boolean validate_login(String Name, String password) {
        boolean valid = false;//to check the availabilty of the input

        for (int i = 0; i < Talabat.customers.size(); i++) {
            if (Talabat.customers.get(i).getUsername().equals(Name)&&Talabat.customers.get(i).getPassword().equals(password))
            {
                valid = true;
                foundCustomer=i;
                break;
            }
        }
        return valid;
    }
    
    public void signUp(String uname,String pass,String mob_number,String address){
        this.signUp(uname, pass);
        this.address=address;
        this.mob_number=mob_number;
    }
    
    public void talab(Meal m, int quantity) {
        m.setQuantity(quantity);
        for(int i=0;i<quantity;i++){
            currOrder.addMeal(m);
        }
    }
//    public void addToOrder(Meal m, int quantity){
//        Order currOrder = new Order();
//        currOrder.setId();
//        
//        
//        
//    }
    public void submitOrder(){
//        o.setMeals(custOrders.get(o.getId()).meals);
        for(int i=0;i<Talabat.owners.size();i++){
            if(Talabat.owners.get(i).restaurant.getID()== currOrder.getRestId()) {
                Talabat.owners.get(i).restaurant.orders.add(currOrder);
            }
//            for(int j=0;j<currOrder.meals.size();j++){
//                if(Talabat.owners.get(i).restaurant.getID()==currOrder.meals.get(j).getID())
//                {
//                    Talabat.owners.get(i).restaurant.orders.add(currOrder);
//                }
//            }

        }
        latestOrders.add(currOrder);
        //currOrder = null;
    }  
}
    



