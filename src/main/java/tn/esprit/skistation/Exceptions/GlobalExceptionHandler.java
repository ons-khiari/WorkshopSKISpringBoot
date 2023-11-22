package tn.esprit.skistation.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

     @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
     @ExceptionHandler(IllegalArgumentException.class)
     public Map<String, String> handleNotFoundException(IllegalArgumentException exception) {
     Map<String, String> map=new HashMap<>();
     map.put("error",exception.getMessage());
      return map;
}

}
