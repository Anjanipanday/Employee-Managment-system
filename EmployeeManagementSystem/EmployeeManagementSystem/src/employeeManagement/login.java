package employeeManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.*;

public class login  extends JFrame implements ActionListener {
    JTextField tfusername , tfpassword;
    login(){
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel lblusername = new JLabel("UserName");
        lblusername.setBounds(40,20,100,30);
        add(lblusername);

        tfusername = new JTextField();
        tfusername.setBounds(150,20,150,30);
        add(tfusername);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40,60,100,30);
        add(lblpassword);

        tfpassword = new JTextField();
        tfpassword.setBounds(150,70,150,30);
        add(tfpassword);

        JButton login = new JButton("LOGIN");
        login.setBounds(150,140,150,30);
        login.setBackground(Color.black);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,0,200,200);
        add(image);


        setSize(600,300);
        setLocation(450,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new login();
    }

     @Override
   public void actionPerformed(ActionEvent e) {
 try{
     String username = tfusername .getText();
     String password = tfpassword.getText();

     conn c = new conn();
     String query  = "select * from login where username = '"+ username+ " 'and password = '" +password+"' ";

         ResultSet rs=c.s.executeQuery(query);

     if(rs.next()){
         setVisible(false);
         new home();
     }else {
         JOptionPane.showMessageDialog(null,"Invalid Username or Password");
         setVisible(false);
     }

 }catch (Exception ex){
     ex.printStackTrace();
 }
    }
}
