package org.corso.magazzino;

import java.time.LocalDate;

public class ProdottoNonAlimentare extends Prodotto {

    public ProdottoNonAlimentare(String nomeProdotto, String marca, int costoProdotto, LocalDate data) {
        super(nomeProdotto, marca, costoProdotto, data);
    }
}
