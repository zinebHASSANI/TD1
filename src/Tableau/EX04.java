package Tableau;




    import java.util.Scanner;
    public class EX04 {
    public class SommeMatrices {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Lecture de la taille des matrices carrées
            System.out.print("Entrez la taille des matrices carrées (nombre de lignes/colonnes) : ");
            int taille = scanner.nextInt();

            // Saisie de la première matrice
            System.out.println("Saisie de la première matrice :");
            double[][] matrice1 = saisirMatrice(taille);

            // Saisie de la deuxième matrice
            System.out.println("Saisie de la deuxième matrice :");
            double[][] matrice2 = saisirMatrice(taille);

            // Calcul de la somme des matrices
            double[][] somme = calculerSommeMatrices(matrice1, matrice2);

            // Affichage du résultat
            System.out.println("La somme des matrices est :");
            afficherMatrice(somme);

            // Fermeture du scanner
            scanner.close();
        }

        // Fonction pour saisir une matrice carrée réelle
        private static double[][] saisirMatrice(int taille) {
            Scanner scanner = new Scanner(System.in);
            double[][] matrice = new double[taille][taille];

            for (int i = 0; i < taille; i++) {
                for (int j = 0; j < taille; j++) {
                    System.out.print("Entrez l'élément matrice[" + i + "][" + j + "] : ");
                    matrice[i][j] = scanner.nextDouble();
                }
            }

            return matrice;
        }

        // Fonction pour calculer la somme de deux matrices carrées
        private static double[][] calculerSommeMatrices(double[][] matrice1, double[][] matrice2) {
            int taille = matrice1.length;
            double[][] somme = new double[taille][taille];

            for (int i = 0; i < taille; i++) {
                for (int j = 0; j < taille; j++) {
                    somme[i][j] = matrice1[i][j] + matrice2[i][j];
                }
            }

            return somme;
        }

        // Fonction pour afficher une matrice
        private static void afficherMatrice(double[][] matrice) {
            int taille = matrice.length;

            for (int i = 0; i < taille; i++) {
                for (int j = 0; j < taille; j++) {
                    System.out.print(matrice[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


}
