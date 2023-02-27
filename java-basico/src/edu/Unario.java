package edu;

public class Unario {
    /*Unários
     * Esses opeadores são aplicados juntamente com um outro operador
     * aritmético. Eles realizam alguns trabalhos básicos como incrementar,
     * decrementar, inverter valores numéricos e booleanos.
     * (+) Operador unário de valor positivo - números são positivos sem esse
     * operador explicitamente;
     * (-) Operador unário de valor negativo - nega um número ou expressão aritmética;
     * (++) Operador unário de incremento de valor - incrementar o valor em 1 unidade;
     * (--) Operador unário de decremento de valor - decrementa o valor em 1;
     * (!) Operador unário lógico de negação - nega o valor de uma expressão boolena;
    */
    public static void main(String[] args){
    int numero = 5;
    
        numero = numero++;
        numero = numero--;

        System.out.println(numero);
}
}