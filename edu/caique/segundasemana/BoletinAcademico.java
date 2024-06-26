package edu.caique.segundasemana;

public class BoletinAcademico{
    public static void main(String[] args) {
        int mediaFinal = 6;

        if (mediaFinal<6) {
            System.out.println("REPROVADO");
        }

        else if (mediaFinal==6){
            System.out.println("PROVA DE MINERVA");
        }

        else {
            System.out.println("APROVADO");
        }

    }
}