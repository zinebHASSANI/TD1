

    import java.util.Scanner;
    public class EXO7 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Lecture de l'entier de trois chiffres non nuls
            System.out.print("Entrez un entier de trois chiffres non nuls : ");
            int N = scanner.nextInt();

            // Vérification que l'entier est de trois chiffres non nuls
            if (N >= 100 && N <= 999) {
                // Conversion de l'entier en une chaîne de caractères pour faciliter la manipulation des chiffres
                String chiffres = Integer.toString(N);

                // Génération et affichage de toutes les permutations des chiffres
                System.out.println("Les nombres formés par les chiffres de N sont :");
                genererPermutations("", chiffres);
            } else {
                System.out.println("Veuillez entrer un entier de trois chiffres non nuls.");
            }

            // Fermeture du scanner
            scanner.close();
        }

        // Fonction récursive pour générer toutes les permutations des chiffres
        private static void genererPermutations(String prefix, String chiffres) {
            int n = chiffres.length();
            if (n == 0) {
                System.out.println(prefix);
            } else {
                for (int i = 0; i < n; i++) {
                    genererPermutations(prefix + chiffres.charAt(i), chiffres.substring(0, i) + chiffres.substring(i + 1));
                }
            }
        }
    }


