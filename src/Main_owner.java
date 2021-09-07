import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main_owner extends JFrame implements ActionListener{
    
    
    JPanel panel1 = new JPanel ();
    
    //color for text field background
    Color tborder = new Color(255,238,229);
        
    
    // intialize label , image icone to add a background image 
    JLabel bg = new JLabel();
    ImageIcon bgimg = new ImageIcon("Designs/Main for owner/Assets/1x/BG.png");
    
   // intialize button(person) and person image to add profile user icon 
    JButton person = new JButton();
    ImageIcon personimg = new ImageIcon("Designs/Main for owner/Assets/1x/Profile user icon.png");
    
    //delivery man image
    JLabel delivery = new JLabel();
    ImageIcon deliveryimg = new ImageIcon("Designs/Main for owner/Assets/1x/Delivery.png");
    
      JLabel ltalabat = new JLabel("Talabat");
      JLabel restaurant_name = new JLabel(Talabat.owners.get(Owner.foundOwner).restaurant.getName());
      
      // order icon image
      JLabel order = new JLabel();
      ImageIcon orderimg = new ImageIcon("Designs/Main for owner/Assets/1x/Order icon.png");
      
      //show order button image
      JButton showorder = new JButton();
      ImageIcon showorderimg = new ImageIcon("Designs/Main for owner/Assets/1x/ShowOrder button.png");
      
      // add meal labels , TEXT FIELDS  
      JLabel addmeal = new JLabel("Add meal");
      JLabel addname = new JLabel("Name :");
      JLabel adddescribtion = new JLabel("Description :");
      JLabel addprice = new JLabel("Price :");
      JLabel addid = new JLabel("ID :");
       
      JTextField taddname = new JTextField();
      JTextField tadddescribtion = new JTextField();
      JTextField taddprice = new JTextField();
      JTextField taddid = new JTextField();
      
      
       // edit meal labels , TEXT FIELDS 
      //JLabel editoldname = new JLabel("Meal to edit : ");
      JLabel editmeal = new JLabel("Edit meal ");
      JLabel editname = new JLabel("Name :");
      JLabel editoldname = new JLabel("Old Name :");
      JLabel editdescribtion = new JLabel("Description :");
      JLabel editprice = new JLabel("Price :");
      JLabel editid = new JLabel("ID :");
       
     
      JTextField teditname = new JTextField();
      JTextField teditoldname = new JTextField();
      JTextField teditescribtion = new JTextField();
      JTextField teditprice = new JTextField();
      JTextField teditid = new JTextField();
      
        // edit meal labels , TEXT FIELDS 
      JLabel removemeal = new JLabel("Remove meal");
      JLabel removename = new JLabel("Name :");
      JLabel errorremove = new JLabel("");
    
      JTextField tremovename = new JTextField();
     
      //add 3 label for three borders (add/remove/edit meal)
      JLabel addborder = new JLabel();
      JLabel editborder = new JLabel();
      JLabel removeborder = new JLabel();
      
      //ADD label for error meal
      JLabel erroradd = new JLabel("");
      JLabel erroredit = new JLabel("");
  
      
      
      // border image
      ImageIcon borderimg = new ImageIcon("Designs/Main for owner/Assets/1x/Border.png");
      
      
          JSeparator sep1 = new JSeparator();
          JSeparator sep2 = new JSeparator();
          JSeparator sep3 = new JSeparator();
          JSeparator sep4 = new JSeparator();
          JSeparator sep5 = new JSeparator();
          JSeparator sep6 = new JSeparator();
          JSeparator sep7 = new JSeparator();
          JSeparator sep8 = new JSeparator();
          JSeparator sep9 = new JSeparator();
          JSeparator sep10 = new JSeparator();
          
          JButton addimage = new JButton();
          JButton editimage = new JButton();
          JButton removeimage = new JButton();
          
          ImageIcon addimg = new ImageIcon("Designs/Main for owner/Assets/1x/Add.png");
          ImageIcon editimg = new ImageIcon("Designs/Main for owner/Assets/1x/Edit.png");
          ImageIcon removeimg = new ImageIcon("Designs/Main for owner/Assets/1x/Remove.png");
          
       public Main_owner()
       {
           // frame properties 
        this.setTitle("Talabat");
        this.setLayout(null);
        this.setSize(1080, 720);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(380, 150);
        panel1.setLayout(null);
        panel1.setBounds(0, 0, 1080, 720);
        //add image to a label
        bg.setIcon(bgimg);
        bg.setLayout(null);
        bg.setBounds(0, 0, 1080, 720);
        
        // talabat label properties
        ltalabat.setBounds(10, 10, 200, 50);
        ltalabat.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 35));
        ltalabat.setForeground(Color.white);

            restaurant_name.setBounds(840, 10, 200, 50);
            restaurant_name.setFont(new Font("verdana",1,20));
            restaurant_name.setForeground(Color.BLACK);
            

           //person image properties
           person.setIcon(personimg);
           person.setContentAreaFilled(false);
           person.setBorder(null);
           person.setBounds(985, 7, 65, 67);
           person.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
                ProfileOwner ownerP = new ProfileOwner(Talabat.owners.get(Owner.foundOwner));
            }
        });
           
           //delivery man image properties
           delivery.setIcon(deliveryimg);
           delivery.setBounds(25, 365,161 , 318);
           
           //order icon image properties
           order.setIcon(orderimg);
           order.setBounds(30,265, 77, 77);
           
           //show order button properties
           showorder.setIcon(showorderimg);
           showorder.setContentAreaFilled(false);
           showorder.setBorder(null);
           showorder.setBounds(115, 285, 227, 50);
           showorder.addActionListener(this);
           // add meal border properties
           addborder.setIcon(borderimg);
           addborder.setBounds(375,75, 654, 239);
           
           //add meal error label
           erroradd.setBounds(755, 120, 200, 70);
           erroradd.setForeground(Color.RED);
        
                 // edit meal border properties
           editborder.setIcon(borderimg);
           editborder.setBounds(375,270, 654, 239);
           
           
                 // remove meal border properties
           removeborder.setIcon(borderimg);
           removeborder.setBounds(375,465, 654, 239);
           
           //add meal elements properties
         addmeal.setBounds(655,100 , 150, 30);
        addmeal.setFont(new Font("verdana",1,25));
        addmeal.setForeground(Color.black);
        
        addname.setBounds(415,135 , 175, 30);
        addname.setFont(new Font("verdana",1,20));
        addname.setForeground(Color.black);
        
        taddname.setBounds(500,138 , 250, 20);
        taddname.setBorder(null);
        taddname.setBackground(tborder);
        
        
         adddescribtion.setBounds(415,170 , 175, 30);
        adddescribtion.setFont(new Font("verdana",1,20));
        adddescribtion.setForeground(Color.black);
        
        tadddescribtion.setBounds(565,173 , 250, 20);
        tadddescribtion.setBorder(null);
        tadddescribtion.setBackground(tborder);
        
         addprice.setBounds(415,205 , 175, 30);
        addprice.setFont(new Font("verdana",1,20));
        addprice.setForeground(Color.black);
        
        taddprice.setBounds(500,208 , 250, 20);
        taddprice.setBorder(null);
        taddprice.setBackground(tborder);
           
        addid.setBounds(415,240 , 175, 30);
        addid.setFont(new Font("verdana",1,20));
        addid.setForeground(Color.black);
        
        taddid.setBounds(470,245 , 250, 20);
        taddid.setBorder(null);
        taddid.setBackground(tborder);
        
        
        
      sep1.setBounds(500, 158, 250, 20);
     sep1.setBorder(null);
     sep1.setBackground(Color.BLACK);
     
     sep2.setBounds(565, 193, 250, 20);
     sep2.setBorder(null);
     sep2.setBackground(Color.BLACK);
     
     
      sep3.setBounds(500, 228, 250, 20);
     sep3.setBorder(null);
     sep3.setBackground(Color.BLACK);
     
     sep4.setBounds(470, 265, 250, 20);
     sep4.setBorder(null);
     sep4.setBackground(Color.BLACK);
     
        
     
         //edit meal elements properties
         editmeal.setBounds(770,295 , 150, 30);
        editmeal.setFont(new Font("verdana",1,25));
        editmeal.setForeground(Color.black);
        
        editoldname.setBounds(410,300 , 175, 30);
        editoldname.setFont(new Font("verdana",1,20));
        editoldname.setForeground(Color.black);
        
        
        teditoldname.setBounds(535,305 , 250, 20);
        teditoldname.setBorder(null);
        teditoldname.setBackground(tborder);
        
        editname.setBounds(415,365 , 175, 30);
        editname.setFont(new Font("verdana",1,20));
        editname.setForeground(Color.black);
        
        
        teditname.setBounds(500,368 , 250, 20);
        teditname.setBorder(null);
        teditname.setBackground(tborder);
        
        
         editdescribtion.setBounds(415,400 , 175, 30);
        editdescribtion.setFont(new Font("verdana",1,20));
        editdescribtion.setForeground(Color.black);
        
        teditescribtion.setBounds(570,403 , 250, 20);
        teditescribtion.setBorder(null);
        teditescribtion.setBackground(tborder);
        
         editprice.setBounds(415,435 , 175, 30);
        editprice.setFont(new Font("verdana",1,20));
        editprice.setForeground(Color.black);
        
        teditprice.setBounds(500,438 , 250, 20);
        teditprice.setBorder(null);
        teditprice.setBackground(tborder);
           
        editid.setBounds(415,330 , 175, 30);
        editid.setFont(new Font("verdana",1,20));
        editid.setForeground(Color.black);
        
        teditid.setBounds(460,333 , 250, 20);
        teditid.setBorder(null);
        teditid.setBackground(tborder);
        
               sep5.setBounds(460, 353, 250, 20);
     sep5.setBorder(null);
     sep5.setBackground(Color.BLACK);
     
     sep6.setBounds(510, 388, 250, 20);
     sep6.setBorder(null);
     sep6.setBackground(Color.BLACK);
     
     
      sep7.setBounds(568, 423, 250, 20);
     sep7.setBorder(null);
     sep7.setBackground(Color.BLACK);
     
     sep8.setBounds(500, 458, 250, 20);
     sep8.setBorder(null);
     sep8.setBackground(Color.BLACK);
           
     sep10.setBounds(535, 327, 220, 20);
     sep10.setBorder(null);
     sep10.setBackground(Color.BLACK);
        
     
            //edit meal elements properties
        removemeal.setBounds(640,485 , 200, 30);
        removemeal.setFont(new Font("verdana",1,25));
        removemeal.setForeground(Color.black);
        
        removename.setBounds(415,570 , 175, 30);
        removename.setFont(new Font("verdana",1,20));
        removename.setForeground(Color.black);
        
        tremovename.setBounds(500,573 , 250, 20);
         tremovename.setBorder(null);
         tremovename.setBackground(tborder);
         
         errorremove.setBounds(530, 620, 300, 50);
         errorremove.setFont(new Font("verdana",1,20));
         errorremove.setForeground(Color.RED);
        
        
  
     sep9.setBounds(500, 593, 250, 20);
     sep9.setBorder(null);
     sep9.setBackground(Color.BLACK);
     
     addimage.setIcon(addimg);
     editimage.setIcon(editimg);
     addimage.addActionListener(this);
     removeimage.setIcon(removeimg);
     addimage.setBounds(910,195 , 72, 72);
     editimage.setBounds(910, 390, 72, 72);
     removeimage.setBounds(910, 585, 73, 74);
      addimage.setBorder(null);
      editimage.setBorder(null);
      removeimage.setBorder(null);
      addimage.setContentAreaFilled(false);
      editimage.setContentAreaFilled(false);
      removeimage.setContentAreaFilled(false);
      removeimage.addActionListener(this);
         
        this.add(panel1);
        panel1.add(ltalabat);
        panel1.add(restaurant_name);
        panel1.add(person);
        panel1.add(delivery);
        panel1.add(order);
        panel1.add(showorder);
        panel1.add(sep1);
        panel1.add(sep2);
        panel1.add(sep3);
        panel1.add(sep4);
        panel1.add(addmeal);
        panel1.add(addname);
        panel1.add(taddname);
        panel1.add(adddescribtion);
        panel1.add(tadddescribtion);
        panel1.add(addprice);
        panel1.add(taddprice);
         panel1.add(addid);
        panel1.add(taddid);
        panel1.add(erroradd);
        
                panel1.add(editmeal);
        panel1.add(editoldname);
        panel1.add(teditoldname);        
        panel1.add(editname);
        panel1.add(teditname);
        panel1.add(editdescribtion);
        panel1.add(teditescribtion);
        panel1.add(editprice);
        panel1.add(teditprice);
         panel1.add(editid);
        panel1.add(teditid);
         panel1.add(sep5);
        panel1.add(sep6);
        panel1.add(sep7);
        panel1.add(sep8);
        
        
             panel1.add(removemeal);
        panel1.add(removename);
        panel1.add(tremovename);
        panel1.add(errorremove);
        panel1.add(sep9);
        
        panel1.add(addimage);
        panel1.add(editimage);
        panel1.add(removeimage);
        panel1.add(sep10);
        
        
        panel1.add(addborder);
        panel1.add(editborder);
        panel1.add(removeborder);
        
        panel1.add(bg);
       
        
       }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == addimage)
        {
            erroradd.setText("");
            System.out.println("Done");
            erroradd.setText("Done");
            float price = Float.parseFloat(taddprice.getText());
            System.out.println("float");
            int id = Integer.parseInt(taddid.getText());
            System.out.println("int");
            
            boolean checkmeal = true;
            boolean checkcode = false;
            checkmeal =  Talabat.owners.get(Owner.foundOwner).restaurant.CheckMeal(taddname.getText());
            checkcode = Talabat.owners.get(Owner.foundOwner).restaurant.checkCode(id);
            
            if(checkmeal == false && checkcode == true)
            {
                System.out.println("check if");
               Talabat.owners.get(Owner.foundOwner).restaurant.addmeal(taddname.getText(), tadddescribtion.getText(), price, id);
               erroradd.setText("Done");
            }
            
            else
            {
                erroradd.setText("Please enter unique id and name");
                
            }
          
            
        }
        if(ae.getSource() == editimage)
        {
            
        }
        if(ae.getSource() == removeimage)
            
        {
            boolean found = false;
           for(int i=0; i<Talabat.owners.get(Owner.foundOwner).restaurant.meals.size();i++)
           {
              if(tremovename.getText().equals(Talabat.owners.get(Owner.foundOwner).restaurant.meals.get(i).getName()))
              {
                  found = true;
              }
           }
           if(found == true)
           {
               errorremove.setText("Done");
               Talabat.owners.get(Owner.foundOwner).restaurant.removeMeal(tremovename.getText());
           }
           else
           {
               errorremove.setText("Please enter valid meal");
           }
            
        }
        if(ae.getSource()==showorder)
        {
            dispose();
            Rmeal_owner rmo = new Rmeal_owner();
        }
        
    }
}