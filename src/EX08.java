


    import java.util.Scanner;
    import java.util.Scanner;

    public class EX08{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Lecture du numéro du mois
            System.out.print("Entrez le numéro du mois (1-12) : ");
            int mois = scanner.nextInt();

            // Vérification que le mois est dans la plage valide
            if (mois >= 1 && mois <= 12) {
                int jours;

                // Vérification si le mois est février
                if (mois == 2) {
                    // Lecture de l'année
                    System.out.print("Entrez l'année (1900-2100) : ");
                    int annee = scanner.nextInt();

                    // Vérification que l'année est dans la plage valide
                    if (annee >= 1900 && annee <= 2100) {
                        // Vérification si l'année est bissextile
                        if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
                            jours = 29;
                        } else {
                            jours = 28;
                        }
                    } else {
                        System.out.println("Veuillez entrer une année entre 1900 et 2100.");
                        return;
                    }
                } else {
                    // Nombre de jours pour les autres mois
                    switch (mois) {
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            jours = 30;
                            break;
                        default:
                            jours = 31;
                            break;
                    }
                }

                // Affichage du nombre de jours
                System.out.println("Le mois " + mois + " a " + jours + " jours.");
            } else {
                System.out.println("Veuillez entrer un numéro de mois valide (entre 1 et 12).");
            }

            // Fermeture du scanner
            scanner.close();
        }
    }
