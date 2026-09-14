package controller;

import javax.swing.JOptionPane;

import model.Appointment;
import model.Clinic;
import model.Patient;
import view.ReportsView;

public class ReportsController {

    private Clinic clinic;
    private ReportsView view;

    public ReportsController(Clinic clinic) {

        this.clinic = clinic;
        this.view = new ReportsView();

        view.getShowPatientsButton().addActionListener(e -> showPatients());

        view.getShowAppointmentsButton().addActionListener(e -> showAppointments());

        view.getSearchPatientButton().addActionListener(e -> searchPatient());
        
        view.getSortAppointmentsButton().addActionListener(e -> sortAppointments());

        view.getBackButton().addActionListener(e -> view.dispose());

        view.setVisible(true);
    }

    private void showPatients() {

        String result = "";

        if (clinic.getPatients().size() == 0) {

            result = "No patients found.";

        } else {

            for (Patient patient : clinic.getPatients()) {

                result = result
                        + "Patient ID: " + patient.getPatientId() + "\n"
                        + "Name: " + patient.getName() + "\n"
                        + "Phone: " + patient.getPhone() + "\n"
                        + "Address: " + patient.getAddress() + "\n\n";
            }
        }

        view.getReportArea().setText(result);
    }

    private void showAppointments() {

        String result = "";

        if (clinic.getAppointments().size() == 0) {

            result = "No appointments found.";

        } else {

            for (Appointment appointment : clinic.getAppointments()) {

                result = result
                        + "Appointment ID: " + appointment.getAppointmentId() + "\n"
                        + "Patient: " + appointment.getPatient().getName() + "\n"
                        + "Doctor: " + appointment.getDoctor().getName() + "\n"
                        + "Date: " + appointment.getDate() + "\n"
                        + "Time: " + appointment.getTime() + "\n\n";
            }
        }

        view.getReportArea().setText(result);
    }

    private void searchPatient() {

        String patientId = JOptionPane.showInputDialog(
                view,
                "Enter Patient ID:"
        );

        if (patientId == null || patientId.isEmpty()) {
            return;
        }

        Patient patient = clinic.findPatientById(patientId);

        if (patient == null) {

            view.getReportArea().setText("Patient not found.");

        } else {

            String result =
                    "Patient ID: " + patient.getPatientId() + "\n"
                    + "Name: " + patient.getName() + "\n"
                    + "Phone: " + patient.getPhone() + "\n"
                    + "Address: " + patient.getAddress();

            view.getReportArea().setText(result);
        }
    }
    private void sortAppointments() {

        if (clinic.getAppointments().size() == 0) {

            view.getReportArea().setText("No appointments found.");
            return;
        }

        clinic.sortAppointmentsByDate();

        String result = "";

        for (Appointment appointment : clinic.getAppointments()) {

            result = result
                    + "Appointment ID: " + appointment.getAppointmentId() + "\n"
                    + "Patient: " + appointment.getPatient().getName() + "\n"
                    + "Doctor: " + appointment.getDoctor().getName() + "\n"
                    + "Date: " + appointment.getDate() + "\n"
                    + "Time: " + appointment.getTime() + "\n\n";
        }

        view.getReportArea().setText(result);
    }
}