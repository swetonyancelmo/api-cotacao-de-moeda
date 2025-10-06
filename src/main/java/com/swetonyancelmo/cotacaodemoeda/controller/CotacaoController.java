package com.swetonyancelmo.cotacaodemoeda.controller;

import com.swetonyancelmo.cotacaodemoeda.services.CotacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CotacaoController {

    @Autowired
    private CotacaoService cotacaoService;

    @GetMapping("/cotacao/dolar")
    public double dolarAtual(){
        return cotacaoService.getCotacaoDolar();
    }

    @GetMapping("/cotacao/euro")
    public double euroAtual(){
        return cotacaoService.getCotacaoEuro();
    }

    @GetMapping("/converter/dolar")
    public double converterDolar(@RequestParam("valor") double valorEmReal){
        return cotacaoService.converterRealParaDolar(valorEmReal);
    }

    @GetMapping("/converter/euro")
    public double converterEuro(@RequestParam("valor") double valorEmReal){
        return cotacaoService.converterRealParaEuro(valorEmReal);
    }
}
