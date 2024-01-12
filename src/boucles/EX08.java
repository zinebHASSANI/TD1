package boucles;

import java.util.Scanner;
public class EX08 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Lecture du nombre d'étoiles dans la moitié du motif
            System.out.print("Entrez le nombre d'étoiles dans la moitié du motif : ");
            int nombreEtoiles = scanner.nextInt();

            // Affichage de la première moitié du motif
            for (int i = 1; i <= nombreEtoiles; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println(); // Passage à la ligne pour la prochaine rangée
            }

            // Affichage de la deuxième moitié du motif (en ordre décroissant)
            for (int i = nombreEtoiles - 1; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println(); // Passage à la ligne pour la prochaine rangée
            }

            // Fermeture du scanner
            scanner.close();
        }
    }


