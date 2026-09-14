package controller;

import model.Clinic;
import model.Patient;
import model.Appointment;
import view.ReportsView;

public class ReportsController {

    private Clinic clinic;
    private ReportsView view;

    public ReportsController(Clinic clinic) {

        this.clinic = clinic;
        this.view = new ReportsView();

        view.getShowPatientsButton().addActionListener(e -> showPatients());
        view.getShowAppointmentsButton().addActionListener(e -> showAppointments());

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
}
