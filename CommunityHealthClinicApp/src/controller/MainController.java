package controller;

import data.FileManager;

import model.Clinic;
import view.*;

public class MainController {

    private Clinic clinic;
    private MainMenuView mainMenu;

    public MainController() {

        clinic = new Clinic();
        clinic.getPatients().addAll(FileManager.loadPatients());
        System.out.println("Loaded patients: " + clinic.getPatients().size());
        mainMenu = new MainMenuView();

        mainMenu.getPatientButton().addActionListener(e -> {
            new PatientController(clinic);
        });

        mainMenu.getDoctorButton().addActionListener(e -> {
            new DoctorController(clinic);
        });

        mainMenu.getAppointmentButton().addActionListener(e -> {
            new AppointmentController(clinic);
        });

        mainMenu.getTreatmentButton().addActionListener(e -> {
            new TreatmentController(clinic);
        });

        mainMenu.getReportsButton().addActionListener(e -> {
            new ReportsController(clinic);
        });

        mainMenu.setVisible(true);
    }

    public static void main(String[] args) {
        new MainController();
    }
}
