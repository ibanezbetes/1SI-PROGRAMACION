import java.util.Random;
//array de 10 dimensiones con numeros random
public class bingo {
    static Random aleatorio = new Random();
    static final int MAX_FILA = 3;
    static final int MAX_COLUMNA = 9;
    static int tablero[][] = new int[MAX_FILA][MAX_COLUMNA];

    public static void main(String[] args) {
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                tablero[i][j] = aleatorio.nextInt(10);
            }
        }
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}