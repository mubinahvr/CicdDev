package com.bezkoder.springjwt.payload.request;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class StudentRequest {
    @NotBlank(message = "First Name should not be null")
    @Size(max = 30, message = "First Name should be at most 30 characters long")
    private String firstname;

    @NotBlank(message = "Last Name should not be null")
    @Size(max = 30, message = "Last Name should be at most 30 characters long")
    private String lastname;

    @NotBlank(message = "Father Name should not be null")
    private String fathername;

    @NotBlank(message = "Mother Name should not be null")
    private String mothername;

    @Email(message = "Invalid Email Address")
    private String email;

    @NotBlank(message = "DOB should not be null")
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "Invalid Date of Birth. Please use the format YYYY-MM-DD")
    private String dob;

    @NotNull(message = "Contact should not be null")
    @Pattern(regexp = "^(\\+91[\\-\\s]?)?[0]?[789]\\d{9}$", message = "Invalid Mobile Number")
    private String contact;

    @NotBlank(message = "Gender should not be null")
    private String gender;

    @NotBlank(message = "Religion should not be null")
    private String religion;

    @NotBlank(message = "Caste should not be null")
    private String caste;

    @NotNull(message = "Aadhaar Number should not be null")
    @Size(min = 12, max = 12, message = "Aadhaar Number should be exactly 12 digits long")
    private String adhaarNo;

    @NotBlank(message = "Address should not be null")
    @Size(max = 100, message = "Address should not be more than 100 characters long")
    private String address;

    @NotBlank(message = "SatsId should not be null")
    @Size(max = 10, message = "SatsId should be at most 10 characters long")
    private String satsid;

    @NotBlank(message = "School should not be null")
    @Size(max = 100, message = "School should not be more than 100 characters long")
    private String school;

    @NotBlank(message = "Section should not be null")
    private String section;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getMothername() {
        return mothername;
    }

    public void setMothername(String mothername) {
        this.mothername = mothername;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        this.caste = caste;
    }

    public String getAdhaarNo() {
        return adhaarNo;
    }

    public void setAdhaarNo(String adhaarNo) {
        this.adhaarNo = adhaarNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSatsid() {
        return satsid;
    }

    public void setSatsid(String satsid) {
        this.satsid = satsid;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
