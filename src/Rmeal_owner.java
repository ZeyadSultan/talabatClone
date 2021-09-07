


import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Rmeal_owner extends JFrame implements ActionListener{
    
    
    JPanel panel1 = new JPanel ();
    
    //color for text field background
       Color tborder = new Color(255,238,229) ;
        
       //order  part 
        JPanel meal_part = new JPanel();
        JScrollPane scrollFrame = new  JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
       
        
        JLabel bg= new JLabel ();
        JLabel mealpart_bg = new JLabel();
        JLabel mealpart_outerframe = new JLabel();
         
         Color c = new Color(20,30,115);
        //meal image
         ImageIcon meal_IMAGE = new ImageIcon("Designs/Main for user/Assets/1x/Card.PNG");
         
            //intialize imageicon to add path of image
    ImageIcon bgimage = new ImageIcon("Designs/Main for user/Assets/2x/Background@2x.PNG");
    ImageIcon d_man = new ImageIcon("Designs/Main for user/Assets/1x/Delivery .PNG");
    ImageIcon TOPTEXT_IMAGE = new ImageIcon("Designs/Main for user/Assets/1x/Oredr food.PNG");
    ImageIcon mealf_image = new ImageIcon("Designs/Main for user/Assets/2x/Frame @2x.PNG");
    
    ImageIcon talab_image = new ImageIcon("Designs/Main for user/Assets/1x/TalabButt.PNG") ;
    ImageIcon custIcon = new ImageIcon("Designs/Main for user/Assets/1x/Customer icon.PNG");
    ImageIcon checkoutBorder = new ImageIcon("Designs/Main for user/Assets/1x/checkoutBG.PNG");
    ImageIcon done_image = new ImageIcon("Designs/Restaurant meal for owner/1x/Asset 1.PNG");
    ImageIcon waiting_bg = new ImageIcon("Designs/Restaurant meal for owner/1x/Asset 2.PNG");
    // intialize label , image icone to add a background image 
   
    ImageIcon bgimg = new ImageIcon("Designs/Main for owner/Assets/1x/BG.png");
    
   // intialize button(person) and person image to add profile user icon 
    JButton person = new JButton();
    ImageIcon personimg = new ImageIcon("Designs/Main for owner/Assets/1x/Profile user icon.png");
    
    //delivery man image
    JLabel delivery = new JLabel();
    ImageIcon deliveryimg = new ImageIcon("Designs/Main for owner/Assets/1x/Delivery.png");
    
      JButton ltalabat = new JButton("Talabat");
      JLabel restaurant_name = new JLabel("Restaurant Name");
      
      JLabel orders = new JLabel("Orders");
      JLabel orders_waiting = new JLabel("Orders waiting");
      Integer num = new Integer(Talabat.owners.get(Owner.foundOwner).restaurant.orders.size());
              
       String numS = num.toString();
      JLabel no_orders = new JLabel(numS);



       JLabel[] meal = new JLabel[size];
    JLabel[] name = new JLabel[size];
    
    JButton[] button = new JButton[size];

    static  int size = 15 ;
     int imgxbound = 15 ;
     int imgybound = 10;
     
     
     
      JLabel waiting_ordersimg = new JLabel();
      
     
      
      
       
          
         
       public Rmeal_owner()
       {
            bg = new JLabel();
           // frame properties 
        this.setTitle("Talabat");
       this.setLayout(null);
       this.setSize(1080, 720);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel1.setLayout(null);
        panel1.setBounds(0, 0, 1080, 720);
        this.setLocation(380, 150);
        //add image to a label
        bg.setIcon(bgimg);
        
        bg.setBounds(0, 0, 1080, 720);
        
                // talabat label properties
        ltalabat.setBounds(10, 10, 200, 50);
        ltalabat.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 35));
        ltalabat.setForeground(Color.white);
        ltalabat.addActionListener(this);
        ltalabat.setBorderPainted(false);
        ltalabat.setFocusPainted(false);
        ltalabat.setContentAreaFilled(false);
        
         restaurant_name.setBounds(770, 10, 200, 50);
         restaurant_name.setFont(new Font("verdana",1,20));
         restaurant_name.setForeground(Color.BLACK);
           
           //person image properties
           person.setIcon(personimg);
           person.setContentAreaFilled(false);
           person.setBorder(null);
           person.setBounds(985, 7, 65, 67);
           person.addActionListener(this);
           
           //delivery man image properties
           delivery.setIcon(deliveryimg);
           delivery.setBounds(25, 365,161 , 318);
           
         
           
        
           
           
               // order part properties
               meal_part.setLayout(new BorderLayout());
               meal_part.setBorder(new LineBorder(Color.white));

          
        mealpart_bg.setIcon(bgimage);
        //properties of meal part  background
        meal_part.setBounds(2, 2, 646, 521);
   
     
        
        
        
        
          mealpart_outerframe.setIcon(mealf_image);
        mealpart_outerframe.setBounds(335, 100, 1430, 1145);
       scrollFrame.setBounds(335, 100, 650,525 );
       scrollFrame.setViewportView(meal_part);
   
       // propeties of waiting image
       waiting_ordersimg.setIcon(waiting_bg);
       waiting_ordersimg.setBounds(20, 100,253 ,209 );
       
       orders.setForeground(c);
       orders.setFont(new Font("verdana",1,35));
       orders.setBounds(600, 55,200 , 50);
       
       
        orders_waiting.setForeground(c);
       orders_waiting.setFont(new Font("verdana",1,24));
       orders_waiting.setBounds(38, 115,200 , 50);
         
       
      
       no_orders.setFont(new Font("verdana",1,100));
       no_orders.setBounds(105, 175,200 , 100);
       
                
       
       
       for(int i = 0 ; i < Talabat.owners.get(Owner.foundOwner).restaurant.orders.size(); i++)
      {
          
         /* meal[i] = new JLabel();
          meal[i].setIcon(meal_IMAGE);
          meal[i].setBounds(imgxbound, imgybound , 171, 252);
          //imgxbound += 220;
          imgybound += 255;
          meal_part.add(meal[i]);*/
          
         
          if(imgxbound <= 500)
          {
           System.out.println("Entered first");
           
           //Label name
           name[i] = new JLabel("Food Name");
           name[i].setBounds(imgxbound+35, imgybound+30, 171, 252);
           name[i].setFont(new Font("Arial Rounded MT" , Font.ITALIC, 20));
           meal_part.add(name[i]);
           //End label for name
           
           
            //Label for button
           button[i] = new JButton();
           button[i].setIcon(done_image);
           button[i].setBounds(imgxbound+5, imgybound+75, 171, 252);
            button[i].setBorder(null);
            button[i].setBorderPainted(false);
           button[i].setFocusPainted(false);
           button[i].setContentAreaFilled(false);
           meal_part.add(button[i]);
           //End label for button
           
           
           //Label for image
           meal[i]= new JLabel();
           meal[i].setIcon(meal_IMAGE);
           meal[i].setBounds(imgxbound, imgybound, 171, 252);
           meal_part.add(meal[i]);
           //End label for image
           
          
           
              
           imgxbound += 220;
           
          }
         
else
          {
              imgybound += 255 ;
              imgxbound =15;
              //Label name
           name[i] = new JLabel("Food Name");
           name[i].setBounds(imgxbound+35, imgybound+30, 171, 252);
           name[i].setFont(new Font("Arial Rounded MT" , Font.ITALIC, 20));
           meal_part.add(name[i]);
           //End label for name
           
           
           
            //Label for button
           button[i] = new JButton();
           button[i].setIcon(done_image);
           button[i].setBounds(imgxbound+5, imgybound+75, 171, 252);
            button[i].setBorder(null);
            button[i].setBorderPainted(false);
           button[i].setFocusPainted(false);
           button[i].setContentAreaFilled(false);
           meal_part.add(button[i]);
           //End label for button
           
           
           //Label for image
           meal[i]= new JLabel();
           meal[i].setIcon(meal_IMAGE);
           meal[i].setBounds(imgxbound, imgybound, 171, 252);
           meal_part.add(meal[i]);
           //End label for image
           
           imgxbound += 220 ;
          
              
      
          }

      }
       
         
        this.add(scrollFrame);
        meal_part.add(mealpart_bg);
        this.add(panel1);
        panel1.add(ltalabat);
        panel1.add(restaurant_name);
        panel1.add(person);
        panel1.add(delivery);
        panel1.add(orders_waiting);
        panel1.add(no_orders);
        panel1.add(waiting_ordersimg);
        panel1.add(orders);
       
     
          panel1.add(bg);
     
        
        
  
       
        
      
      
        
       
        
       }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == person)
        {
            dispose();
            ProfileOwner po = new ProfileOwner(Talabat.owners.get(Owner.foundOwner));
        }
        if(ae.getSource()==ltalabat)
        {
            dispose();
            Main_owner mo = new Main_owner();
        }
        
        
    }
}


