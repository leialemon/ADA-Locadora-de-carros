package tech.ada.locadoraVeiculos.exceptions;

public class ObjetoNaoEncontradoException extends RuntimeException{
    public ObjetoNaoEncontradoException(String message, String placa){
        super(String.format(message+placa));
    }
}
