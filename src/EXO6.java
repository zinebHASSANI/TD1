
import java.util.Scanner;
public class EXO6 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Lecture des deux valeurs entières A et B
            System.out.print("Entrez la valeur entière A : ");
            int A = scanner.nextInt();

            System.out.print("Entrez la valeur entière B : ");
            int B = scanner.nextInt();

            // Vérification du signe du produit sans effectuer la multiplication
            if ((A > 0 && B > 0) || (A < 0 && B < 0)) {
                System.out.println("Le produit de A et B est positif.");
            } else if (A == 0 || B == 0) {
                System.out.println("Le produit de A et B est nul.");
            } else {
                System.out.println("Le produit de A et B est négatif.");
            }

            // Fermeture du scanner
            scanner.close();
        }
    }


