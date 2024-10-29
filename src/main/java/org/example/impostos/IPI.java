package org.example.impostos;

import org.example.Imposto;

public class IPI implements Imposto {
    public float calcular(float valorBase) {
        return valorBase * 0.04f;
    }
}
