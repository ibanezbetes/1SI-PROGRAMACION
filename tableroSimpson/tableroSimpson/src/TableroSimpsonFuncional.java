import java.util.Random;

public class TableroSimpsonFuncional {
    private static final int MAX_FILA_TABLERO = 10;
    private static final int MAX_COLUMNA_TABLERO = 10;
    private static char[][] tablero;
    public static void main(String[] args) {
        //1º inicializo matriz tablero
        tablero = new char[MAX_FILA_TABLERO][MAX_COLUMNA_TABLERO];

        //2º RELLENAR EL TABLERO 'L'
        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                //[0][0], [0][1], [0][2], ETC...
                tablero[i][j] = 'L';
            }
        }
        //3º IMPRIMIR TABLERO
        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                //[0][0], [0][1],[0][2], ETC...
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");

        //4º ASIGNAR A BART
        Random aleatorio = new Random();
        int filaAleatorio = aleatorio.nextInt(MAX_FILA_TABLERO); //De 0 a N-1
        int columnaAleatorio = aleatorio.nextInt(MAX_COLUMNA_TABLERO); //De 0 a N-1

        tablero[filaAleatorio][columnaAleatorio] = 'B';

        //5º IMPRIMIR TABLERO
        imprimirTablero();
        

        //6º ASIGNAR LOS 10 HOMER
        int filaAleatorioHomer;
        int columnaAleatorioHomer;
        for (int i = 0; i < 10; i++) {
            do { //esto lo hace mientras la casilla sea diferente a L
                filaAleatorioHomer = aleatorio.nextInt(MAX_FILA_TABLERO); //De 0 a N-1
                columnaAleatorioHomer = aleatorio.nextInt(MAX_COLUMNA_TABLERO); //De 0 a N-1
            }while (tablero[filaAleatorioHomer][columnaAleatorioHomer]!='L');
            //esto de abajo lo ejecutará cuando la casilla sea = L (pondrá H en la casilla)
            tablero[filaAleatorioHomer][columnaAleatorioHomer] = 'H';
        }

        int filaAleatorioMuro;
        int columnaAleatorioMuro;
        for (int i = 0; i < 10; i++) {
            do { //esto lo hace mientras la casilla sea diferente a L
                filaAleatorioMuro = aleatorio.nextInt(MAX_FILA_TABLERO); //De 0 a N-1
                columnaAleatorioMuro = aleatorio.nextInt(MAX_COLUMNA_TABLERO); //De 0 a N-1
            }while (tablero[filaAleatorioMuro][columnaAleatorioMuro]!='L');
            //esto de abajo lo ejecutará cuando la casilla sea = L (pondrá M en la casilla)
            tablero[filaAleatorioMuro][columnaAleatorioMuro] = 'M';
        }       
        //7º IMPRIMIR TABLERO
        imprimirTablero();
        tablero[MAX_COLUMNA_TABLERO-1][MAX_COLUMNA_TABLERO-1] = 'F';
        imprimirTablero();
    }
    private static void imprimirTablero(){
        for (int i = 0; i < MAX_FILA_TABLERO; i++) {
            for (int j = 0; j < MAX_COLUMNA_TABLERO; j++) {
                //[0][0], [0][1],[0][2], ETC...
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println("");
        }
            System.out.println("");
            System.out.println("");
            System.out.println("");
}

}   