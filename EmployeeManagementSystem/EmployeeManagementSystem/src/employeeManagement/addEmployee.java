package employeeManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class addEmployee extends JFrame implements ActionListener  {
    JButton submit , back;
    JTextField tfName, tfemail,lblempId, tfaddress,tfFName,tfphone,tfsalary,tfdob,tfdesignation,tfaadhar;
    Random ran = new Random();
    int number = ran.nextInt(999999);
     JComboBox ComboHighEdu;

    addEmployee() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Add Employee Detail");
        heading.setBounds(340, 30, 500, 50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        add(heading);

        JLabel labelName = new JLabel("UserName");
        labelName.setBounds(50, 150, 150, 30);
        labelName.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        add(labelName);
        tfName = new JTextField();
        tfName.setBounds(230,150,210,30);
        tfName.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        add(tfName);

        JLabel labelFName = new JLabel("FatherName");
        labelFName.setBounds(50, 200, 150, 30);
        labelFName.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        add(labelFName);
        tfFName = new JTextField();
        tfFName.setBounds(230,200,210,30);
        tfFName.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        add(tfFName);

        JLabel labelsalary = new JLabel("Salary");
        labelsalary.setBounds(500,150,150,30);
        labelsalary.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        add(labelsalary);
        tfsalary = new JTextField();
        tfsalary.setBounds(680,150,210,30);
        tfsalary.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        add(tfsalary);

        JLabel labeladdress = new JLabel("Address");
        labeladdress.setBounds(500,200,150,30);
        labeladdress.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        add(labeladdress);
        tfaddress = new JTextField();
        tfaddress.setBounds(680,200,210,30);
        tfaddress.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        add(tfaddress);

       JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(50, 250, 150, 30);
        labelphone.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        add(labelphone);
        tfphone = new JTextField();
        tfphone.setBounds(230,250,210,30);
        tfphone.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        add(tfphone);

      JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(500,250,150,30);
        labelemail.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        add(labelemail);
        tfemail = new JTextField();
        tfemail.setBounds(680,250,210,30);
        tfemail.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        add(tfemail);

       JLabel labeldob = new JLabel("Date Of Birth");
        labeldob.setBounds(50, 300, 150, 30);
        labeldob.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        add(labeldob);
        tfdob = new JTextField();
        tfdob.setBounds(230,300,210,30);
        tfdob.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        add(tfdob);

        JLabel labelHighEdu = new JLabel("Highest Education");
        labelHighEdu.setBounds(500,300,180,30);
        labelHighEdu.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        add(labelHighEdu);
        String courses[] = {"Btech","Mtech","BBA","MCA","BCOM","MCOM","MBA","BA","Bsc","MA","Msc"};
        ComboHighEdu = new JComboBox(courses);
        ComboHighEdu.setBackground(Color.WHITE);
        ComboHighEdu.setBounds(680,300,210,18);
        add(ComboHighEdu);

        JLabel labeldesignation = new JLabel("Designation");
        labeldesignation.setBounds(50, 350, 150, 30);
        labeldesignation.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        add(labeldesignation);
        tfdesignation =new JTextField();
        tfdesignation.setBounds(230,350,210,30);
        tfdesignation.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        add(tfdesignation);

       JLabel labelAadhar  = new JLabel("Aadhar Number");
        labelAadhar.setBounds(500,350,150,30);
        labelAadhar.setFont(new Font("SAN_SERIF",Font.PLAIN,20));
        add(labelAadhar);
        tfaadhar = new JTextField();
        tfaadhar.setBounds(680,350,210,30);
        tfaadhar.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        add(tfaadhar);

        JLabel labelEmpid = new JLabel("Empolyee ID");
        labelEmpid.setBounds(50, 400, 150, 30);
        labelEmpid.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        add(labelEmpid);
        lblempId = new JTextField(""+number);
        lblempId.setBounds(230,400,210,30);
        lblempId.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        lblempId.setEditable(false);
        add(lblempId);

        submit= new JButton("Add Employee");
        submit.setBounds(250,500,210,50);
        submit.setBackground(Color.black);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        back= new JButton("Back");
        back.setBounds(480,500,210,50);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        setSize(950, 700);
        setLocation(300, 50);
        setVisible(true);


    }

    public static void main(String[] args) {
        new addEmployee();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==submit){
    String name=tfName.getText();
    String Fname=tfFName.getText();
    String dob=tfdob.getText();
    String salary=tfsalary.getText();
    String address=tfaddress.getText();
    String phone=tfphone.getText();
    String email=tfemail.getText();
    String education= (String) ComboHighEdu.getSelectedItem();
    String designation = tfdesignation.getText();
    String Aadhar=tfaadhar.getText();
    String EmpId=lblempId.getText();

    try{
        conn c= new conn();
        String query="insert into addemployee values('"+name+"','"+Fname+"','"+dob+"','"+salary+"','"+address+"','"+phone+"','"+email+"','"+education+"','"+designation+"','"+Aadhar+"','"+EmpId+"')";
        c.s.executeUpdate(query);
        JOptionPane.showMessageDialog(null,"Details add Successfully");
        new home();
    }catch (Exception e){
        e.printStackTrace();
    }


        }else {
            setVisible(false);
            new home();
        }
    }


}
