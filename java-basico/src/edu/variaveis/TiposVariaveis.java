package edu.variaveis;

public class TiposVariaveis {

    public static void main(String[] args) throws Exception {
        byte idade = 123;
        short ano = 2021;
        int cep = 2107033; // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // tipo long precisa terminar com um L l 
        float pi = 3.14F; // tipo float precisa terminar com um f ou F
        double salario = 1275.33;

        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 1;

        numero = 2;

        System.out.print(ano);
        System.out.print(idade);
        //valor_nunca_podera_mudar

        final double VALOR_DE_PI = 3.14;

        
        System.out.print(VALOR_DE_PI);
    }
}
