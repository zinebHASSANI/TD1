package Tableau;



    import java.util.Scanner;

public class EXO2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Saisie de l'entier N
            System.out.print("Entrez un entier N : ");
            int N = scanner.nextInt();

            // Affichage de la représentation binaire
            System.out.println("La représentation binaire de " + N + " est : " + convertirEnBinaire(N));

            // Fermeture du scanner
            scanner.close();
        }

        // Fonction pour convertir un entier en sa représentation binaire
        private static String convertirEnBinaire(int n) {
            StringBuilder binaire = new StringBuilder();

            // Cas particulier pour 0
            if (n == 0) {
                return "0";
            }

            // Conversion en binaire
            while (n > 0) {
                int bit = n % 2;
                binaire.insert(0, bit);
                n /= 2;
            }

            return binaire.toString();
        }
    }



