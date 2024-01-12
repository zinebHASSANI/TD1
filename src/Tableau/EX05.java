package Tableau;




    import java.util.Scanner;

    public class EX05 {




            public static void main(String[] args) {
                char[] tableau = {'D', 'E', 'C', 'A', 'L', 'A', 'G', 'E'};

                System.out.println("Tableau initial :");
                afficherTableau(tableau);

                // Effectuer le décalage
                deplacerElements(tableau, 1);

                System.out.println("Tableau modifié :");
                afficherTableau(tableau);
            }

            // Fonction pour afficher un tableau de caractères
            private static void afficherTableau(char[] tableau) {
                for (char c : tableau) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }

            // Fonction pour déplacer les éléments du tableau
            private static void deplacerElements(char[] tableau, int decalage) {
                int taille = tableau.length;

                // Effectuer le décalage
                for (int i = 0; i < decalage; i++) {
                    char temp = tableau[0];

                    for (int j = 1; j < taille; j++) {
                        tableau[j - 1] = tableau[j];
                    }

                    tableau[taille - 1] = temp;
                }
            }
        }






