package com.swetonyancelmo.cotacaodemoeda.services;

import org.springframework.stereotype.Service;

@Service
public class CotacaoService {

    public static final double TAXA_DOLAR = 5.25;
    public static final double TAXA_EURO = 5.60;

    public double getCotacaoDolar(){
        return TAXA_DOLAR;
    }

    public double getCotacaoEuro(){
        return TAXA_EURO;
    }

    public double converterRealParaDolar(double valorEmReal){
        if(valorEmReal < 1) return 0;
        return valorEmReal / TAXA_DOLAR;
    }

    public double converterRealParaEuro(double valorEmReal){
        if(valorEmReal < 1) return 0;
        return valorEmReal / TAXA_EURO;
    }

}
