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
public class Owner extends Person{
    Restaurant restaurant = new Restaurant();
    public static int foundOwner=0;
    //constructors
    public Owner(){
    }

    public Owner(String username, String password) {
        super(username, password);
    }
    
    public Owner(String username, String password, String rName) {
        super(username, password);
        restaurant.setName(rName);
    } 
    
    public static boolean validate_login(String Name , String password) {
        boolean valid = false;//to check the availabilty of the input
        //loop around the array of the available users that we have wrote
        
        
            for (int i = 0; i < Talabat.owners.size(); i++) 
            {
                if (Talabat.owners.get(i).getUsername().equals(Name)&&Talabat.owners.get(i).getPassword().equals(password))
                {
                   valid = true;
                   System.out.println("Found");
                   foundOwner = i;
                   break;
                }
        }

        return valid;
    }

    //the overrided method from the person class 
    public void signUp(String uname,String pass,String restaurant_name){
        this.signUp(uname, pass);
        restaurant.setName(restaurant_name);
    }
}

