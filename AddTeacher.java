package UniversityManagementSystem;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

 public abstract class AddTeacher  extends JFrame implements Runnable{

    private static final long serialVersionUID = 1L;

    JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,id16,id17,lab,lab1,lab2;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
    JButton b,b1,b2,b3;
    JComboBox c1,c2;
    
      
    Random ran = new Random();
    long first4;
    long first;
    
    

    @SuppressWarnings("unchecked")
    public AddTeacher(){
        this.first = Math.abs(first4);
        this.first4 = (ran.nextLong() % 9000L) + 1000L;
        f = new JFrame("Lovely professional university");
        f.setBackground(Color.RED);
        f.setLayout(null);

        id15=new JLabel();
        id15.setBounds(0,0,900,700);
        id15.setLayout(null);
//        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icons/image4.jpg"));
//        Image i3 = img.getImage().getScaledInstance(1220, 700,Image.SCALE_DEFAULT);
//        ImageIcon icc3 = new ImageIcon(i3);
//        id15.setIcon(icc3);

        id8 = new JLabel("New Teacher Detail");
        id8.setBounds(320,30,500,50);
        id8.setFont(new Font("serif",Font.ITALIC,25));
        id8.setForeground(Color.RED);
        id15.add(id8);
        f.add(id15);

 
        id1 = new JLabel("Name");
        id1.setBounds(50,150,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id1);

        t1=new JTextField();
        t1.setBounds(200,150,150,30);
        id15.add(t1);

        id2 = new JLabel("Father's Name");
        id2.setBounds(400,150,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id2);

        t2=new JTextField();
        t2.setBounds(600,150,150,30);
        id15.add(t2);

        id3= new JLabel("Age");
        id3.setBounds(50,200,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id3);

        t3=new JTextField();
        t3.setBounds(200,200,150,30);
        id15.add(t3);

        id4= new JLabel("DOB (dd/mm/yyyy)");  
        id4.setBounds(400,200,200,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id4);

        t4=new JTextField();
        t4.setBounds(600,200,150,30);
        id15.add(t4);

        id5= new JLabel("Address");
        id5.setBounds(50,250,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id5);

        t5=new JTextField();
        t5.setBounds(200,250,150,30);
        id15.add(t5);

        id6= new JLabel("Phone");
        id6.setBounds(400,250,100,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id6);

        t6=new JTextField();
        t6.setBounds(600,250,150,30);
        id15.add(t6);

        id7= new JLabel("Email Id");
        id7.setBounds(50,300,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id7);

        t7=new JTextField();
        t7.setBounds(200,300,150,30);
        id15.add(t7);
       

        id11= new JLabel("Aadhar No");
        id11.setBounds(400,300,100,30);
        id11.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id11);

        t10=new JTextField();
        t10.setBounds(600,300,150,30);
        id15.add(t10);

        id12= new JLabel("Education");
        id12.setBounds(50,350,150,30);
        id12.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id12);

        t11=new JTextField();   
        t11.setBounds(200,350,150,30);
        id15.add(t11);


        lab=new JLabel("Course");
        lab.setBounds(400,350,150,30);
	lab.setFont(new Font("serif",Font.BOLD,20));
        id15.add(lab);
            
        String course[] = {"B.Tech","BBA","BCA","Bsc","Msc","MBA","MCA","BA","BCom"};
        c1 = new JComboBox(course);
        c1.setBackground(Color.WHITE);
        c1.setBounds(600,350,150,30);
        id15.add(c1);
        
        lab2=new JLabel("Department");
        lab2.setBounds(50,400,150,30);
	lab2.setFont(new Font("serif",Font.BOLD,20));
        id15.add(lab2);
        
        String branch[] = {"Computer Science","Electronics","Electrical","Mechanical","Civil"};
        c2 = new JComboBox(branch);
        c2.setBackground(Color.WHITE);
        c2.setBounds(200,400,150,30);
        id15.add(c2);
        
        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(250,550,150,40);
        
        id15.add(b);

        b1=new JButton("Cancel");   
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450,550,150,40);
        
        id15.add(b1);
//        
//        b.addActionListener(this);
//        b1.addActionListener(this);
        
        f.setVisible(true);
        f.setSize(900,700);
        f.setLocation(400,150);
    

 
    }
    public static void main(String[ ] arg){
        new AddTeacher() {
            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
    }
 }