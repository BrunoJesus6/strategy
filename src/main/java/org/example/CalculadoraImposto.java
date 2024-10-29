package org.example;

public class Calculadora {

    private Imposto estrategiaImposto;

    public Calculadora(Imposto estrategiaImposto) {
        this.estrategiaImposto = estrategiaImposto;
    }

    public float calcularImposto(float valorBase) {
        return estrategiaImposto.calcular(valorBase);
    }
}
