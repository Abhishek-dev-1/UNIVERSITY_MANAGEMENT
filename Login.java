import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login  extends JFrame implements ActionListener{
    JButton login,cancel;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel lblusername =new JLabel("USERNAME");
        lblusername.setBounds(60,20,100,20);
        add(lblusername);
        JTextField tfusername=new JTextField();
        tfusername.setBounds(170,20,150,20);
        add(tfusername);

        JLabel lblpassword = new JLabel("PASSWORD");
        lblpassword.setBounds(60,70,100,20);
        add(lblpassword);
        JTextField tfpassword =new JTextField();
        tfpassword.setBounds(170,70,150,20);
        add(tfpassword);

        login=new JButton("Login");
        login.setBounds(40,140,120,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        login.setFont(new Font("serif",Font.BOLD,18));
        add(login);

        cancel=new JButton("CANCEL");
        cancel.setBounds(170,140,120,30);
        cancel.setForeground(Color.WHITE);
        cancel.setBackground(Color.BLACK);
        cancel.addActionListener(this);
        cancel.setFont(new Font("serif",Font.BOLD,18));
        add(cancel);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/image2.png"));
        Image i2=i1.getImage().getScaledInstance(150,150, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(350,10,200,120);
        add(image);

        setSize(800,500);
        setLocation(400,100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==login){

        } else if (ae.getSource()==cancel) {
            setVisible(false);

        }
    }
        public static void main(String[] args){
        new Login();
        }

}
