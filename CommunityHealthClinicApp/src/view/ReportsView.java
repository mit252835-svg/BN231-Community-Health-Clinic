package view;

import javax.swing.*;
import java.awt.*;

public class ReportsView extends JFrame {

    private JTextArea reportArea;

    private JButton showPatientsButton;
    private JButton showAppointmentsButton;
    private JButton searchPatientButton;
    private JButton sortAppointmentsButton;
    private JButton updatePatientButton;
    private JButton deletePatientButton;
    private JButton backButton;

    public ReportsView() {

        setTitle("Reports");
        setSize(850, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel titleLabel = new JLabel("Clinic Reports");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        reportArea = new JTextArea();
        reportArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(reportArea);

        showPatientsButton = new JButton("Show Patients");
        showAppointmentsButton = new JButton("Show Appointments");
        searchPatientButton = new JButton("Search Patient");
        sortAppointmentsButton = new JButton("Sort Appointments");

        updatePatientButton = new JButton("Update Patient");
        deletePatientButton = new JButton("Delete Patient");

        backButton = new JButton("Back");

        JPanel buttonPanel = new JPanel();

        buttonPanel.setLayout(
                new GridLayout(2, 4, 10, 10)
        );

        buttonPanel.add(showPatientsButton);
        buttonPanel.add(showAppointmentsButton);
        buttonPanel.add(searchPatientButton);
        buttonPanel.add(sortAppointmentsButton);

        buttonPanel.add(updatePatientButton);
        buttonPanel.add(deletePatientButton);
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


    public JButton getSearchPatientButton() {
        return searchPatientButton;
    }


    public JButton getSortAppointmentsButton() {
        return sortAppointmentsButton;
    }


    public JButton getUpdatePatientButton() {
        return updatePatientButton;
    }


    public JButton getDeletePatientButton() {
        return deletePatientButton;
    }


    public JButton getBackButton() {
        return backButton;
    }
}