package view;

import javax.swing.*;
import java.awt.*;

public class RegisterPatientView extends JFrame {

    private JTextField idField;
    private JTextField nameField;
    private JTextField phoneField;
    private JTextField addressField;

    private JButton saveButton;
    private JButton backButton;

    public RegisterPatientView() {

        setTitle("Register Patient");
        setSize(400, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel titleLabel = new JLabel("Patient Registration");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        JLabel idLabel = new JLabel("Patient ID:");
        JLabel nameLabel = new JLabel("Name:");
        JLabel phoneLabel = new JLabel("Phone:");
        JLabel addressLabel = new JLabel("Address:");

        idField = new JTextField();
        nameField = new JTextField();
        phoneField = new JTextField();
        addressField = new JTextField();

        saveButton = new JButton("Save Patient");
        backButton = new JButton("Back");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 10, 10));

        panel.add(new JLabel(""));
        panel.add(titleLabel);

        panel.add(idLabel);
        panel.add(idField);

        panel.add(nameLabel);
        panel.add(nameField);

        panel.add(phoneLabel);
        panel.add(phoneField);

        panel.add(addressLabel);
        panel.add(addressField);

        panel.add(saveButton);
        panel.add(backButton);

        add(panel);
    }

    public String getPatientId() {
        return idField.getText();
    }

    public String getPatientName() {
        return nameField.getText();
    }

    public String getPhone() {
        return phoneField.getText();
    }

    public String getAddress() {
        return addressField.getText();
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
        phoneField.setText("");
        addressField.setText("");
    }

    public static void main(String[] args) {
        RegisterPatientView view = new RegisterPatientView();
        view.setVisible(true);
    }
}