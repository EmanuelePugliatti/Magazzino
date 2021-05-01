package org.corso.magazzino;

import java.time.LocalDate;

public abstract class Prodotto {

    private String nomeProdotto;
    private String marca;
    private int costoProdotto;
    private LocalDate data;

    public Prodotto() {

    }

    public Prodotto(String nomeProdotto, String marca, int costoProdotto, LocalDate data) {
        this.nomeProdotto = nomeProdotto;
        this.marca = marca;
        this.costoProdotto = costoProdotto;
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    public String getNomeProdotto() {
        return nomeProdotto;
    }

    public String getMarca() {
        return marca;
    }

    public int getCostoProdotto() {
        return costoProdotto;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        result = prime * result + ((nomeProdotto == null) ? 0 : nomeProdotto.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Prodotto other = (Prodotto) obj;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        if (nomeProdotto == null) {
            if (other.nomeProdotto != null)
                return false;
        } else if (!nomeProdotto.equals(other.nomeProdotto))
            return false;
        return true;
    }

}
