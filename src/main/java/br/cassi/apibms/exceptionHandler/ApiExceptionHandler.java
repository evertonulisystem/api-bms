package br.cassi.apibms.exceptionHandler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        List<ErroEncontrado.Campo> campos = new ArrayList<>();
                for(ObjectError error : ex.getBindingResult().getAllErrors()){
                   String nome =((FieldError) error).getField();
                   String mensagem = error.getDefaultMessage();
                    campos.add((new ErroEncontrado.Campo(nome,mensagem)));
                }
        ErroEncontrado erroEncontrado =new ErroEncontrado();
        erroEncontrado.setStatus(status.value());
        erroEncontrado.setDtHora(LocalDateTime.now());
        erroEncontrado.setTitulo("Um ou mais campos estão inváldos. Envie novamente");
        erroEncontrado.setCampos(null);
        return handleExceptionInternal(ex, erroEncontrado, headers, status, request);
    }
//

}
