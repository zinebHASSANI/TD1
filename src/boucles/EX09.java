package boucles;


import java.util.Scanner;

public class EX09 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Lecture du nombre entier
            System.out.print("Entrez un nombre entier : ");
            int nombre = scanner.nextInt();

            // Calcul de la somme des chiffres
            int somme = calculerSommeChiffres(nombre);

            // Affichage du résultat
            System.out.println("La somme des chiffres de " + nombre + " est : " + somme);

            // Fermeture du scanner
            scanner.close();
        }

        // Fonction pour calculer la somme des chiffres
        private static int calculerSommeChiffres(int n) {
            int somme = 0;

            while (n != 0) {
                // Ajout du chiffre de droite à la somme
                somme += n % 10;

                // Suppression du chiffre de droite
                n /= 10;
            }

            return somme;
        }
    }


