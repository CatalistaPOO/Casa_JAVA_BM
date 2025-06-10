import java.util.Scanner;

public class ClassEjIA01ContarVocales {
    public static void main(String[] args) {
        // Ejercicio: Contador de Frecuencia de Vocales
        // Objetivo
        // Escribir un programa que pida al usuario una frase y luego
        // muestre cuántas veces aparece cada vocal (a, e, i, o, u), sin distinguir entre mayúsculas y minúsculas.
        
        // Mostrar resultados: Al final, imprimir el número total de apariciones para cada vocal.
        // Ejemplo de Interacción
        // Por favor, introduce una frase:
        // Hola mundo, ¿cómo estás?

        // Resultados:
        // La vocal 'a' aparece 2 veces.
        // La vocal 'e' aparece 1 vez.
        // La vocal 'i' aparece 0 veces.
        // La vocal 'o' aparece 3 veces.
        // La vocal 'u' aparece 1 vez.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe una frase y contaré las vocales: ");
        String frase = teclado.nextLine();

        int numA = 0;
        int numE = 0;
        int numI = 0;
        int numO = 0;
        int numU = 0;

        for(int i = 0;i < frase.length();i++){
            char letra = Character.toLowerCase(frase.charAt(i));
            if ("a".indexOf(letra) != -1 ){
                numA ++;
            }
            else if ("e".indexOf(letra) != -1 ){
                numE ++;
            }
            else if ("i".indexOf(letra) != -1 ){
                numI ++;
            }
            else if ("o".indexOf(letra) != -1 ){
                numO ++;
            }
            else if ("u".indexOf(letra) != -1 ){
                numU ++;
            }
            }
            System.out.println("Hay " + numA + " a");
            System.out.println("Hay " + numE + " e");
            System.out.println("Hay " + numI + " i");
            System.out.println("Hay " + numO + " o");
            System.out.println("Hay " + numU + " u");
    }

}

