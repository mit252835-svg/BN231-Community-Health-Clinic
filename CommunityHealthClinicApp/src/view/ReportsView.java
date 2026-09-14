package view;

import javax.swing.*;
import java.awt.*;

public class ReportsView extends JFrame {

    private JTextArea reportArea;
    private JButton showPatientsButton;
    private JButton showAppointmentsButton;
    private JButton backButton;

    public ReportsView() {

        setTitle("Reports");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel titleLabel = new JLabel("Clinic Reports");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        reportArea = new JTextArea();
        reportArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(reportArea);

        showPatientsButton = new JButton("Show Patients");
        showAppointmentsButton = new JButton("Show Appointments");
        backButton = new JButton("Back");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 3, 10, 10));

        buttonPanel.add(showPatientsButton);
        buttonPanel.add(showAppointmentsButton);
        buttonPanel.add(backButton);

        setLayout(new BorderLayout(10, 10));

        add(titleLabel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public JTextArea getReportArea() {
        return reportArea;
    }

    public JButton getShowPatientsButton() {
        return showPatientsButton;
    }

    public JButton getShowAppointmentsButton() {
        return showAppointmentsButton;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public static void main(String[] args) {
        ReportsView view = new ReportsView();
        view.setVisible(true);
    }
}