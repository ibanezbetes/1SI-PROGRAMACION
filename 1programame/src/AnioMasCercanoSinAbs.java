import java.util.Scanner;

public class AnioMasCercanoSinAbs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new cadena String(char) cadena;
        System.out.println("¿Cuántos casos quieres comparar?: ");
        int casos = scanner.nextInt();

        for (int i = 0; i < casos; i++) {
            int A, B, C;

            do {
                System.out.println("Primer año a comparar (no puede ser 0): ");
                A = scanner.nextInt();
            } while (A == 0);

            do {
                System.out.println("Segundo año a comparar (no puede ser 0): ");
                B = scanner.nextInt();
            } while (B == 0);

            do {
                System.out.println("Tercer año a comparar (no puede ser 0): ");
                C = scanner.nextInt();
            } while (C == 0);

            if (A > B) {
                int temp = A;
                A = B;
                B = temp;
            }
            if (A > C) {
                int temp = A;
                A = C;
                C = temp;
            }
            if (B > C) {
                int temp = B;
                B = C;
                C = temp;
            }

            // System.out.println("Los años ordenados son: A = " + A + ", B = " + B + ", C = " + C);

            int distA = A - B;
            if (distA < 0) distA = -distA;

            int distC = C - B;
            if (distC < 0) distC = -distC;

            if (distA < distC) {
                String cadena = cadena + A;
            } else if (distC < distA) {
                String cadena = cadena + C;
            } else {
                String cadena = cadena + "EMPATE";
            }
        }

    }
}