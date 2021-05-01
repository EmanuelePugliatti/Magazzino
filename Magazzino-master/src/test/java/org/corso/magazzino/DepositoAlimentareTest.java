package org.corso.magazzino;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.corso.magazzino.exceptions.ErroreCapacitaMassimasuperta;
import org.corso.magazzino.exceptions.ErroreCaricoException;
import org.corso.magazzino.exceptions.ErroreScaricoProdottoNegativoException;
import org.corso.magazzino.exceptions.ErroreScaricoProdottoNonEsistenteException;
import org.junit.Before;
import org.junit.Test;

public class DepositoAlimentareTest {

    private Prodotto prodottoAlimentareDiTest;
    private DepositoAlimentare depositoAlimentareDiTest;

    @Before
    public void setUp(){
        depositoAlimentareDiTest = new DepositoAlimentare(Magazzino.DEPOSITO_ALIMENTARI, 20);
        prodottoAlimentareDiTest = new ProdottoAlimentare("Gelato", "Algida", 10, LocalDate.of(2021, 04, 28));

    }

    @Test(expected = ErroreScaricoProdottoNonEsistenteException.class)
    public void eccezioneSeScaricoProdottoNonInDeposito() throws ErroreScaricoProdottoNonEsistenteException , ErroreCapacitaMassimasuperta{
        try {
            depositoAlimentareDiTest.scaricoDeposito(prodottoAlimentareDiTest, 5);
        } catch (ErroreScaricoProdottoNegativoException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @Test(expected = ErroreCaricoException.class)
    public void erorreSeQuantitaNegativa_caricoDeposito()throws ErroreCaricoException, ErroreCapacitaMassimasuperta{
        depositoAlimentareDiTest.caricoDeposito(prodottoAlimentareDiTest, -5);
       // assertEquals(prodottoAlimentareDiTest, actual);
    }

    @Test(expected = ErroreCaricoException.class)
    public void erorreSeQuantitaNulla_caricoDeposito()throws ErroreCaricoException , ErroreCapacitaMassimasuperta{
        depositoAlimentareDiTest.caricoDeposito(null, 5);
        
    }
    @Test(expected = ErroreCapacitaMassimasuperta.class)
    public void verificaSeProdottoCaricatoNelDeposito_caricoDeposito()throws ErroreCaricoException , ErroreCapacitaMassimasuperta{
        depositoAlimentareDiTest.caricoDeposito(prodottoAlimentareDiTest, 25);
    
    }
}
