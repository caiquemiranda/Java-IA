package edu.caique.terceirasemana;

public class SobreMin {
    public static void main(String[] args) {
        String firstName = args[0];
        String lastName = args[1];
        int age = Integer.valueOf(args[2]);
        double height = Double.valueOf(args[3]);

        System.out.println("ME CHAMO " + firstName + " " + lastName);
        System.out.println("Tenho " + age + " anos");
        System.out.println("MINHA ALTURA É: "  + height );
    }
}
