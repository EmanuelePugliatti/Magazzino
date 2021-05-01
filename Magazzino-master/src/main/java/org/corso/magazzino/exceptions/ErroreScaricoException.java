package org.corso.magazzino.exceptions;

public class ErroreScaricoException extends Exception {

    public ErroreScaricoException() {
        super("errore il prodotto da scaricare è null");
    }

}
