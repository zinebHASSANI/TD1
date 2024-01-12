package boucles;



    import java.util.Scanner;

    public class EX05 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Lecture de l'entier positif n
            System.out.print("Entrez un entier positif n : ");
            int n = scanner.nextInt();

            // Vérification que n est positif
            if (n >= 0) {
                // Calcul du nème terme de la suite de Fibonacci
                long resultat = calculerFibonacci(n);

                // Affichage du résultat
                System.out.println("Le " + n + "ème terme de la suite de Fibonacci est : " + resultat);
            } else {
                System.out.println("Veuillez entrer un entier positif.");
            }

            // Fermeture du scanner
            scanner.close();
        }

        // Fonction récursive pour calculer le nème terme de Fibonacci
        private static long calculerFibonacci(int n) {
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                return calculerFibonacci(n - 1) + calculerFibonacci(n - 2);
            }
        }
    }




