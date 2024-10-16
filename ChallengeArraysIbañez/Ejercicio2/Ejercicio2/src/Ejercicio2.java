import java.util.Random;
public class Ejercicio2 {
    //array de 10 dimensiones con numeros random
    public static void main(String[] args) {

        int[] arrayNumerosAleatorio = new int[10];
        int x, i = 0;
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arrayNumerosAleatorio[i] = random.nextInt(100) + 1;
            System.out.print(i + ", ");
        }
            for (int j = 0; j < 10; j++) {
                //[0][0], [0][1], [0][2], ETC...
                arrayNumerosAleatorio[i] = random.nextInt(100) + 1;
                System.out.println("");
                System.out.print(i + ", ");
        }
    }
}