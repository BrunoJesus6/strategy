package org.example;

public class CalculadoraImposto {

    private Imposto estrategiaImposto;

    public CalculadoraImposto(Imposto estrategiaImposto) {
        this.estrategiaImposto = estrategiaImposto;
    }

    public float calcular(float valorBase) {
        return estrategiaImposto.calcular(valorBase);
    }
}
