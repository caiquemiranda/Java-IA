package edu.semanas.primeirasemana;

public class MinhaClasse {

    public static void main(String[] args) {

        String firstName = "Caique";
        String lastName = "Miranda";

        String completeName = completeName(firstName, lastName);
        System.out.println(completeName);
    }

    public static String completeName(String firstName, String lastName) {
        return firstName.concat(" ").concat(lastName);
    }
}