//package com.qwfys.sample.spring.data.jdbc.common.validater;
//
//import jakarta.servlet.http.HttpServletResponse;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.FieldError;
//import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//@Slf4j
//@ControllerAdvice
//public class GlobalExceptionHandler {
//    @ResponseBody
//    @ExceptionHandler(Throwable.class)
//    public ResponseEntity<?> exceptionHandler(Throwable e, HttpServletResponse response) {
//        log.error("System error", e);
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("服务器出了点小差，请联系管理员");
//    }
//
//    @ResponseBody
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResponseEntity<?> paramsExceptionHandler(MethodArgumentNotValidException e, HttpServletResponse response) {
//        List<FieldError> fieldErrors = e.getFieldErrors();
//        Map<String, String> stringMap = fieldErrors.stream().collect(Collectors.toMap(FieldError::getField, FieldError::getDefaultMessage));
//        log.warn("Invalid request parameters: {}", e.getMessage());
//        return ResponseEntity.badRequest().body(stringMap);
//    }
//}
