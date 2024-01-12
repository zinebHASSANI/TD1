package boucles;

public class EX10 {



        public static void main(String[] args) {
            System.out.println("Les entiers cubiques de trois chiffres sont :");

            for (int i = 100; i <= 999; i++) {
                if (estCubique(i)) {
                    System.out.println(i);
                }
            }
        }

        // Fonction pour vérifier si un nombre est cubique
        private static boolean estCubique(int n) {
            int original = n;
            int sommeCubes = 0;

            while (n > 0) {
                int chiffre = n % 10;
                sommeCubes += chiffre * chiffre * chiffre;
                n /= 10;
            }

            return sommeCubes == original;
        }
    }


