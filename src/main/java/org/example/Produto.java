package org.example;

import org.example.impostos.ICMS;
import org.example.impostos.IPI;
import org.example.impostos.ISS;

public class Produto {
    private float valorFinal;

    public float getValorFinal() {
        return valorFinal;
    }

    public void aplicarICMS(float valorBase) {
        CalculadoraImposto calculadora = new CalculadoraImposto(new ICMS());
        this.valorFinal = valorBase + calculadora.calcular(valorBase);
    }

    public void aplicarIPI(float valorBase) {
        CalculadoraImposto calculadora = new CalculadoraImposto(new IPI());
        this.valorFinal = valorBase + calculadora.calcular(valorBase);
    }

    public void aplicarISS(float valorBase) {
        CalculadoraImposto calculadora = new CalculadoraImposto(new ISS());
        this.valorFinal = valorBase + calculadora.calcular(valorBase);
    }
}