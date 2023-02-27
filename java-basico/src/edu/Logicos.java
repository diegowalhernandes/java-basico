package edu;

public class Logicos {
    /*Lógicos
     * Os operadores lógicos representam o recurso que nos prmite criar
     * expressões lógicas maiores a partir da junção de duas ou mais expressões.
     * && Operador Lógico "E"
     * || Operador Lógico "OU"
    */
    public static void main(String[] args){
        boolean condicao1=true;

        boolean condicao2=false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("As duas condições são verdadeiras");
        }

        System.out.println("fim");
    }

}