package org.corso.magazzino;

import java.time.LocalDate;

public class ProdottoAlimentare extends Prodotto {

    public ProdottoAlimentare(String nomeProdotto, String marca, int costoProdotto, LocalDate data) {
        super(nomeProdotto, marca, costoProdotto, data);
    }
}
