import java.awt.*;
import java.awt.event.*;
public class Q6_StudentRegistration extends Frame
        implements ActionListener {
    Label nameLabel, rollLabel, courseLabel;
    TextField nameField, rollField, courseField;
    Button submitButton;
    Q6_StudentRegistration() {
        setTitle("Student Registration Form");
        setSize(400, 250);
        setLayout(new FlowLayout());
        nameLabel = new Label("Name:");
        nameField = new TextField(25);
        rollLabel = new Label("Roll No:");
        rollField = new TextField(25);
        courseLabel = new Label("Course:");
        courseField = new TextField(25);
        submitButton = new Button("Submit");
        add(nameLabel);
        add(nameField);
        add(rollLabel);
        add(rollField);
        add(courseLabel);
        add(courseField);
        add(submitButton);
        submitButton.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String details =
                "Registration Successful!\n\n" +
                "Name: " + nameField.getText() + "\n" +
                "Roll No: " + rollField.getText() + "\n" +
                "Course: " + courseField.getText();
        Dialog dialog =
                new Dialog(this, "Registration Details", true);
        dialog.setLayout(new FlowLayout());
        TextArea area = new TextArea(details, 6, 35);
        Button okButton = new Button("OK");
        dialog.add(area);
        dialog.add(okButton);
        okButton.addActionListener(event -> dialog.dispose());
        dialog.setSize(350, 200);
        dialog.setVisible(true);
    }
    public static void main(String[] args) {
        new Q6_StudentRegistration();
    }
}
