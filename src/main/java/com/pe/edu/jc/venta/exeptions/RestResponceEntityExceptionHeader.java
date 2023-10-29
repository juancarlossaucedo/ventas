package com.pe.edu.jc.venta.exeptions;

import com.pe.edu.jc.venta.exeptions.DTO.ErrorMessage;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class RestResponceEntityExceptionHeader extends ResponseEntityExceptionHandler {
    @ExceptionHandler(DetalleNoFoundExceptions.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorMessage> detalleNoFoundExecptions(DetalleNoFoundExceptions exceptions){
        ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND,exceptions.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
    }


    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        Map<String, Object> erros= new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error->{
            erros.put(error.getField(), error.getDefaultMessage());
        });
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erros);

    }

}
