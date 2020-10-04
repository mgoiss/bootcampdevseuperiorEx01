package com.devsuperiorcap1.bootcampex01.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.devsuperiorcap1.bootcampex01.services.exceptions.DatabaseException;
import com.devsuperiorcap1.bootcampex01.services.exceptions.ResourceNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> entityNotFound(ResourceNotFoundException e, HttpServletRequest request) {
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError erro = new StandardError();
		erro.setTimestamp(Instant.now());
		erro.setStatus(status.value());
		erro.setError("Recurso Não Encontrado");
		erro.setMessage(e.getMessage());
		erro.setPath(request.getRequestURI());
		return ResponseEntity.status(status).body(erro);
	}
	
	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<StandardError> entityNotFound(DatabaseException e, HttpServletRequest request) {
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandardError erro = new StandardError();
		erro.setTimestamp(Instant.now());
		erro.setStatus(status.value());
		erro.setError("Recurso Não Encontrado");
		erro.setMessage(e.getMessage());
		erro.setPath(request.getRequestURI());
		return ResponseEntity.status(status).body(erro);
	}
}
