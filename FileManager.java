package data;
import model.Treatment;
import java.io.*;
import java.util.ArrayList;

import model.Patient;
import model.Doctor;
import model.Appointment;
import model.Clinic;

public class FileManager {

    // -------------------------
    // SAVE PATIENTS
    // -------------------------
    public static void savePatients(ArrayList<Patient> patients) {

        try {
            PrintWriter writer = new PrintWriter("patients.txt");

            for (Patient patient : patients) {

                writer.println(
                        patient.getPatientId() + "|" +
                        patient.getName() + "|" +
                        patient.getPhone() + "|" +
                        patient.getAddress()
                );
            }

            writer.close();

        } catch (IOException e) {
            System.out.println("Could not save patients.");
        }
    }


    // -------------------------
    // LOAD PATIENTS
    // -------------------------
    public static ArrayList<Patient> loadPatients() {

        ArrayList<Patient> patients = new ArrayList<>();

        try {

            File file = new File("patients.txt");

            if (!file.exists()) {
                return patients;
            }

            BufferedReader reader =
                    new BufferedReader(new FileReader(file));

            String line;

            while ((line = reader.readLine()) != null) {

                String[] details = line.split("\\|");

                if (details.length == 4) {

                    Patient patient = new Patient(
                            details[0],
                            details[1],
                            details[2],
                            details[3]
                    );

                    patients.add(patient);
                }
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Could not load patients.");
        }

        return patients;
    }


    // -------------------------
    // SAVE DOCTORS
    // -------------------------
    public static void saveDoctors(ArrayList<Doctor> doctors) {

        try {
            PrintWriter writer = new PrintWriter("doctors.txt");

            for (Doctor doctor : doctors) {

                writer.println(
                        doctor.getDoctorId() + "|" +
                        doctor.getName() + "|" +
                        doctor.getSpecialty() + "|" +
                        doctor.getPhone()
                );
            }

            writer.close();

        } catch (IOException e) {
            System.out.println("Could not save doctors.");
        }
    }


    // -------------------------
    // LOAD DOCTORS
    // -------------------------
    public static ArrayList<Doctor> loadDoctors() {

        ArrayList<Doctor> doctors = new ArrayList<>();

        try {

            File file = new File("doctors.txt");

            if (!file.exists()) {
                return doctors;
            }

            BufferedReader reader =
                    new BufferedReader(new FileReader(file));

            String line;

            while ((line = reader.readLine()) != null) {

                String[] details = line.split("\\|");

                if (details.length == 4) {

                    Doctor doctor = new Doctor(
                            details[0],
                            details[1],
                            details[2],
                            details[3]
                    );

                    doctors.add(doctor);
                }
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Could not load doctors.");
        }

        return doctors;
    }


    // -------------------------
    // SAVE APPOINTMENTS
    // -------------------------
    public static void saveAppointments(
            ArrayList<Appointment> appointments) {

        try {
            PrintWriter writer =
                    new PrintWriter("appointments.txt");

            for (Appointment appointment : appointments) {

                writer.println(
                        appointment.getAppointmentId() + "|" +
                        appointment.getPatient().getPatientId() + "|" +
                        appointment.getDoctor().getDoctorId() + "|" +
                        appointment.getDate() + "|" +
                        appointment.getTime()
                );
            }

            writer.close();

        } catch (IOException e) {
            System.out.println("Could not save appointments.");
        }
    }


    // -------------------------
    // LOAD APPOINTMENTS
    // -------------------------
    public static ArrayList<Appointment> loadAppointments(
            Clinic clinic) {

        ArrayList<Appointment> appointments = new ArrayList<>();

        try {

            File file = new File("appointments.txt");

            if (!file.exists()) {
                return appointments;
            }

            BufferedReader reader =
                    new BufferedReader(new FileReader(file));

            String line;

            while ((line = reader.readLine()) != null) {

                String[] details = line.split("\\|");

                if (details.length == 5) {

                    Patient patient =
                            clinic.findPatientById(details[1]);

                    Doctor doctor =
                            clinic.findDoctorById(details[2]);

                    if (patient != null && doctor != null) {

                        Appointment appointment =
                                new Appointment(
                                        details[0],
                                        patient,
                                        doctor,
                                        details[3],
                                        details[4]
                                );

                        appointments.add(appointment);
                    }
                }
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Could not load appointments.");
        }

        return appointments;
    }
 // -------------------------
 // SAVE TREATMENTS
 // -------------------------
 public static void saveTreatments(
         ArrayList<Treatment> treatments) {

     try {

         PrintWriter writer =
                 new PrintWriter("treatments.txt");

         for (Treatment treatment : treatments) {

             writer.println(
                     treatment.getTreatmentId() + "|" +
                     treatment.getPatient().getPatientId() + "|" +
                     treatment.getDoctor().getDoctorId() + "|" +
                     treatment.getTreatmentDetails() + "|" +
                     treatment.getDate()
             );
         }

         writer.close();

     } catch (IOException e) {

         System.out.println("Could not save treatments.");
     }
 }


 // -------------------------
 // LOAD TREATMENTS
 // -------------------------
 public static ArrayList<Treatment> loadTreatments(
         Clinic clinic) {

     ArrayList<Treatment> treatments = new ArrayList<>();

     try {

         File file = new File("treatments.txt");

         if (!file.exists()) {
             return treatments;
         }

         BufferedReader reader =
                 new BufferedReader(new FileReader(file));

         String line;

         while ((line = reader.readLine()) != null) {

             String[] details = line.split("\\|");

             if (details.length == 5) {

                 Patient patient =
                         clinic.findPatientById(details[1]);

                 Doctor doctor =
                         clinic.findDoctorById(details[2]);

                 if (patient != null && doctor != null) {

                     Treatment treatment =
                             new Treatment(
                                     details[0],
                                     patient,
                                     doctor,
                                     details[3],
                                     details[4]
                             );

                     treatments.add(treatment);
                 }
             }
         }

         reader.close();

     } catch (IOException e) {

         System.out.println("Could not load treatments.");
     }

     return treatments;
 }
}