package com.pms.patientservice.dto;

import com.pms.patientservice.dto.validators.CreatepatientValidationGroup;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.SQLInsert;


public class PatientRequestDTO {

    @NotBlank
    @Size(max = 100)
    private String name;

    @NotBlank(message = "email is required")
    @Email(message = "valid email is required")
    private String email;

    @NotBlank(message = "address is required")
    private String address;

    @NotBlank(message = "date of birth is required")
    private String DOB;

    @NotBlank(groups = CreatepatientValidationGroup.class, message = "register date is required")
    private String RegisterDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getRegisterDate() {
        return RegisterDate;
    }

    public void setRegisterDate(String registerDate) {
        RegisterDate = registerDate;
    }
}
