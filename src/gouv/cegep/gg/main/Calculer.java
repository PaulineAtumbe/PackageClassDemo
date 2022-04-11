package gouv.cegep.gg.main;

import gouv.cegep.gg.objets.CalculeLesNombres;

import java.util.Scanner;

public class Calculer {
    public static void main(String[] args) {
        int addition, soustraction;

        CalculeLesNombres calculeleNombre = new CalculeLesNombres();
        Scanner clavier = new Scanner(System.in);

        System.out.println("Entrer un nombre1 = ");
        calculeleNombre.nombre1 = clavier.nextInt();

        System.out.println("Entrer un nombre2 = ");
        calculeleNombre.nombre2 = clavier.nextInt();

        addition = calculeleNombre.addition(calculeleNombre.nombre1, calculeleNombre.nombre1);
        soustraction = calculeleNombre.soustraction(calculeleNombre.nombre1, calculeleNombre.nombre1);

        calculeleNombre.afficher(addition, "addition");
        calculeleNombre.afficher(soustraction, "soustraction");

    }
}
