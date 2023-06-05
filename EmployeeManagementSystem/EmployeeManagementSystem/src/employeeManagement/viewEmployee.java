 package employeeManagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import  net.proteanit.sql.DbUtils;

public class viewEmployee extends JFrame implements ActionListener {
    JTable table;
    Choice Cemployeeid;
    JButton search , print , update, back;
    viewEmployee(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel searchlbl = new JLabel("Search By Employee ID");
        searchlbl.setBounds(20,20,150,20);
        add(searchlbl);

        Cemployeeid = new Choice();
        Cemployeeid.setBounds(180,20,150,20);
        add(Cemployeeid);

        try {
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from addemployee");
            while (rs.next()){
                Cemployeeid.add(rs.getString("EmpId"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        table = new JTable();
        try {
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from addemployee");
            table.setModel(DbUtils.resultSetToTableModel(rs));
            while (rs.next()){
                Cemployeeid.add(rs.getString("EmpId"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(10,100,860,600);
        add(jsp);

        search = new JButton("Search");
        search.setBounds(20,70,80,20);
        search.addActionListener(this);
        add(search);

        update = new JButton("Update");
        update.setBounds(120,70,80,20);
        update.addActionListener(this);
        add(update);

        print = new JButton("Print");
        print.setBounds(220,70,80,20);
        print.addActionListener(this);
        add(print);

        back = new JButton("Back");
        back.setBounds(320,70,80,20);
        back.addActionListener(this);
        add(back);

        setSize(900,700);
        setLocation(300,100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new viewEmployee();
    }

     @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==search) {
            String query = "select * from addemployee where EmpId = '" + Cemployeeid.getSelectedItem() + "'";
            try {
                conn c = new conn();
                ResultSet rs = c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (Exception ae) {
                ae.printStackTrace();
            }
        }
        else if (e.getSource()==update) {
            setVisible(false);
          new updateEmployee(Cemployeeid.getSelectedItem());

        }
        else if (e.getSource()== print) {
           try{
               table.print();
           }catch (Exception ee){
               ee.printStackTrace();
           }
        }
        else if(e.getSource()==back) {
            setVisible(false);
            new home();
        }

    }
}

