package com.bogdanatodo.ppmtool.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler
    public final ResponseEntity<Object> handlerProjectIdException(ProjectIdExeption ex, WebRequest request) {
        ProjectIdExeption exeptionResponse = new ProjectIdExeption(ex.getMessage());
        return new ResponseEntity(exeptionResponse, HttpStatus.BAD_REQUEST);
    }
}
