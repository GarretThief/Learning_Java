package fibonachi.controller;

import fibonachi.model.FiboModel;
import fibonachi.view.FiboView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FiboController {
  private JButton button = new JButton("Press");
  private JTextField input = new JTextField("", 5);
  private JLabel label = new JLabel("Input:");
  private JRadioButton radioByIteration = new JRadioButton("Get Fibonachi by iteration");
  private JRadioButton radioByFibonachiNum = new JRadioButton("Get iteration by Fibonachi number");
  private static FiboController INSTANCE = new FiboController();

  public void init(FiboView view) {

    view.setBounds(200, 200, 350, 200);
    view.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    Container container = view.getContentPane();
    container.setLayout(new GridLayout(3, 2, 2, 2));
    container.add(label);
    container.add(input);

    ButtonGroup group = new ButtonGroup();
    group.add(radioByIteration);
    group.add(radioByFibonachiNum);
    container.add(radioByIteration);

    radioByIteration.setSelected(true);
    container.add(radioByFibonachiNum);
    container.add(button);
    button.addActionListener(new ActionListener() { // listener here!
      @Override
      public void actionPerformed(ActionEvent e) {
        controllAction(e);
      }
    });
  }

  private void controllAction(ActionEvent event) {
    String inputText = input.getText();
// VALIDATION->
    if (!isNumber(inputText))
      JOptionPane.showMessageDialog(null, "TRY AGAIN.",
          "NOT   A   NUMBER    You   added", JOptionPane.ERROR_MESSAGE);

// CHOSEN radioButton>
    if (radioByIteration.isSelected()) {
      showIterationDialog(Integer.valueOf(inputText));
    } else {
      showFibonachiDialog(Integer.valueOf(inputText));
    }
  }

  private boolean isNumber(String inputText) {
    return inputText.matches("[0-9]+");
  }

  private void showFibonachiDialog(int fibonachiNumber) {
    FiboModel model = FiboModel.getINSTANCE();
    String message = "";

    if (model.isFibonachi(fibonachiNumber)) {
      final int numberByIteration = model.getIterationsToNumber(fibonachiNumber);
      message = fibonachiNumber + "-е число Фибончи = " + numberByIteration;
      showMessage("Это число Фибоначи, детка!", message, JOptionPane.PLAIN_MESSAGE);
    } else {
      int[] nearest = model.getNearest(fibonachiNumber);
      message = "Number " + fibonachiNumber + " is not a Fibonachi number!\n" +
          "The nearest numbers are: " + nearest[0] + " and " + nearest[1];
      showMessage("Эт не число Фибоначи, обломись!", message, JOptionPane.WARNING_MESSAGE);
    }
  }

  private void showIterationDialog(final int iterationNumber) {
    FiboModel model = FiboModel.getINSTANCE();
    try {
      final int numberByIteration = model.getNumberByIteration(iterationNumber);
      showMessage("итерация - " + iterationNumber, iterationNumber + "-е число Фибончи = " +
          numberByIteration, JOptionPane.INFORMATION_MESSAGE);
    } catch (IllegalArgumentException e) {
      e.printStackTrace();
      showMessage("NOT VALID ARGUMENT ->", e.getLocalizedMessage(), JOptionPane.ERROR_MESSAGE);
    }
  }

  private void showMessage(String title, String message, int TYPE_MESSAGE) {
    JOptionPane.showMessageDialog(null, message, title, TYPE_MESSAGE);
  }


  public static FiboController getInstance() {
    return INSTANCE;
  }

  private FiboController() {
  }

}