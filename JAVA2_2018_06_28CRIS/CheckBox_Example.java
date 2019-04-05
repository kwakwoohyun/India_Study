package JAVA2_2018_06_28CRIS;

import javax.swing.*;
import java.awt.event.*;

public class CheckBox_Example extends JFrame implements ActionListener {
   JLabel l;
   JCheckBox cb1, cb2, cb3;
   JButton b;
   JTextField t1,t2,t3;
   CheckBox_Example() {
      l = new JLabel("Food Ordering System");
      l.setBounds(50, 50, 300, 20);
      cb1 = new JCheckBox("Pizza @ 100");
      cb1.setBounds(100, 100, 150, 20);
      cb2 = new JCheckBox("Burger @ 30");
      cb2.setBounds(100, 150, 150, 20);
      cb3 = new JCheckBox("Tea @ 10");
      cb3.setBounds(100, 200, 150, 20);
      t1=new JTextField();
      t1.setBounds(250,100,50,20);
      t2=new JTextField();
      t2.setBounds(250,150,50,20);
      t3=new JTextField();
      t3.setBounds(250,200,50,20);
      b = new JButton("Order");
      b.setBounds(100, 250, 80, 30);
      b.addActionListener(this);
      add(l);
      add(cb1);
      add(cb2);
      add(cb3);
      add(b);
      add(t1);
      add(t2);
      add(t3);
      setSize(400, 400);
      setLayout(null);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);

   }

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      new CheckBox_Example();

   }

   @Override
   public void actionPerformed(ActionEvent arg0) {
      // TODO Auto-generated method stub
      float amount=0;
      String msg="";
      int q1,q2,q3=0;
      if(cb1.isSelected()) {
         q1 = Integer.parseInt(t1.getText());
         amount=100*q1+amount;
         msg="Pizza: 100 Quantity : "+q1+"\n";
      }
      if(cb2.isSelected()) {
         q2 = Integer.parseInt(t2.getText());
         amount=30*q2+amount;
         msg+="Burger: 30 Quantity : "+q2+"\n";
      }
      if(cb3.isSelected()) {
         q3 = Integer.parseInt(t3.getText());
         amount=10*q3+amount;
         msg+="Tea: 10 Quantity : "+q3+"\n";
      }
      msg+="------------\n";
      JOptionPane.showMessageDialog(this, msg+"Total : "+amount);
   }

}