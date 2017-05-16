package SE.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Created by Garret on 11.04.2017.
 */
public class Laba_1 extends JFrame {
    JFrame frame = new JFrame("Garret\'s window");
    JLabel label = new JLabel("Run a program");
    JComboBox comboBox = new JComboBox();
    DefaultComboBoxModel model = new DefaultComboBoxModel();
    JButton button = new JButton("Run");
    JPanel panel = new JPanel();

    public Laba_1 (int a, int b){
        frame.setSize(a,b);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label.setForeground(Color.RED);

        model.addElement("calc");
        model.addElement("mspaint");
        model.addElement("notepad");
        comboBox.setModel(model);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Runtime runtime = Runtime.getRuntime();
                String str = (String) model.getSelectedItem();
                try {
                    Process process = runtime.exec(str);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });
        panel.setLayout(new FlowLayout());
        panel.add(label);
        panel.add(comboBox);
        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        Laba_1 laba = new Laba_1(360,150);
    }
}
