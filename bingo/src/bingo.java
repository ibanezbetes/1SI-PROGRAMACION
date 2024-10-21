import java.util.Random;
//array de 10 dimensiones con numeros random
public class bingo {
    static Random aleatorio = new Random();
    static final int MAX_FILA = 3;
    static final int MAX_COLUMNA = 9;
    static int tablero[][] = new int[MAX_FILA][MAX_COLUMNA];
    static int ganadores[] = new int[15];
    static int decenas = 0;
    static int numCarton = 0;

    public static void definirArray() {
            boolean repetido;
            int randomizado;
            for (int i=0; i < MAX_FILA; i++) {
                decenas = 10;
                for (int j=0; j < MAX_COLUMNA; j++) {
                    do {
                        randomizado = aleatorio.nextInt(10) + decenas;
                    } while (comprobarRepetido(randomizado));  // Comprobamos si ya está en el array
                    tablero[i][j] = randomizado;
                    decenas = decenas + 10;
                }
            }
    }

    public static void definirArrayGanadora() {
        boolean repetido;
        int randomizado;
        for (int i=0; i < 15; i++) {
                do {
                    randomizado = aleatorio.nextInt(100);
                } while (comprobarRepetido(randomizado));  // Comprobamos si ya está en el array
                ganadores[i] = randomizado;
        }
    }

    public static void generarNumCarton() {
        numCarton =aleatorio.nextInt(900) + 100;
        System.out.println("---CARTÓN DE BINGO Nº"+numCarton +"--");
        System.out.println("..........................");
    }

    public static void imprimirArray() {
        for (int i=0; i < MAX_FILA; i++) {
            for (int j=0; j < MAX_COLUMNA; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ordenarColumnas() {
        for (int j = 0; j < MAX_COLUMNA; j++) {
            // Aplicamos burbuja en cada columna
            for (int i = 0; i < MAX_FILA - 1; i++) {
                for (int k = i + 1; k < MAX_FILA; k++) {
                    if (tablero[i][j] > tablero[k][j]) {
                        // Intercambiamos si el valor de la fila superior es mayor que el inferior
                        int numeroTemporal = tablero[i][j];
                        tablero[i][j] = tablero[k][j];
                        tablero[k][j] = numeroTemporal;
                    }
                }
            }
        }
    }

    public static boolean comprobarRepetido (int randomizado) {
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                if (tablero[i][j] == randomizado) {
                    return true;  // Si se encuentra el número, devolvemos true
                }
            }
        }
        return false;  // Si no se encuentra, devolvemos false
    }

    public static void imprimirArrayGanadora() {
        System.out.println("..........................");
        System.out.println("Los números ganadores son: ");
        for (int i=0; i < ganadores.length; i++) {
                System.out.print(ganadores[i] + ", ");
            }
            System.out.println();
        }

    public static void main(String[] args) {
        definirArray();
        definirArrayGanadora();
        generarNumCarton();
        ordenarColumnas();
        imprimirArray();
        imprimirArrayGanadora();
    }
}