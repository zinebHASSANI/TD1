package boucles;
import java.util.Scanner;

public class EX02 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Lecture de l'entier N
            System.out.print("Entrez un entier N : ");
            int N = scanner.nextInt();

            // Vérification que N est positif
            if (N >= 0) {
                // Calcul de la somme des entiers impairs inférieurs à N
                int somme = calculerSommeEntiersImpairs(N);

                // Affichage du résultat
                System.out.println("La somme des entiers impairs inférieurs à " + N + " est : " + somme);
            } else {
                System.out.println("Veuillez entrer un entier positif.");
            }

            // Fermeture du scanner
            scanner.close();
        }

        // Fonction pour calculer la somme des entiers impairs inférieurs à N
        private static int calculerSommeEntiersImpairs(int n) {
            int somme = 0;

            for (int i = 1; i < n; i += 2) {
                somme += i;
            }

            return somme;
        }
    }


