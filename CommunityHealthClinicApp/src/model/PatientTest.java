package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PatientTest {

    @Test
    public void testPatientName() {

        Patient patient = new Patient(
                "P001",
                "Mitchell",
                "041122334",
                "Chatswood"
        );

        assertEquals("Mitchell", patient.getName());
    }

    @Test
    public void testPatientId() {

        Patient patient = new Patient(
                "P001",
                "Mitchell",
                "041122334",
                "Chatswood"
        );

        assertEquals("P001", patient.getPatientId());
    }
}