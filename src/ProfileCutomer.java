import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ProfileCutomer extends JFrame implements ActionListener{

    // Declaration
    JPanel panel ;
    JLabel  customerName,  latestOrder, Username, Address, Mobilenumber, BG, ProfileImg , BGInfo , BGOrder;
    JTextField custName, address, mobileNumber;
    JButton submit,logout,talabat;
    JSeparator sep1 , sep2 , sep3;
    ImageIcon profile = new ImageIcon("Designs/Porfile customer page asset/Asset/Profile icon.png");
    ImageIcon BackGorund = new ImageIcon("Designs/Porfile customer page asset/Asset/Background.png");
    ImageIcon subimtBUTT = new ImageIcon("Designs/Porfile customer page asset/Asset/Submit Butt.png");
    ImageIcon BGForOrder = new ImageIcon("Designs/Porfile customer page asset/Asset/BG for order.png");
    ImageIcon BGForInfo = new ImageIcon("Designs/Porfile customer page asset/Asset/BG 2 for data.png");
    


    public ProfileCutomer(Customer customer)
    {
        //Setup for frame
        this.setSize(1080,750);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Customer Profile");
        this.setResizable(false);
        
        this.setLocation(380, 150);
        

        //Initialize
        //Initialize panel
        panel = new JPanel();
        add(panel);
        setContentPane(panel);


        //Initialize labels
        talabat = new JButton("Talabat");
        customerName = new JLabel(customer.getUsername());
        latestOrder = new JLabel("Latest Order");
        Username = new JLabel("Username: ");
        Address = new JLabel("Address: ");
        Mobilenumber = new JLabel("Mobile number: ");
        ProfileImg = new JLabel();
        BGInfo = new JLabel();
        BGOrder = new JLabel();
        
        //Initialize label for background
        BG = new JLabel();
        //Initialized textFields
        custName = new JTextField(customer.getUsername());
        address = new JTextField(customer.getAddress());
        mobileNumber = new JTextField(customer.getMob_number());
        // Initialized buttons
        submit = new JButton ("");
        logout = new JButton("Logout");
        logout.setBorderPainted(false);
        logout.setFocusPainted(false);
        logout.setContentAreaFilled(false);
        logout.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 25));
        logout.setForeground(Color.WHITE);
        logout.addActionListener(this);

        // Initialized separator
        sep1 = new JSeparator();
        sep2 = new JSeparator();
        sep3 = new JSeparator();

        // End initialize

        //Set Layout
        this.setLayout(null);

        // Set layout for panel
        panel.setLayout(null);

        //add logout 
        panel.add(logout);
        logout.setBounds(950, 10, 120, 50);
        
        //Add Talabat logo
        panel.add(talabat);

        //Set the position in the screen
        talabat.setBounds(0,15,170,30);
        talabat.addActionListener(this);

        // Set Color for talabat
        talabat.setForeground(Color.decode("#FFFFFF"));

        // Set Font for talabat
        talabat.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 35));
        talabat.setBorderPainted(false);
        talabat.setFocusPainted(false);
        talabat.setContentAreaFilled(false);

        //Add profileIMG
        panel.add(ProfileImg);
        ProfileImg.setBounds(465,0,200,200);
        ProfileImg.setIcon(profile);

        // Add CustomerName label
        panel.add(customerName);
        customerName.setBounds(462,95,400,200);
        customerName.setForeground(Color.decode("#FFFFFF"));
        customerName.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 25));


        //Add label username
        panel.add(Username);
        Username.setBounds(270,200,150,150);
        Username.setForeground(Color.BLACK);
        Username.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 25));

        // Add label Address
        panel.add(Address);
        Address.setBounds(270,270,150,150);
        Address.setForeground(Color.BLACK);
        Address.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 25));

        //ADD label for mobile number
        panel.add(Mobilenumber);
        Mobilenumber.setBounds(270,340,250,150);
        Mobilenumber.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 25));
        Mobilenumber.setForeground(Color.BLACK);

        //ADD TextField for customer name
        panel.add(custName);
        custName.setBounds(420,260,200,30);
        custName.setBorder(null);
        custName.setOpaque(false);
        custName.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 15));

        // ADD Separator
        panel.add(sep1);
        sep1.setBounds(410,290,400,10);
        sep1.setBackground(Color.black);
        sep1.setBorder(null);

        // ADD text field for address
        panel.add(address);
        address.setBounds(390,330,250,30);
        address.setBorder(null);
        address.setOpaque(false);
        address.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 15));

        // ADD Separator2
        panel.add(sep2);
        sep2.setBounds(390,360,400,10);
        sep2.setBackground(Color.black);
        sep2.setBorder(null);

        // ADD text field for mobile number
        panel.add(mobileNumber);
        mobileNumber.setBounds(470,402,250,30);
        mobileNumber.setBorder(null);
        mobileNumber.setOpaque(false);
        mobileNumber.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 15));

        // ADD Separator3
        panel.add(sep3);
        sep3.setBounds(470,430,350,10);
        sep3.setBackground(Color.black);
        sep3.setBorder(null);

        //ADD submit button
        panel.add(submit);
        submit.setBounds(455,460,160,39);
        submit.setIcon(subimtBUTT);
        submit.setBorderPainted(false);
        //submit.setFocusPainted(false);
        submit.setContentAreaFilled(false);
        
        //Add events to submit button 
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Talabat.customers.get(Customer.foundCustomer).setUsername(custName.getText());
               customerName.setText(Talabat.customers.get(Customer.foundCustomer).getUsername());
               Talabat.customers.get(Customer.foundCustomer).setAddress(address.getText());
               Talabat.customers.get(Customer.foundCustomer).setMob_number(mobileNumber.getText());
                      
               
            }
        });



        // Add label latest order
        panel.add(latestOrder);
        latestOrder.setBounds(446,480,200,120);
        latestOrder.setFont(new Font("Arial Rounded MT Bold" , Font.PLAIN, 30));
        latestOrder.setForeground(Color.decode("#141E73"));


        //ADD label for BG For Info
        panel.add(BGInfo);
        BGInfo.setIcon(BGForInfo);
        BGInfo.setBounds(220,230,630,275);


        //ADD label for BG for Order
        panel.add(BGOrder);
        BGOrder.setIcon(BGForOrder);
        BGOrder.setBounds(220,470,630,275);



        // Add Background
        panel.add(BG);
        BG.setBounds(-2,0,1080,720);
        BG.setIcon(BackGorund);

        // ADD Events
            


this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
           if(e.getSource()==logout)
           {
               dispose();
               customerOrOwner cOO = new customerOrOwner();
           }
           if(e.getSource()==talabat)
           {
               dispose();
               RestaurantMain rest = new RestaurantMain();
           }

    }

}
