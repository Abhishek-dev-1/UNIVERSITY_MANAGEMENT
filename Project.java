import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener{
    Project(){
            setSize(1500,800);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/image3.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        add(img);

        JMenuBar mb=new JMenuBar();
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.BLUE);
        mb.add(newInformation);

        JMenuItem facultyInfo=new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        newInformation.add(facultyInfo);

        JMenuItem studentInfo=new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.WHITE);
        newInformation.add(studentInfo);

        JMenu details = new JMenu("View Details");
        details.setForeground(Color.RED);
        mb.add(details);

        JMenuItem facultydetails=new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.WHITE);
        details.add(facultydetails);

        JMenuItem studentdetails=new JMenuItem("View Student details");
        studentdetails.setBackground(Color.WHITE);
        details.add(studentdetails);

        JMenu leave = new JMenu("Apply Leave");
        leave.setForeground(Color.BLUE);
        mb.add(leave);

        JMenuItem facultyleave=new JMenuItem(" Faculty Leave");
        facultyleave.setBackground(Color.WHITE);
        leave.add(facultyleave);

        JMenuItem studentleave=new JMenuItem(" Student Leave");
        studentleave.setBackground(Color.WHITE);
        leave.add(studentleave);

        JMenu leavedetails = new JMenu("Apply Leave Details");
        leavedetails.setForeground(Color.RED);
        mb.add(leavedetails);

        JMenuItem facultyleavedetails=new JMenuItem(" Faculty Leave Details");
        facultyleavedetails.setBackground(Color.WHITE);
        leavedetails.add(facultyleavedetails);

        JMenuItem studentleavedetails=new JMenuItem(" Student Leave Details");
        studentleavedetails.setBackground(Color.WHITE);
        leavedetails.add(studentleavedetails);

        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.BLUE);
        mb.add(exam);

        JMenuItem examinationdetails=new JMenuItem(" Examination Results");
        examinationdetails.setBackground(Color.WHITE);
        exam.add(examinationdetails);

        JMenuItem entermarks=new JMenuItem(" Enter Marks");
        entermarks.setBackground(Color.WHITE);
        exam.add(entermarks);

        JMenu updateinfo = new JMenu("Update Details");
        updateinfo.setForeground(Color.RED);
        mb.add(updateinfo);

        JMenuItem facultyinfo=new JMenuItem(" Update Faculty Information");
        facultyinfo.setBackground(Color.WHITE);
        updateinfo.add(facultyinfo);

        JMenuItem studentinfo=new JMenuItem(" Update Student Information");
        studentinfo.setBackground(Color.WHITE);
        updateinfo.add(studentinfo);

        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.BLUE);
        mb.add(fee);

        JMenuItem feeStructure=new JMenuItem(" Fee Structure");
        feeStructure.setBackground(Color.WHITE);
        fee.add(feeStructure);

        JMenuItem feeform=new JMenuItem(" Student Fee Form");
        feeform.setBackground(Color.WHITE);
        fee.add(feeform);

        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.RED);
        mb.add(utility);

        JMenuItem notepad=new JMenuItem("NOTEPAD");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);

        JMenuItem calc=new JMenuItem("CALCULATOR");
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
        utility.add(calc);

        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.RED);
        mb.add(exit);

        JMenuItem ex=new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);

        setJMenuBar(mb);


            setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String msg=ae.getActionCommand();
        if(msg.equals("Exit")){
            setVisible(false);
        } else if (msg.equals("CALCULATOR")) {
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){

            }
        } else if (msg.equals("NOTEPAD")) {
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){

            }

        }
    }
    public static void main(String[] args){
        new Project();
    }
}
