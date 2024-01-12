package boucles;

import java.util.Scanner;


public class EX03_3 {




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int max = Integer.MIN_VALUE;

            System.out.println("Entrez une suite de nombres (terminez par 0) :");

            int nombre;
            do {
                System.out.print("Entrez un nombre : ");
                nombre = scanner.nextInt();

                if (nombre != 0 && nombre > max) {
                    max = nombre;
                }
            } while (nombre != 0);

            System.out.println("Le maximum de la suite est : " + max);

            scanner.close();
        }
    }





