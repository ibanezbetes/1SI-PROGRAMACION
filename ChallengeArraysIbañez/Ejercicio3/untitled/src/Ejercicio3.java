import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    //array de 6 nums, peddir al usuario 3 nums y si existen los tacho con XX, sino; imprimo pantalla
    public static void main(String[] args) {
        int[] arrayNumeroAleatorio = new int[6];
        //int x, j = 0;
        Random random = new Random();
        for (int j = 0; j < arrayNumeroAleatorio.length; j++) {
            arrayNumeroAleatorio[j] = random.nextInt(100) + 1;
            System.out.println(arrayNumeroAleatorio[j] + ", ");
        }
        


    }
}