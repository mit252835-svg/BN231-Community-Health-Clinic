package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class ClinicTest {

    @Test
    public void testAddPatient() {

        Clinic clinic = new Clinic();

        Patient patient = new Patient(
                "P001",
                "Mitchell",
                "041122334",
                "Chatswood"
        );

        clinic.addPatient(patient);

        assertEquals(1, clinic.getPatients().size());
    }


    @Test
    public void testFindPatientById() {

        Clinic clinic = new Clinic();

        Patient patient = new Patient(
                "P001",
                "Mitchell",
                "041122334",
                "Chatswood"
        );

        clinic.addPatient(patient);

        Patient foundPatient =
                clinic.findPatientById("P001");

        assertNotNull(foundPatient);

        assertEquals(
                "Mitchell",
                foundPatient.getName()
        );
    }
}