package SE.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Laba_4 extends JFrame{


    public Laba_4(String title, int width, int height) {
        JFrame frame = new JFrame(title);
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        JTextField text1 = new JTextField(10);
        JTextField text2 = new JTextField(10);
        JTextField text3 = new JTextField(20);
        JButton button1 = new JButton("Get_User_Name");
        JButton button2 = new JButton("Get_Comp_Name");
        JLabel label = new JLabel("Result");
        frame.setLayout(new BorderLayout());
        JPanel panel1 = new JPanel(new FlowLayout());
        panel1.add(text1);
        panel1.add(button1);
        JPanel panel2 = new JPanel(new FlowLayout());
        panel2.add(text2);
        panel2.add(button2);
        JPanel panel3 = new JPanel(new FlowLayout());
        panel3.add(label);
        panel3.add(text3);

        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.add(panel3,BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        JMenu menu = new JMenu("Message");
        JMenuItem question = new JMenuItem("Question");
        question.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text3.setText(question.getText());
            }
        });
        menu.add(question);
        JMenuItem inputName = new JMenuItem("Input name");
        inputName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Input your facking name!!!");
            }
        });
        menu.add(inputName);
        menuBar.add(menu);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Laba_4 myWindow = new Laba_4("My Application",300,200);
    }
}
