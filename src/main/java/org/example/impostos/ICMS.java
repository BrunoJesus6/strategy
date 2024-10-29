package org.example.impostos;

import org.example.Imposto;

public class ICMS implements Imposto {
    public float calcular(float valorBase) {
        return valorBase * 0.18f;
    }
}
