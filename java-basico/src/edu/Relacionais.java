package edu;

public class Relacionais {
    /*Relacionais
     * Os operadores relaconais avaliam a relação ente duas variáveis ou expressões.
     * Neste caso, mais precisamente, definem se o operando à esquerda é igual, diferente, 
     * menor, menor ou igual, maior ou maior ou igual ao da direita, retornando um valor booleano como resultado.
     * 
     * == quando desejamos verificar se uma variável é IGUAL A outa.
     * != Quando desejamos verificar se uma variável é DIFERENTE da outra.
     * > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
     * >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra
     * < Quando desejamos verificar se uma variável é MENOR QUE a outra.
     * Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra
    */
    public static void main(String[] args) {
        String nomeUm = "DIEGO";
        String nomeDois = new String("DIEGO");

        System.out.println(nomeUm.equals(nomeDois)); //Usar equals para objetos
    

        System.out.println(nomeUm == nomeDois);


        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("numero 1 é igual a numero 2? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numero 1 é diferente que numero 2 " + simNao);

        simNao = numero1 > numero2;
        System.out.println("Numero 1 é maior que numero 2? " + simNao);

        simNao = numero1 < numero2;
        System.out.println("Numero 1 é menor que numero 2? " + simNao);


    }
}
