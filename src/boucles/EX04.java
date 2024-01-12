package boucles;

import java.util.Scanner;

import java.util.Scanner;

public class EX04{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lecture des deux entiers positifs non nuls a et b
        System.out.print("Entrez un entier positif non nul a : ");
        int a = scanner.nextInt();

        System.out.print("Entrez un entier positif non nul b : ");
        int b = scanner.nextInt();

        // Vérification que les entiers sont positifs non nuls
        if (a > 0 && b > 0) {
            // Calcul du PGCD en utilisant l'algorithme d'Euclide avec une boucle
            int pgcd = calculerPGCD(a, b);

            // Affichage du résultat
            System.out.println("Le PGCD de " + a + " et " + b + " est : " + pgcd);
        } else {
            System.out.println("Veuillez entrer des entiers positifs non nuls.");
        }

        // Fermeture du scanner
        scanner.close();
    }

    // Fonction pour calculer le PGCD avec une boucle
    private static int calculerPGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
