package com.pms.patientservice.exception;

public class EmailExistsException extends RuntimeException
{
    public EmailExistsException(String message) {
        super(message);
    }
}
