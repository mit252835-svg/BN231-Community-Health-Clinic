package controller;

import javax.swing.JOptionPane;

import model.Appointment;
import model.Clinic;
import model.Doctor;
import model.Patient;
import view.AppointmentBookingView;

public class AppointmentController {

    private Clinic clinic;
    private AppointmentBookingView view;

    public AppointmentController(Clinic clinic) {

        this.clinic = clinic;
        view = new AppointmentBookingView();

        view.getBookButton().addActionListener(e -> bookAppointment());

        view.getBackButton().addActionListener(e -> {
            view.dispose();
        });

        view.setVisible(true);
    }

    private void bookAppointment() {

        String appointmentId = view.getAppointmentId();
        String patientId = view.getPatientId();
        String doctorId = view.getDoctorId();
        String date = view.getDate();
        String time = view.getTime();

        if (appointmentId.isEmpty() || patientId.isEmpty()
                || doctorId.isEmpty() || date.isEmpty() || time.isEmpty()) {

            JOptionPane.showMessageDialog(view, "Please fill in all fields.");
            return;
        }

        Patient patient = clinic.findPatientById(patientId);
        Doctor doctor = clinic.findDoctorById(doctorId);

        if (patient == null) {
            JOptionPane.showMessageDialog(view, "Patient ID not found.");
            return;
        }

        if (doctor == null) {
            JOptionPane.showMessageDialog(view, "Doctor ID not found.");
            return;
        }

        Appointment appointment = new Appointment(
                appointmentId,
                patient,
                doctor,
                date,
                time
        );

        clinic.addAppointment(appointment);

        JOptionPane.showMessageDialog(
                view,
                "Appointment booked successfully."
        );

        view.clearFields();
    }
}