package tech.ada.locadoraVeiculos.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import tech.ada.locadoraVeiculos.exceptions.ObjetoNaoEncontradoException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ObjetoNaoEncontradoException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String objetoNaoEncontradoHandler(ObjetoNaoEncontradoException excecao){
            return excecao.getMessage();
        }

}
