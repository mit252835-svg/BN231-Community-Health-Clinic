package data;

import java.io.*;
import java.util.ArrayList;

import model.Patient;

public class FileManager {

    public static void savePatients(ArrayList<Patient> patients) {

        try {

            FileWriter file = new FileWriter("patients.txt");
            PrintWriter writer = new PrintWriter(file);

            for (Patient patient : patients) {

                writer.println(
                        patient.getPatientId() + "|"
                        + patient.getName() + "|"
                        + patient.getPhone() + "|"
                        + patient.getAddress()
                );
            }

            writer.close();

        } catch (IOException e) {

            System.out.println("Error saving patients.");
        }
    }

    public static ArrayList<Patient> loadPatients() {

        ArrayList<Patient> patients = new ArrayList<>();

        try {

            File file = new File("patients.txt");

            if (!file.exists()) {
                return patients;
            }

            BufferedReader reader = new BufferedReader(
                    new FileReader(file)
            );

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split("\\|");

                if (data.length == 4) {

                    Patient patient = new Patient(
                            data[0],
                            data[1],
                            data[2],
                            data[3]
                    );

                    patients.add(patient);
                }
            }

            reader.close();

        } catch (IOException e) {

            System.out.println("Error loading patients.");
        }

        return patients;
    }
}