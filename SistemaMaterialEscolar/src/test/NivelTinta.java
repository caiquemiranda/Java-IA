package test;
import java.util.Random;
import java.util.Scanner;

public class NivelTinta {

    public static void main(String[] args) {
        double nivelTinta = 100;

        while (nivelTinta > 1) {

            Random random = new Random();
            int numero = random.nextInt(5);

            nivelTinta = nivelTinta - numero;

            System.out.println(nivelTinta);

            if (nivelTinta <= 50 && nivelTinta > 25) {
                System.out.println("Caneta está com um nível de tinta médio.");

            } else if (nivelTinta <= 25 && nivelTinta >= 5) {
                System.out.println("Caneta está com um nível de tinta baixo. carrege a caneta");
                boolean carregar = true;

                while (carregar) {
                    System.out.println("Quer carregar a caneta agora?(s/n)");
                    Scanner scanner = new Scanner(System.in);
                    String resposta = scanner.nextLine();

                    if (resposta.equalsIgnoreCase("s")) {
                        nivelTinta = 100;
                        carregar = false;
                        System.out.println("Caneta carregada.");

                    } else if (resposta.equalsIgnoreCase("n")) {
                        System.out.println("Caneta não carregada.");
                        carregar = false;
                        break;
                    }
                    scanner.close();
                }
            } else if (nivelTinta <= 5) {
                System.out.println("Caneta está sem Tinta. Não escreve mais.");
                break;
            }
        }
    }

}