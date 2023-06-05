package employeeManagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class home extends JFrame implements ActionListener {
    JButton view,add, update, remove;
    home(){
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100,600,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1050,600);
        add(image);

        JLabel heading = new JLabel("EMPLOYEE MANAGEMNET SYSTEM");
        heading.setBounds(580,10,1000,50);
        heading.setFont(new Font("Raleway",Font.BOLD,25));
        heading.setForeground(Color.red);
        image.add(heading);

        add = new JButton("Add Employee");
        add.setBounds(600,100,150,50);
        add.setBackground(Color.black);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        image.add(add);

        view = new JButton("View Employee");
        view.setBounds(600,180,150,50);
        view.setBackground(Color.black);
        view.setForeground(Color.WHITE);
        view.addActionListener(this);
        image.add(view);

        update = new JButton("Update Employee");
        update.setBounds(800,100,150,50);
        update.setBackground(Color.black);
        update.setForeground(Color.WHITE);
        update.addActionListener(this);
        image.add(update);

        remove = new JButton("Remove Employee");
        remove.setBounds(800,180,150,50);
        remove.setBackground(Color.black);
        remove.setForeground(Color.WHITE);
        remove.addActionListener(this);
        image.add(remove);

        setSize(1050,600);
        setLocation(100,50);
        setVisible(true);

    }

    public static void main(String[] args) {
        new home();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== view){
            setVisible(false);
            new viewEmployee();
        }
        else if (e.getSource() == add) {
            setVisible(false);

       new addEmployee();
        }
        else if (e.getSource()==update) {
            setVisible(false);
            new viewEmployee();
        }
        else if (e.getSource()==remove) {
            setVisible(false);
           new removeEmployee();
        }

    }
}
