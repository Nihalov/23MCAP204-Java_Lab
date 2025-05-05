import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationForm extends JFrame implements ActionListener {

    // Declare components
    private JTextField nameField, emailField;
    private JRadioButton maleButton, femaleButton, otherButton;
    private JComboBox<String> courseComboBox;
    private JCheckBox readingCheckBox, travelingCheckBox, gamingCheckBox;
    private JButton submitButton, resetButton;
    private ButtonGroup genderGroup;

    public StudentRegistrationForm() {k
        setTitle("Student Registration Form");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Panel to hold everything
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Name
        panel.add(new JLabel("Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        // Email
        panel.add(new JLabel("Email:"));
        emailField = new JTextField();
        panel.add(emailField);

        // Gender
        panel.add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");
        otherButton = new JRadioButton("Other");
        genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        genderGroup.add(otherButton);
        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        genderPanel.add(otherButton);
        panel.add(genderPanel);

        // Course
        panel.add(new JLabel("Course:"));
        String[] courses = {"B.Tech", "B.Sc", "B.Com", "MCA", "MBA"};
        courseComboBox = new JComboBox<>(courses);
        panel.add(courseComboBox);

        // Hobbies
        panel.add(new JLabel("Hobbies:"));
        JPanel hobbyPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        readingCheckBox = new JCheckBox("Reading");
        travelingCheckBox = new JCheckBox("Traveling");
        gamingCheckBox = new JCheckBox("Gaming");
        hobbyPanel.add(readingCheckBox);
        hobbyPanel.add(travelingCheckBox);
        hobbyPanel.add(gamingCheckBox);
        panel.add(hobbyPanel);

        // Buttons
        submitButton = new JButton("Submit");
        resetButton = new JButton("Reset");
        submitButton.addActionListener(this);
        resetButton.addActionListener(this);

        panel.add(submitButton);
        panel.add(resetButton);

        // Add panel to frame
        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText().trim();
            String email = emailField.getText().trim();
            String gender = "";
            if (maleButton.isSelected()) {
                gender = "Male";
            } else if (femaleButton.isSelected()) {
                gender = "Female";
            } else if (otherButton.isSelected()) {
                gender = "Other";
            }
            String course = (String) courseComboBox.getSelectedItem();
            String hobbies = "";
            if (readingCheckBox.isSelected()) hobbies += "Reading ";
            if (travelingCheckBox.isSelected()) hobbies += "Traveling ";
            if (gamingCheckBox.isSelected()) hobbies += "Gaming ";

            // Validation
            if (name.isEmpty() || email.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Name and Email are required fields!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Show submitted data
            String message = "Name: " + name + "\n"
                    + "Email: " + email + "\n"
                    + "Gender: " + gender + "\n"
                    + "Course: " + course + "\n"
                    + "Hobbies: " + hobbies;
            JOptionPane.showMessageDialog(this, message, "Registration Details", JOptionPane.INFORMATION_MESSAGE);

        } else if (e.getSource() == resetButton) {
            // Clear all fields
            nameField.setText("");
            emailField.setText("");
            genderGroup.clearSelection();
            courseComboBox.setSelectedIndex(0);
            readingCheckBox.setSelected(false);
            travelingCheckBox.setSelected(false);
            gamingCheckBox.setSelected(false);
        }
    }

    public static void main(String[] args) {
        new StudentRegistrationForm();
    }
}
