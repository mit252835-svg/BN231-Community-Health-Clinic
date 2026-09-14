package model;

public class Doctor { private String doctorId;
private String name;
private String specialty;
private String phone;

public Doctor(String doctorId, String name, String specialty, String phone) {
    this.doctorId = doctorId;
    this.name = name;
    this.specialty = specialty;
    this.phone = phone;
}

public String getDoctorId() {
    return doctorId;
}

public void setDoctorId(String doctorId) {
    this.doctorId = doctorId;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getSpecialty() {
    return specialty;
}

public void setSpecialty(String specialty) {
    this.specialty = specialty;
}

public String getPhone() {
    return phone;
}

public void setPhone(String phone) {
    this.phone = phone;
}
}