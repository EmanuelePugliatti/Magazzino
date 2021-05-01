package org.corso.magazzino.exceptions;

public class ErroreScaricoProdottoNegativoException extends Exception {

    public ErroreScaricoProdottoNegativoException() {
        super("errore prodotto da scaricare negativo");
    }

}
