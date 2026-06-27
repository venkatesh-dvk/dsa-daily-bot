package com.dsa.bot.exception;

import com.dsa.bot.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.MethodArgumentNotValidException;
import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ErrorResponse handleValidationException(MethodArgumentNotValidException ex) {

	    List<String> errors = ex.getBindingResult()
	            .getFieldErrors()
	            .stream()
	            .map(fieldError -> fieldError.getDefaultMessage())
	            .toList();

	    return new ErrorResponse(
	            400,
	            "Validation Failed",
	            errors
	    );
	}

	@ExceptionHandler(Exception.class)
	public ErrorResponse handleException(Exception ex) {

	    return new ErrorResponse(
	            500,
	            "Something went wrong",
	            List.of(ex.getMessage())
	    );
	}
}