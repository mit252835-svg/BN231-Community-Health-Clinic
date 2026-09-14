package model;

import java.util.ArrayList;

public class Clinic {

    private ArrayList<Patient> patients;
    private ArrayList<Doctor> doctors;
    private ArrayList<Appointment> appointments;
    private ArrayList<Treatment> treatments;

    public Clinic() {
        patients = new ArrayList<>();
        doctors = new ArrayList<>();
        appointments = new ArrayList<>();
        treatments = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public void addTreatment(Treatment treatment) {
        treatments.add(treatment);
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public ArrayList<Treatment> getTreatments() {
        return treatments;
    }

    public Patient findPatientById(String patientId) {

        for (Patient patient : patients) {
            if (patient.getPatientId().equalsIgnoreCase(patientId)) {
                return patient;
            }
        }

        return null;
    }

    public Doctor findDoctorById(String doctorId) {

        for (Doctor doctor : doctors) {
            if (doctor.getDoctorId().equalsIgnoreCase(doctorId)) {
                return doctor;
            }
        }

        return null;
    }
    public void sortAppointmentsByDate() {

        for (int i = 0; i < appointments.size() - 1; i++) {

            for (int j = 0; j < appointments.size() - 1 - i; j++) {

                Appointment first = appointments.get(j);
                Appointment second = appointments.get(j + 1);

                if (first.getDate().compareTo(second.getDate()) > 0) {

                    appointments.set(j, second);
                    appointments.set(j + 1, first);
                }
            }
        }
    }

    }