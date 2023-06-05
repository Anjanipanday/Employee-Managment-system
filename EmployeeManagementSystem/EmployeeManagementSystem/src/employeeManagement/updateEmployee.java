 package employeeManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Random;


public class updateEmployee extends JFrame  implements ActionListener {
    JButton submit, back;
    JTextField tfeducation, tfemail, tfaddress, tfphone, tfsalary, tfdesignation;
    String empId;

    updateEmployee(String empId) {
        this.empId = empId;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Update Employee Detail");
        heading.setBounds(300, 30, 500, 50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        add(heading);

        JLabel labelName = new JLabel("UserName");
        labelName.setBounds(50, 150, 150, 30);
        labelName.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        add(labelName);
        JLabel tfname = new JLabel();
        tfname.setBounds(250, 150, 150, 30);
        tfname.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        add(tfname);

        JLabel labelFName = new JLabel("FatherName");
        labelFName.setBounds(50, 200, 150, 30);
        labelFName.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        add(labelFName);
        JLabel tfFname = new JLabel();
        tfFname.setBounds(250, 200, 150, 30);
        tfFname.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        add(tfFname);

        JLabel labelsalary = new JLabel("Salary");
        labelsalary.setBounds(500, 150, 150, 30);
        labelsalary.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        add(labelsalary);
        tfsalary = new JTextField();
        tfsalary.setBounds(700, 150, 150, 30);
        tfsalary.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        add(tfsalary);

        JLabel labeladdress = new JLabel("Address");
        labeladdress.setBounds(500, 200, 150, 30);
        labeladdress.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        add(labeladdress);

        tfaddress = new JTextField();
        tfaddress.setBounds(700, 200, 150, 30);
        tfaddress.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        add(tfaddress);

        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(50, 250, 150, 30);
        labelphone.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        add(labelphone);

        tfphone = new JTextField();
        tfphone.setBounds(250, 250, 150, 30);
        tfphone.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        add(tfphone);

        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(500, 250, 150, 30);
        labelemail.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        add(labelemail);

        tfemail = new JTextField();
        tfemail.setBounds(700, 250, 150, 30);
        tfemail.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        add(tfemail);

        JLabel labeldob = new JLabel("Date Of Birth");
        labeldob.setBounds(50, 300, 150, 30);
        labeldob.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        add(labeldob);
        JLabel tfdob = new JLabel();
        tfdob.setBounds(250, 300, 150, 30);
        tfdob.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        add(tfdob);

        JLabel labelHighEdu = new JLabel("Highest Education");
        labelHighEdu.setBounds(500, 300, 180, 30);
        labelHighEdu.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        add(labelHighEdu);
        tfeducation = new JTextField();
        tfeducation.setBackground(Color.WHITE);
        tfeducation.setBounds(700, 300, 150, 30);
        tfeducation.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        add(tfeducation);

        JLabel labeldesignation = new JLabel("Designation");
        labeldesignation.setBounds(50, 350, 150, 30);
        labeldesignation.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        add(labeldesignation);
         tfdesignation = new JTextField();
        tfdesignation.setBounds(250, 350, 150, 30);
        tfdesignation.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        add(tfdesignation);

        JLabel labelAadhar = new JLabel("Aadhar Number");
        labelAadhar.setBounds(500, 350, 150, 30);
        labelAadhar.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        add(labelAadhar);
        JLabel tfaadhar = new JLabel();
        tfaadhar.setBounds(700, 350, 150, 30);
        tfaadhar.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        add(tfaadhar);

        JLabel labelEmpid = new JLabel("Empolyee ID");
        labelEmpid.setBounds(50, 400, 150, 30);
        labelEmpid.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
        add(labelEmpid);
        JLabel tfEmpid = new JLabel();
        tfEmpid.setBounds(250, 400, 150, 30);
        tfEmpid.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        add(tfEmpid);

        try {
            conn c = new conn();
            String query = "Select * from addemployee where EmpId ='" + empId + "'";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                tfname.setText(rs.getString("name"));
                tfFname.setText(rs.getString("FName"));
                tfdob.setText(rs.getString("dob"));
                tfaddress.setText(rs.getString("address"));
                tfsalary.setText(rs.getString("salary"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                tfeducation.setText(rs.getString("education"));
                tfaadhar.setText(rs.getString("Aadhar"));
                tfEmpid.setText(rs.getString("EmpId"));
                tfdesignation.setText(rs.getString("designation"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        submit = new JButton("Update Details");
        submit.setBounds(250, 500, 150, 50);
        submit.setBackground(Color.black);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        back = new JButton("Back");
        back.setBounds(450, 500, 150, 50);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);


        setSize(900, 700);
        setLocation(300, 50);
        setVisible(true);


    }

    public static void main(String[] args) {
        new updateEmployee("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource()== submit){
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education =tfeducation.getText();
            String designation = tfdesignation.getText();

            try {
                conn c  = new conn();
                String query = "update  addemployee set salary='"+salary+"', address='"+address+"', phone ='"+phone+"',email='"+email+"',education ='"+education+"',designation ='"+designation+"' where EmpId='"+empId+"'";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Details Updated successfully");
                setVisible(false);
                new home();

            }catch (Exception ee){
                ee.printStackTrace();

            }
        }
        else {
            setVisible(false);
            new home();
        }

    }
}
