package org.example.impostos;

import org.example.Imposto;

public class ISS implements Imposto {
    public float calcular(float valorBase) {
        return valorBase * 0.06f;
    }
}
