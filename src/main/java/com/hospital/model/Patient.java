package com.hospital.model;

/**
 * Represents a patient. Extends the abstract Person class.
 */
public class Patient extends Person {

    private String dateOfBirth; // stored as ISO string yyyy-MM-dd for simplicity
    private String address;
    private String diagnosis;

    public Patient(int id, String name, String phone, String dateOfBirth, String address, String diagnosis) {
        super(id, name, phone);
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.diagnosis = diagnosis;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String describe() {
        return String.format("Patient #%d | %-20s | Phone: %-12s | DOB: %-10s | Diagnosis: %s",
                getId(), getName(), getPhone(), dateOfBirth, diagnosis == null || diagnosis.isBlank() ? "N/A" : diagnosis);
    }
}
