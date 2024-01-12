

   import java.util.Scanner;
   public class EXO4 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Lecture de la moyenne de l'étudiant
            System.out.print("Entrez la moyenne de l'étudiant : ");
            double moyenne = scanner.nextDouble();

            // Vérification de la mention correspondante
            if (moyenne >= 16) {
                System.out.println("Mention : Très Bien");
            } else if (moyenne >= 14) {
                System.out.println("Mention : Bien");
            } else if (moyenne >= 12) {
                System.out.println("Mention : Assez Bien");
            } else if (moyenne >= 10) {
                System.out.println("Mention : Passable");
            } else {
                System.out.println("Mention : Insuffisant");
            }

            // Fermeture du scanner
            scanner.close();
        }
   }

