package ie.atu.labexam;
import org.springframework.*;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import  java.util.Map;

@RestController
public class Handlers {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    //public ResponseEntity<employeeInfo<s<<String, String>>display(MethodArgumentNotValidException ex) {
        public List<ErrorEmploy> handleValidationExceptions(MethodArgumentNotValidException ex){

    }

}
