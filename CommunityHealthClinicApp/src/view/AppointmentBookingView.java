package view;

import javax.swing.*;
import java.awt.*;

public class AppointmentBookingView extends JFrame {

    private JTextField appointmentIdField;
    private JTextField patientIdField;
    private JTextField doctorIdField;
    private JTextField dateField;
    private JTextField timeField;

    private JButton bookButton;
    private JButton backButton;

    public AppointmentBookingView() {

        setTitle("Book Appointment");
        setSize(420, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel titleLabel = new JLabel("Appointment Booking");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        appointmentIdField = new JTextField();
        patientIdField = new JTextField();
        doctorIdField = new JTextField();
        dateField = new JTextField();
        timeField = new JTextField();

        bookButton = new JButton("Book Appointment");
        backButton = new JButton("Back");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2, 10, 10));

        panel.add(new JLabel(""));
        panel.add(titleLabel);

        panel.add(new JLabel("Appointment ID:"));
        panel.add(appointmentIdField);

        panel.add(new JLabel("Patient ID:"));
        panel.add(patientIdField);

        panel.add(new JLabel("Doctor ID:"));
        panel.add(doctorIdField);

        panel.add(new JLabel("Date (YYYY-MM-DD):"));
        panel.add(dateField);

        panel.add(new JLabel("Time:"));
        panel.add(timeField);

        panel.add(bookButton);
        panel.add(backButton);

        add(panel);
    }

    public String getAppointmentId() {
        return appointmentIdField.getText();
    }

    public String getPatientId() {
        return patientIdField.getText();
    }

    public String getDoctorId() {
        return doctorIdField.getText();
    }

    public String getDate() {
        return dateField.getText();
    }

    public String getTime() {
        return timeField.getText();
    }

    public JButton getBookButton() {
        return bookButton;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public void clearFields() {
        appointmentIdField.setText("");
        patientIdField.setText("");
        doctorIdField.setText("");
        dateField.setText("");
        timeField.setText("");
    }

    public static void main(String[] args) {
        AppointmentBookingView view = new AppointmentBookingView();
        view.setVisible(true);
    }
}