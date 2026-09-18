package view;

import javax.swing.*;
import java.awt.*;

public class TreatmentEntryView extends JFrame {

    private JTextField treatmentIdField;
    private JTextField patientIdField;
    private JTextField doctorIdField;
    private JTextField detailsField;
    private JTextField dateField;

    private JButton saveButton;
    private JButton backButton;

    public TreatmentEntryView() {

        setTitle("Treatment Entry");
        setSize(420, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel titleLabel = new JLabel("Treatment Entry");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        treatmentIdField = new JTextField();
        patientIdField = new JTextField();
        doctorIdField = new JTextField();
        detailsField = new JTextField();
        dateField = new JTextField();

        saveButton = new JButton("Save Treatment");
        backButton = new JButton("Back");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2, 10, 10));

        panel.add(new JLabel(""));
        panel.add(titleLabel);

        panel.add(new JLabel("Treatment ID:"));
        panel.add(treatmentIdField);

        panel.add(new JLabel("Patient ID:"));
        panel.add(patientIdField);

        panel.add(new JLabel("Doctor ID:"));
        panel.add(doctorIdField);

        panel.add(new JLabel("Treatment Details:"));
        panel.add(detailsField);

        panel.add(new JLabel("Date (YYYY-MM-DD):"));
        panel.add(dateField);

        panel.add(saveButton);
        panel.add(backButton);

        add(panel);
    }

    public String getTreatmentId() {
        return treatmentIdField.getText();
    }

    public String getPatientId() {
        return patientIdField.getText();
    }

    public String getDoctorId() {
        return doctorIdField.getText();
    }

    public String getTreatmentDetails() {
        return detailsField.getText();
    }

    public String getDate() {
        return dateField.getText();
    }

    public JButton getSaveButton() {
        return saveButton;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public void clearFields() {
        treatmentIdField.setText("");
        patientIdField.setText("");
        doctorIdField.setText("");
        detailsField.setText("");
        dateField.setText("");
    }

    public static void main(String[] args) {
        TreatmentEntryView view = new TreatmentEntryView();
        view.setVisible(true);
    }
}
