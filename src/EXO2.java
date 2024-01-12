

import java.util.Scanner;
public class EXO2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Lecture des coefficients a, b et c
            System.out.print("Entrez la valeur de a : ");
            double a = scanner.nextDouble();

            System.out.print("Entrez la valeur de b : ");
            double b = scanner.nextDouble();

            System.out.print("Entrez la valeur de c : ");
            double c = scanner.nextDouble();

            // Calcul du discriminant
            double discriminant = b * b - 4 * a * c;

            // Vérification du discriminant
            if (discriminant > 0) {
                // Deux solutions réelles distinctes
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

                System.out.println("Les solutions sont réelles et distinctes :");
                System.out.println("Root 1 = " + root1);
                System.out.println("Root 2 = " + root2);
            } else if (discriminant == 0) {
                // Une solution réelle unique
                double root = -b / (2 * a);

                System.out.println("La solution est réelle et unique :");
                System.out.println("Root = " + root);
            } else {
                // Pas de solution réelle
                System.out.println("L'équation n'a pas de solution réelle.");
            }

            // Fermeture du scanner
            scanner.close();
        }}


