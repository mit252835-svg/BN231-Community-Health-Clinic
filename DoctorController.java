package controller;
import data.FileManager;

import javax.swing.JOptionPane;

import model.Clinic;
import model.Doctor;
import view.RegisterDoctorView;

public class DoctorController {

    private Clinic clinic;
    private RegisterDoctorView view;

    public DoctorController(Clinic clinic) {

        this.clinic = clinic;
        view = new RegisterDoctorView();

        view.getSaveButton().addActionListener(e -> saveDoctor());

        view.getBackButton().addActionListener(e -> {
            view.dispose();
        });

        view.setVisible(true);
    }

    private void saveDoctor() {

        String id = view.getDoctorId();
        String name = view.getDoctorName();
        String specialty = view.getSpecialty();
        String phone = view.getPhone();

        if (id.isEmpty() || name.isEmpty() || specialty.isEmpty() || phone.isEmpty()) {

            JOptionPane.showMessageDialog(
                    view,
                    "Please fill in all fields."
            );

            return;
        }

        Doctor doctor = new Doctor(id, name, specialty, phone);

        clinic.addDoctor(doctor);

        FileManager.saveDoctors(clinic.getDoctors());

        JOptionPane.showMessageDialog(
                view,
                "Doctor registered successfully."
        );

        view.clearFields();
    }
}