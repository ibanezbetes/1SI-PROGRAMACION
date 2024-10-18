import java.util.Random;
import java.util.Scanner;

public class Main {
    // Me tengo que acordar de STATIC,
    // si lo quiero arriba
    // static String arrayPrimitiva[] = new String[6];
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner leer = new Scanner(System.in);
        String arrayPrimitiva[] = new String[6];
        for (int i = 0; i < arrayPrimitiva.length; i++) {
            int numAle = aleatorio.nextInt(100);
            // convertir un entero a cadena
            // (convertir de int a string)
            arrayPrimitiva[i] = String.valueOf(numAle) ;
        }
        for (int i = 0; i < arrayPrimitiva.length; i++) {
            System.out.println(arrayPrimitiva[i]);
        }
        System.out.println("Dame el número 1: ");
        String cadUsuario1 = leer.next();
        for (int i = 0; i < arrayPrimitiva.length; i++) {
            if(cadUsuario1.equals(arrayPrimitiva[i])){
                arrayPrimitiva[i] = "XX";
            }
        }
        System.out.println("Dame el número 2: ");
        String cadUsuario2 = leer.next();
        for (int i = 0; i < arrayPrimitiva.length; i++) {
            if(cadUsuario2.equals(arrayPrimitiva[i])){
                arrayPrimitiva[i] = "XX";
            }
        }
        System.out.println("Dame el número 3: ");
        String cadUsuario3 = leer.next();
        for (int i = 0; i < arrayPrimitiva.length; i++) {
            if(cadUsuario3.equals(arrayPrimitiva[i])){
                arrayPrimitiva[i] = "XX";
            }
        }
    }
}