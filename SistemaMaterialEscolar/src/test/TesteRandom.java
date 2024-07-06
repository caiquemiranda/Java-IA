package test;
import java.util.Random;

public class TesteRandom {
    public static void main(String[] args) {
        double nivelTinta = 100;

        while (nivelTinta > 80) {

            Random random = new Random();
            double numero = random.nextDouble();
            nivelTinta = nivelTinta - numero;
            System.out.println(nivelTinta);
            System.out.println(numero);
        }
    }

}
