import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculatorGUI extends JFrame {
  private JTextField num1Field;
  private JTextField num2Field;
  private JLabel resultLabel;
  private JButton addButton;
  private JButton subtractButton;
  private JButton multiplyButton;
  private JButton divideButton;

  public CalculatorGUI() {
    setLayout(new FlowLayout());

    num1Field = new JTextField(10);
    add(num1Field);

    num2Field = new JTextField(10);
    add(num2Field);

    addButton = new JButton("+");
    add(addButton);
    addButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          double num1 = Double.parseDouble(num1Field.getText());
          double num2 = Double.parseDouble(num2Field.getText());
          double result = CalculatorOperations.add(num1, num2);
          resultLabel.setText(Double.toString(result));
        } catch (NumberFormatException ex) {
          resultLabel.setText("Invalid input");
        }
      }
    });

    subtractButton = new JButton("-");
    add(subtractButton);
    subtractButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          double num1 = Double.parseDouble(num1Field.getText());
          double num2 = Double.parseDouble(num2Field.getText());
          double result = CalculatorOperations.subtract(num1, num2);
          resultLabel.setText(Double.toString(result));
        } catch (NumberFormatException ex) {
          resultLabel.setText("Invalid input");
        }
      }
    });

    multiplyButton = new JButton("*");
    add(multiplyButton);
    multiplyButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          double num1 = Double.parseDouble(num1Field.getText());
          double num2 = Double.parseDouble(num2Field.getText());
          double result = CalculatorOperations.multiply(num1, num2);
          resultLabel.setText(Double.toString(result));
        } catch (NumberFormatException ex) {
          resultLabel.setText("Invalid input");
        }
      }
    });

    divideButton = new JButton("/");
    add(divideButton);
    divideButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        try {
          double num1 = Double.parseDouble(num1Field.getText());
          double num2 = Double.parseDouble(num2Field.getText());
          double result = CalculatorOperations.divide(num1, num2);
          resultLabel.setText(Double.toString(result));
        } catch (NumberFormatException ex) {
          resultLabel.setText("Invalid input");
        } catch (ArithmeticException ex) {
          resultLabel.setText("Cannot divide by zero");
        }
      }
    });

    resultLabel = new JLabel("");
    add(resultLabel);
  }
}