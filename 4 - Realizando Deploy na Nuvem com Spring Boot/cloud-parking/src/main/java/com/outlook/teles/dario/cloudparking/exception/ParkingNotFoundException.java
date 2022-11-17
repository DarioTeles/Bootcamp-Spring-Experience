package com.outlook.teles.dario.cloudparking.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ParkingNotFoundException extends RuntimeException {
    public ParkingNotFoundException(String id){
        super("Parking not foun with id " + id);
    }
}
