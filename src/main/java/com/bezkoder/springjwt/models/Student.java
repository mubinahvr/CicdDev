package com.bezkoder.springjwt.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;


@Entity
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    @Size(max = 30)
    private String firstname;

    @NotBlank
    @Size(max = 30)
    private String lastname;

    private String fathername;
    private String mothername;

    private String email;
    private String dob;

    private String contact;

    private String gender;
    private String religion;
    private String caste;
    private String adhaarNo;
    private String address;
    private String satsid;
    private String school;
    private String section;

    public Student() {
    }


    public Student(String firstname, String lastname, String fathername, String mothername, String email, String dob, String contact, String gender, String religion, String caste, String adhaarNo, String address, String satsid, String school, String section) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.fathername = fathername;
        this.mothername = mothername;
        this.email = email;
        this.dob = dob;
        this.contact = contact;
        this.gender = gender;
        this.religion = religion;
        this.caste = caste;
        this.adhaarNo = adhaarNo;
        this.address = address;
        this.satsid = satsid;
        this.school = school;
        this.section = section;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
