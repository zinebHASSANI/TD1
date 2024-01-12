
    import java.util.Scanner;

    public class EX09 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Lecture des deux variables
            System.out.print("Entrez la première variable : ");
            int a = scanner.nextInt();

            System.out.print("Entrez la deuxième variable : ");
            int b = scanner.nextInt();

            // Affichage des variables avant modification
            System.out.println("Variables avant modification :");
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            // Vérification et modification si nécessaire
            if (a > b) {
                // Échange des valeurs si a > b
                int temp = a;
                a = b;
                b = temp;
            }

            // Affichage des variables après modification
            System.out.println("Variables après modification (ordre croissant) :");
            System.out.println("a = " + a);
            System.out.println("b = " + b);

            // Fermeture du scanner
            scanner.close();
        }
    }


