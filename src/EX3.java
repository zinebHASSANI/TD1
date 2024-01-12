
    import java.util.Scanner;

    public class EX3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Lecture des nombres entiers a et b
            System.out.print("Entrez le nombre entier a : ");
            int a = scanner.nextInt();

            System.out.print("Entrez le nombre entier b : ");
            int b = scanner.nextInt();

            // Menu des opérations
            System.out.println("Choisissez une opération :");
            System.out.println("1. Vérifier si la somme a + b est paire");
            System.out.println("2. Vérifier si le produit ab est pair");
            System.out.println("3. Connaître le signe de la somme a + b");
            System.out.println("4. Connaître le signe du produit ab");

            // Lecture du choix de l'utilisateur
            System.out.print("Entrez le numéro de l'opération choisie : ");
            int choix = scanner.nextInt();

            // Traitement en fonction du choix de l'utilisateur
            switch (choix) {
                case 1:
                    // Vérifier si la somme a + b est paire
                    if ((a + b) % 2 == 0) {
                        System.out.println("La somme a + b est paire.");
                    } else {
                        System.out.println("La somme a + b n'est pas paire.");
                    }
                    break;
                case 2:
                    // Vérifier si le produit ab est pair
                    if ((a * b) % 2 == 0) {
                        System.out.println("Le produit ab est pair.");
                    } else {
                        System.out.println("Le produit ab n'est pas pair.");
                    }
                    break;
                case 3:
                    // Connaître le signe de la somme a + b
                    if (a + b > 0) {
                        System.out.println("La somme a + b est positive.");
                    } else if (a + b < 0) {
                        System.out.println("La somme a + b est négative.");
                    } else {
                        System.out.println("La somme a + b est nulle.");
                    }
                    break;
                case 4:
                    // Connaître le signe du produit ab
                    if (a * b > 0) {
                        System.out.println("Le produit ab est positif.");
                    } else if (a * b < 0) {
                        System.out.println("Le produit ab est négatif.");
                    } else {
                        System.out.println("Le produit ab est nul.");
                    }
                    break;
                default:
                    System.out.println("Choix invalide.");
            }

            // Fermeture du scanner
            scanner.close();
        }
    }


