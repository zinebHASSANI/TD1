
    import java.util.Scanner;
    public class ex5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Lecture de l'heure
            System.out.print("Entrez l'heure (0-23) : ");
            int heure = scanner.nextInt();

            // Lecture du choix de langue
            System.out.print("Entrez le choix de langue (f pour français, a pour anglais) : ");
            char choixLangue = scanner.next().charAt(0);

            // Vérification de l'heure et affichage du message en fonction de la langue
            if (choixLangue == 'f') {
                if (heure >= 0 && heure < 18) {
                    System.out.println("Bonjour");
                } else if (heure >= 18 && heure <= 22) {
                    System.out.println("Bonsoir");
                } else {
                    System.out.println("Bonne nuit");
                }
            } else if (choixLangue == 'a') {
                if (heure >= 0 && heure < 18) {
                    System.out.println("Good Morning");
                } else if (heure >= 18 && heure <= 22) {
                    System.out.println("Good Evening");
                } else {
                    System.out.println("Good Night");
                }
            } else {
                System.out.println("Choix de langue invalide.");
            }

            // Fermeture du scanner
            scanner.close();
        }
    }


