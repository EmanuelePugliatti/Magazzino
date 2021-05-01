package org.corso.magazzino.exceptions;

public class ErroreScaricoProdottoNonEsistenteException extends Exception {

    public ErroreScaricoProdottoNonEsistenteException() {
        super("errore prodotto da scaricare non esistente");
    }

}
