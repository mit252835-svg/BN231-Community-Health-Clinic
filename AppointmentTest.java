package model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppointmentTest {

    @Test
    public void testAppointmentId() {

        Patient patient = new Patient(
                "P001",
                "Mitchell",
                "041122334",
                "Chatswood"
        );

        Doctor doctor = new Doctor(
                "D001",
                "Twinkle",
                "General Practice",
                "0412345678"
        );

        Appointment appointment = new Appointment(
                "A001",
                patient,
                doctor,
                "2026-09-20",
                "10:00 AM"
        );

        assertEquals(
                "A001",
                appointment.getAppointmentId()
        );
    }


    @Test
    public void testAppointmentPatient() {

        Patient patient = new Patient(
                "P001",
                "Mitchell",
                "041122334",
                "Chatswood"
        );

        Doctor doctor = new Doctor(
                "D001",
                "Twinkle",
                "General Practice",
                "0412345678"
        );

        Appointment appointment = new Appointment(
                "A001",
                patient,
                doctor,
                "2026-09-20",
                "10:00 AM"
        );

        assertEquals(
                "Mitchell",
                appointment.getPatient().getName()
        );
    }
}