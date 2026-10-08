import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Q7_Calculator extends JFrame
        implements ActionListener {
    JTextField num1, num2, result;
    JButton add, subtract, multiply, divide;
    Q7_Calculator() {
        setTitle("Calculator");
        setSize(400, 250);
        setLayout(new FlowLayout());
        add(new JLabel("Number 1:"));
        num1 = new JTextField(10);
        add(num1);
        add(new JLabel("Number 2:"));
        num2 = new JTextField(10);
        add(num2);
        add = new JButton("+");
        subtract = new JButton("-");
        multiply = new JButton("*");
        divide = new JButton("/");
        add(add);
        add(subtract);
        add(multiply);
        add(divide);
        add(new JLabel("Result:"));
        result = new JTextField(15);
        result.setEditable(false);
        add(result);
        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        double a = Double.parseDouble(num1.getText());
        double b = Double.parseDouble(num2.getText());
        double answer = 0;
        if (e.getSource() == add) {
            answer = a + b;
        }
        else if (e.getSource() == subtract) {
            answer = a - b;
        }
        else if (e.getSource() == multiply) {
            answer = a * b;
        }
        else if (e.getSource() == divide) {
            if (b == 0) {
                result.setText("Cannot divide by zero");
                return;
            }
            answer = a / b;
        }
        result.setText(String.valueOf(answer));
    }
    public static void main(String[] args) {
        new Q7_Calculator();
    }
}
