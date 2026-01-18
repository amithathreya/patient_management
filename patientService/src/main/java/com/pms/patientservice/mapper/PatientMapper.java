package com.pms.patientservice.mapper;

import com.pms.patientservice.dto.PatientRequestDTO;
import com.pms.patientservice.dto.PatientResponseDTO;
import com.pms.patientservice.model.Patient;

public class PatientMapper {
    public static PatientResponseDTO toDTO(Patient patient) {
        PatientResponseDTO dto = new PatientResponseDTO();
        dto.setId(patient.getId().toString());
        dto.setName(patient.getName());
        dto.setEmail(patient.getEmail());
        dto.setDOB(patient.getDOB().toString());
        return dto;
    }
    public static Patient toRequestDTO(PatientRequestDTO patientRequestDTO) {
        Patient patient = new Patient();
        patient.setName(patientRequestDTO.getName());
        patient.setEmail(patientRequestDTO.getEmail());
        patient.setAddress(patientRequestDTO.getAddress());
        patient.setDOB(java.time.LocalDate.parse(patientRequestDTO.getDOB()));
        patient.setRegisterDate(java.time.LocalDate.parse(patientRequestDTO.getRegisterDate()));
        return patient;
    }
}
