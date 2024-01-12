package boucles;


    import java.util.Scanner;

    public class EX01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Lecture de l'entier naturel N
            System.out.print("Entrez un entier naturel N : ");
            int N = scanner.nextInt();

            // Vérification que N est un entier naturel (N > 0)
            if (N >= 0) {
                // Calcul du factoriel
                long factoriel = calculerFactoriel(N);

                // Affichage du résultat
                System.out.println("Le factoriel de " + N + " est : " + factoriel);
            } else {
                System.out.println("Veuillez entrer un entier naturel (N >= 0).");
            }

            // Fermeture du scanner
            scanner.close();
        }

        // Fonction récursive pour calculer le factoriel
        private static long calculerFactoriel(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * calculerFactoriel(n - 1);
            }
        }
    }


