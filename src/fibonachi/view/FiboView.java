package fibonachi.view;

import fibonachi.controller.FiboController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class FiboView extends JFrame {
  public FiboView() {
    super("Simple Example");
    FiboController controller = FiboController.getInstance();
    controller.init(this);
  }
}