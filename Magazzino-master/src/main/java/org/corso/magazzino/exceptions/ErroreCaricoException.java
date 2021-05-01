package org.corso.magazzino.exceptions;

public class ErroreCaricoException extends Exception {

    public ErroreCaricoException() {
        super("errore il prodotto da caricare è null");
    }

}
