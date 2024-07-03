package debugging;

import java.util.Scanner;

class CalculadoraMedias {

    public static void main(String[] args){
        Scanner  scan = new Scanner(System.in);
        String[] alunos = {"Caique", "Maria", "Manuela", "Camila"};

        double media = calculaMediaDoGrupo(alunos, scan);

        System.out.println("A média do grupo é: " + media);
    }

    public static double calculaMediaDoGrupo(String[] alunos, Scanner scanner){

        double somaNotas = 0;
        for(String aluno : alunos){
            System.out.println("Informe a nota do aluno " + aluno);
            double nota = scanner.nextInt();
            somaNotas += nota;
        }
        
        return somaNotas / alunos.length;
    }
}