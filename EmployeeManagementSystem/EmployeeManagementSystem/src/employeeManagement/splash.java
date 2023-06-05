package employeeManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class splash extends JFrame implements ActionListener {
    splash(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("EMPLOYEE MANAGEMNET SYSTEM");
        heading.setBounds(70,30,1000,50);
        heading.setFont(new Font("serif",Font.BOLD,50));
        heading.setForeground(Color.red);
        add(heading);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100,500,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(30,100,970,440);
        add(image);

        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(330,350,300,70);
        clickhere.setBackground(Color.black);
        clickhere.setForeground(Color.WHITE);
        clickhere.addActionListener(this);
        image.add(clickhere);

        setResizable(false);
        setSize(1050,600);
        setLocation(100,50);
        setVisible(true);

        while(true){
            heading.setVisible(false);
            try{
                Thread.sleep(500);
            }
            catch (Exception e){}

            heading.setVisible(true);
            try{
                Thread.sleep(500);
            }
            catch (Exception e){}
        }
    }
    public static void main(String[] args) {
        new splash();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);

        new login();
    }
}