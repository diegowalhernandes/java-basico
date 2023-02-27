package edu;

public class Ternario {
    /*
     * Ternário
     * O operador de Condição Ternária é uma forma resumida para redefinir uma condição 
     * e escolher por um dentre dois valores. Você deve pensar numa condição ternária como 
     * se fosse uma condição IF normal, porém, de uma forma em que a sua estrutura estará escrita numa única linha.
     * 
     * O operador ternário é representado pelos símbolos ?: utilizados na seguinte estrutura de sintaxe:
     * 
     * <Expressão COndicional> ? <Caso condição seja true> : <caso condição seja false>
    */
    public static void main(String [] args) {
        int a, b;

        a = 5;
        b = 5;

        String resultado = a==b ? "verdadeiro" : "falso"; 

        System.out.println(resultado);

        a = 6;
        b = 4;

        String result = a==b ? "verdadeiro" : "falso";

        System.out.println(result);

    }
    
}
