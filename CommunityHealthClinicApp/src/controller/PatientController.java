package controller;

import data.FileManager;

import javax.swing.JOptionPane;

import model.Clinic;
import model.Patient;
import view.RegisterPatientView;

public class PatientController {

    private Clinic clinic;
    private RegisterPatientView view;

    public PatientController(Clinic clinic) {

        this.clinic = clinic;
        view = new RegisterPatientView();

        view.getSaveButton().addActionListener(e -> savePatient());

        view.getBackButton().addActionListener(e -> {
            view.dispose();
        });

        view.setVisible(true);
    }

    private void savePatient() {

        String id = view.getPatientId();
        String name = view.getPatientName();
        String phone = view.getPhone();
        String address = view.getAddress();

        if (id.isEmpty() || name.isEmpty() || phone.isEmpty() || address.isEmpty()) {

            JOptionPane.showMessageDialog(
                    view,
                    "Please fill in all fields."
            );

            return;
        }

        Patient patient = new Patient(id, name, phone, address);

        clinic.addPatient(patient);
        
        FileManager.savePatients(clinic.getPatients());

        JOptionPane.showMessageDialog(
                view,
                "Patient registered successfully."
        );

        view.clearFields();
    }
}
