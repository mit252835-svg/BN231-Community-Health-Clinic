package controller;

import javax.swing.JOptionPane;

import model.Clinic;
import model.Doctor;
import model.Patient;
import model.Treatment;
import view.TreatmentEntryView;

public class TreatmentController {

    private Clinic clinic;
    private TreatmentEntryView view;

    public TreatmentController(Clinic clinic) {

        this.clinic = clinic;
        view = new TreatmentEntryView();

        view.getSaveButton().addActionListener(e -> saveTreatment());

        view.getBackButton().addActionListener(e -> {
            view.dispose();
        });

        view.setVisible(true);
    }

    private void saveTreatment() {

        String treatmentId = view.getTreatmentId();
        String patientId = view.getPatientId();
        String doctorId = view.getDoctorId();
        String details = view.getTreatmentDetails();
        String date = view.getDate();

        if (treatmentId.isEmpty() || patientId.isEmpty()
                || doctorId.isEmpty() || details.isEmpty() || date.isEmpty()) {

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

        Treatment treatment = new Treatment(
                treatmentId,
                patient,
                doctor,
                details,
                date
        );

        clinic.addTreatment(treatment);

        JOptionPane.showMessageDialog(
                view,
                "Treatment saved successfully."
        );

        view.clearFields();
    }
}
