package UniversityManagementSystem;

import java.awt.*;
import javax.swing.*;

 public abstract class StudentDetails  extends JFrame implements Runnable{

    private static final long serialVersionUID = 1L;

   JLabel l1,l2,l3;
    JButton b1,b2,b3;
    JTextField t2;
    StudentDetails(){
        super("Student Details");
        setSize(1260,650);
        setLocation(200,200);
        setLayout(null);
        
        l1 = new JLabel("Enter roll number to delete Student : ");
        l1.setBounds(50,360,400,30);
        l1.setFont(new Font("serif",Font.BOLD,20));
        add(l1);
        
        t2 = new JTextField();
        t2.setBounds(400,360,200,30);
        add(t2);
        
        b1 = new JButton("Delete");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(620, 360, 100 ,30);
        add(b1);
            
        l2 = new JLabel("Add New Student");
        l2.setBounds(50,450,400,30);
        l2.setFont(new Font("serif",Font.BOLD,20));
        add(l2);
        
        b2 = new JButton("Add Student");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(300, 450, 150 ,30);
        add(b2);
        
        l3 = new JLabel("Update Student Details");
        l3.setBounds(50,490,400,30);
        l3.setFont(new Font("serif",Font.BOLD,20));
        add(l3);
        
        b3 = new JButton("Update Student");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(300, 490, 150 ,30);
        add(b3);
        
        setVisible(true);

 
    }
    public static void main(String[ ] arg){
        new StudentDetails() {
            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
    }
 }