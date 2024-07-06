import java.util.Random;
import java.util.Scanner;

public class NivelTinta {

    public static void main(String[] args) {
        double nivelTinta = 100;

        while (nivelTinta > 5) {

            Random random = new Random();
            double numero = random.nextDouble();

            nivelTinta = nivelTinta - numero;

            System.out.println(nivelTinta);
            System.out.println(numero);

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
                }
            } else {
                System.out.println("Caneta está sem Tinta. Não escreve mais.");
            }
        }
    }
}