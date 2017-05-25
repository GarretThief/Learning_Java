package SE.classwork;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Garret on 04.04.2017.
 */
public class Gui {
    public static void main(String[] args) {
        JButton button = new JButton("Click!");
        button.setPreferredSize(new Dimension(50,50));
      //  button.setSize(new Dimension(50,50));

        JFrame frame = new JFrame("JAVA");
        frame.setSize(400,300);
        frame.setLocation(100,200);
        frame.add(button);
        frame.setVisible(true);
    }
}
