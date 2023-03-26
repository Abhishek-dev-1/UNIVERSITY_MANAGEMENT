import javax.swing.*;
import java.awt.*;
public class Splash extends JFrame implements Runnable {
    Thread t;

    Splash() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/image1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        add(img);
        t = new Thread(this);
        t.start();
        setVisible(true);
        setLocation(250, 50);
        setSize(1000, 600);
        try {
            Thread.sleep(10);
        } catch (Exception e) {

        }
    }
        public void run(){
            try {
                Thread.sleep(7000);
                setVisible(false);
                new Login();
            }catch (Exception e){

            }
        }

    public static void main(String[] args){
        new Splash();
    }
}
