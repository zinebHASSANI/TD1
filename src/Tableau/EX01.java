package Tableau;

import java.util.Scanner;

public class EX01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lecture du nombre d'entiers dans le tableau (N)
        System.out.print("Entrez le nombre d'entiers dans le tableau (entre 10 et 50) : ");
        int N = scanner.nextInt();

        // Vérification que N est dans la plage spécifiée
        if (N < 10 || N > 50) {
            System.out.println("Veuillez entrer un nombre d'entiers entre 10 et 50.");
            return;
        }

        // Initialisation du tableau T
        int[] T = new int[N];

        // Lecture des entiers dans le tableau
        for (int i = 0; i < N; i++) {
            System.out.print("Entrez l'entier T[" + i + "] : ");
            T[i] = scanner.nextInt();
        }

        // Calcul de la valeur maximale et minimale
        int max = T[0];
        int min = T[0];

        for (int i = 1; i < N; i++) {
            if (T[i] > max) {
                max = T[i];
            }
            if (T[i] < min) {
                min = T[i];
            }
        }

        // Affichage des résultats
        System.out.println("La valeur maximale de T est : " + max);
        System.out.println("La valeur minimale de T est : " + min);

        // Fermeture du scanner
        scanner.close();
    }
}
