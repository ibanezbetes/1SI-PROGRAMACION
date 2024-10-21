import java.util.Random;
//array de 10 dimensiones con numeros random
public class bingo {
    static Random aleatorio = new Random();
    static final int MAX_FILA = 3;
    static final int MAX_COLUMNA = 9;
    static int tablero[][] = new int[MAX_FILA][MAX_COLUMNA];
    static int ganadores[] = new int[15];
    static int numCarton = 0;

    public static void definirArray() {
        int numerosGenerados = 0;
        int randomizado;
        // Inicializamos el tablero con -1 para las posiciones vacías (que representarán "XX").
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                tablero[i][j] = -1;  // Marcamos como vacía inicialmente.
            }
        }
        // Vamos a seleccionar 15 posiciones aleatorias.
        while (numerosGenerados < 15) {
            // Generamos posiciones aleatorias (fila y columna).
            int fila = aleatorio.nextInt(MAX_FILA);
            int columna = aleatorio.nextInt(MAX_COLUMNA);
            // Si la posición está vacía (-1), generamos un número para esa posición.
            if (tablero[fila][columna] == -1) {
                do {
                    randomizado = aleatorio.nextInt(10) + (columna * 10);  // Generar número en el rango adecuado por decenas.
                } while (comprobarRepetido(randomizado));  // Evitar números repetidos en el tablero.
                randomizado=randomizado+10;
                tablero[fila][columna] = randomizado;  // Asignamos el número en la posición aleatoria.
                numerosGenerados++;
            }
        }
    }

    public static void definirArrayGanadora() {
        boolean repetido;
        int randomizado;
        for (int i=0; i < 15; i++) {
                do {
                    randomizado = aleatorio.nextInt(90) + 10;
                } while (comprobarRepetido(randomizado));  // Comprobamos si ya está en el array.
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
                if (tablero[i][j] == -1) {
                    System.out.print("XX ");
                } else {
                    System.out.print(tablero[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void ordenarColumnas() {
        for (int j = 0; j < MAX_COLUMNA; j++) {
            // Método burbu de ordenación.
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

    public static void contarAciertos() {
        int aciertos = 0;
        // Comparar números en el array "tablero" con los números del array "ganadores".
        for (int i = 0; i < MAX_FILA; i++) {
            for (int j = 0; j < MAX_COLUMNA; j++) {
                if (tablero[i][j] != -1) {  // Solo consideramos las posiciones con valor diferente a '-1'
                                            // (es decir, las que tienen número y no son 'XX').
                    for (int k = 0; k < ganadores.length; k++) {
                        if (tablero[i][j] == ganadores[k]) {
                            aciertos++;
                        }
                    }
                }
            }
        }
        System.out.println(".............................................");
        System.out.println("Has tenido " + aciertos + " aciertos en tu cartón de Bingo.");
        System.out.println(".............................................");
    }

    public static void main(String[] args) {
        definirArray();
        definirArrayGanadora();
        generarNumCarton();
        ordenarColumnas();
        imprimirArray();
        imprimirArrayGanadora();
        contarAciertos();

    }
}