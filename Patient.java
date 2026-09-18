package model;

public class Patient {

    private String patientId;
    private String name;
    private String phone;
    private String address;

    public Patient(String patientId, String name, String phone, String address) {
        this.patientId = patientId;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}