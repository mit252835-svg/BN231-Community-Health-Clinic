package view;

import javax.swing.*;
import java.awt.*;

public class RegisterDoctorView extends JFrame {

    private JTextField idField;
    private JTextField nameField;
    private JTextField specialtyField;
    private JTextField phoneField;

    private JButton saveButton;
    private JButton backButton;

    public RegisterDoctorView() {

        setTitle("Register Doctor");
        setSize(400, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel titleLabel = new JLabel("Doctor Registration");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        JLabel idLabel = new JLabel("Doctor ID:");
        JLabel nameLabel = new JLabel("Name:");
        JLabel specialtyLabel = new JLabel("Specialty:");
        JLabel phoneLabel = new JLabel("Phone:");

        idField = new JTextField();
        nameField = new JTextField();
        specialtyField = new JTextField();
        phoneField = new JTextField();

        saveButton = new JButton("Save Doctor");
        backButton = new JButton("Back");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 10, 10));

        panel.add(new JLabel(""));
        panel.add(titleLabel);

        panel.add(idLabel);
        panel.add(idField);

        panel.add(nameLabel);
        panel.add(nameField);

        panel.add(specialtyLabel);
        panel.add(specialtyField);

        panel.add(phoneLabel);
        panel.add(phoneField);

        panel.add(saveButton);
        panel.add(backButton);

        add(panel);
    }

    public String getDoctorId() {
        return idField.getText();
    }

    public String getDoctorName() {
        return nameField.getText();
    }

    public String getSpecialty() {
        return specialtyField.getText();
    }

    public String getPhone() {
        return phoneField.getText();
    }

    public JButton getSaveButton() {
        return saveButton;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public void clearFields() {
        idField.setText("");
        nameField.setText("");
        specialtyField.setText("");
        phoneField.setText("");
    }

    public static void main(String[] args) {
        RegisterDoctorView view = new RegisterDoctorView();
        view.setVisible(true);
    }
}