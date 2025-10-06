package com.swetonyancelmo.cotacaodemoeda.services;

import org.springframework.stereotype.Service;

@Service
public class CotacaoService {

    public double getCotacaoDolar(){
        return 5.25;
    }

    public double getCotacaoEuro(){
        return 5.60;
    }

    public double converterRealParaDolar(double valorEmReal){
        if(valorEmReal < 1) return 0;
        return valorEmReal / getCotacaoDolar();
    }

    public double converterRealParaEuro(double valorEmReal){
        if(valorEmReal < 1) return 0;
        return valorEmReal / getCotacaoEuro();
    }

}
