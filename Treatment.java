package model;

public class Treatment {

    private String treatmentId;
    private Patient patient;
    private Doctor doctor;
    private String treatmentDetails;
    private String date;

    public Treatment(String treatmentId, Patient patient, Doctor doctor, String treatmentDetails, String date) {
        this.treatmentId = treatmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.treatmentDetails = treatmentDetails;
        this.date = date;
    }

    public String getTreatmentId() {
        return treatmentId;
    }

    public void setTreatmentId(String treatmentId) {
        this.treatmentId = treatmentId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getTreatmentDetails() {
        return treatmentDetails;
    }

    public void setTreatmentDetails(String treatmentDetails) {
        this.treatmentDetails = treatmentDetails;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}