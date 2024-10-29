package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveAplicarICMS() {
        Produto produto = new Produto();
        produto.aplicarICMS(1000.0f);
        assertEquals(1180.0f, produto.getValorFinal(), 0.01f);
    }

    @Test
    void deveAplicarIPI() {
        Produto produto = new Produto();
        produto.aplicarIPI(1000.0f);
        assertEquals(1040.0f, produto.getValorFinal(), 0.01f);
    }

    @Test
    void deveAplicarISS() {
        Produto produto = new Produto();
        produto.aplicarISS(1000.0f);
        assertEquals(1060.0f, produto.getValorFinal(), 0.01f);
    }
}