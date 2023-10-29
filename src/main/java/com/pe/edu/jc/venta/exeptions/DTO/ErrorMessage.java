package com.pe.edu.jc.venta.exeptions.DTO;

import lombok.*;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {

    private HttpStatus status;
    private String message;
}
