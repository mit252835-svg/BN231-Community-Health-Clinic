package view;

import javax.swing.*;
import java.awt.*;

public class MainMenuView extends JFrame {

    private JButton patientButton;
    private JButton doctorButton;
    private JButton appointmentButton;
    private JButton treatmentButton;
    private JButton reportsButton;
    private JButton exitButton;

    public MainMenuView() {

        setTitle("Community Health Clinic");
        setSize(450, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel titleLabel = new JLabel("Community Health Clinic Management System");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        patientButton = new JButton("Register Patient");
        doctorButton = new JButton("Register Doctor");
        appointmentButton = new JButton("Book Appointment");
        treatmentButton = new JButton("Treatment Entry");
        reportsButton = new JButton("Reports");
        exitButton = new JButton("Exit");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 1, 10, 10));

        panel.add(titleLabel);
        panel.add(patientButton);
        panel.add(doctorButton);
        panel.add(appointmentButton);
        panel.add(treatmentButton);
        panel.add(reportsButton);
        panel.add(exitButton);

        add(panel);

        exitButton.addActionListener(e -> System.exit(0));
    }

    public JButton getPatientButton() {
        return patientButton;
    }

    public JButton getDoctorButton() {
        return doctorButton;
    }

    public JButton getAppointmentButton() {
        return appointmentButton;
    }

    public JButton getTreatmentButton() {
        return treatmentButton;
    }

    public JButton getReportsButton() {
        return reportsButton;
    }

    public static void main(String[] args) {

        MainMenuView menu = new MainMenuView();
        menu.setVisible(true);
    }
}