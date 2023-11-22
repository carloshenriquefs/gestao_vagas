package br.com.gestao_vagas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeiroTeste {

    @Test
    public void deve_retornar_soma_entre_dois_numeros() {
        var result = calcular(2, 3);
        Assertions.assertEquals(result, 5);
    }

    @Test
    public void nao_deve_retornar_soma_entre_dois_numeros() {
        var result = calcular(4 ,4);
        Assertions.assertNotEquals(result, 9);
    }

    public static Integer calcular(Integer num1, Integer num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        var result = calcular(4 , 4);
        System.out.println(result);
    }
}
