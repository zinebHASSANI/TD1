




import java.util.Scanner;
public class EX01 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Lecture des trois variables au clavier
            System.out.print("Entrez le premier nombre : ");
            double num1 = scanner.nextDouble();

            System.out.print("Entrez le deuxième nombre : ");
            double num2 = scanner.nextDouble();

            System.out.print("Entrez le troisième nombre : ");
            double num3 = scanner.nextDouble();

            // Calcul du maximum
            double max = Math.max(Math.max(num1, num2), num3);

            // Affichage du résultat
            System.out.println("Le maximum des trois nombres est : " + max);

            // Fermeture du scanner
            scanner.close();
        }
    }


