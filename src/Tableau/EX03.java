package Tableau;


    import java.util.Scanner;
    public class EX03 {
    public class NombreEtudiantsSupSeuil {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Lecture du nombre d'étudiants
            System.out.print("Entrez le nombre d'étudiants : ");
            int nombreEtudiants = scanner.nextInt();

            // Initialisation du tableau des moyennes
            double[] moyennes = new double[nombreEtudiants];

            // Lecture des moyennes des étudiants
            for (int i = 0; i < nombreEtudiants; i++) {
                System.out.print("Entrez la moyenne de l'étudiant #" + (i + 1) + " : ");
                moyennes[i] = scanner.nextDouble();
            }

            // Lecture du seuil
            System.out.print("Entrez le seuil de moyenne : ");
            double seuil = scanner.nextDouble();

            // Comptage du nombre d'étudiants ayant une moyenne supérieure ou égale au seuil
            int nombreEtudiantsSupSeuil = 0;

            for (int i = 0; i < nombreEtudiants; i++) {
                if (moyennes[i] >= seuil) {
                    nombreEtudiantsSupSeuil++;
                }
            }

            // Affichage du résultat
            System.out.println("Le nombre d'étudiants ayant une moyenne supérieure ou égale à " + seuil + " est : " + nombreEtudiantsSupSeuil);

            // Fermeture du scanner
            scanner.close();
        }
    }

}
