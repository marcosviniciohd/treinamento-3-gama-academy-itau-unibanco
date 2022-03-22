package br.com.marcosviniciohd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    private Calculadora c;

    @BeforeEach
    public void setup(){
        c = new Calculadora();
    }

    @Test
    public void deveRetornarASomaDosValores(){
        double resultado = c.somar(10, 20);
        assertEquals(30, resultado);
    }

    @Test
    public void deveRetornarASubstracaoDosNumeros(){
        double resultado = c.subtrair(20, 10);
        assertEquals(10, resultado);
    }

    @Test
    public void deveRetornarAMultiplicacaoDosNumeros(){
        double resultado = c.multiplicar(10, 10);
        assertEquals(100, resultado);
    }

    @Test
    public void deveRetornarADivisaoQuandoDenominadorDiferenteDeZero(){
        double resultado = c.dividir(100, 10);
        assertEquals(10, resultado);
    }

    @Test
    public void deveRetornarNegativoQuandoDenominadorIgualDeZero(){
        double resultado = c.dividir1(20, 0);
        assertEquals(-1, resultado);
    }

   

  

}
