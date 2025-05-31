package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_class extends JFrame {

    Main_class() {

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/neww.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0, 0, 1120, 630);
        add(img);


        JPanel contentBox = new JPanel();
        contentBox.setBounds(300, 120, 520, 350);
        contentBox.setBackground(new Color(0, 0, 128, 80));
        contentBox.setLayout(null);
        img.add(contentBox);


        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(60, 20, 400, 40);
        heading.setFont(new Font("Raleway", Font.BOLD, 26));
        heading.setForeground(new Color(255, 255, 255));
        contentBox.add(heading);


        JButton add = new JButton("Add Employee");
        add.setBounds(60, 100, 180, 40);
        add.setForeground(Color.WHITE);
        add.setBackground(new Color(70, 130, 180));
        add.setFont(new Font("Raleway", Font.PLAIN, 16));
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddEmployee();
                setVisible(false);
            }
        });
        contentBox.add(add);


        JButton view = new JButton("View Employee");
        view.setBounds(270, 100, 180, 40);
        view.setForeground(Color.WHITE);
        view.setBackground(new Color(70, 130, 180));
        view.setFont(new Font("Raleway", Font.PLAIN, 16));
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new View_Employee();
                setVisible(false);
            }
        });
        contentBox.add(view);


        JButton rem = new JButton("Remove Employee");
        rem.setBounds(160, 180, 180, 40);
        rem.setForeground(Color.WHITE);
        rem.setBackground(new Color(70, 130, 180));
        rem.setFont(new Font("Raleway", Font.PLAIN, 16));
        rem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RemoveEmployee();
            }
        });
        contentBox.add(rem);


        setSize(1120, 630);
        setLocation(250, 100);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main_class();
    }
}
