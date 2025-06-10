import java.util.Scanner;

public class ClassEjIA02Maximo {
    public static void main(String[] args) {
        // Objetivo
        // Escribir un programa que cree un array de números enterosa partir de petición al usuario,
        //  encuentre el número más grande dentro de ese array y luego
        //  muestre cuál es ese número y en qué posición (índice) se encuentra.
       
        // Ejemplo de Salida
        // Si tu array es [10, 5, 20, 8, 15]:
        // El valor máximo en el array es: 20
        // Se encuentra en la posición (índice): 2

        Scanner in = new Scanner(System.in);
        int ncomparaciones;

        System.out.println("Pediré números y los escribirás, daré el mayor de todos al finalizar");
        System.out.println("Entre cuantos numeros quieres comparar? (un máximo de 10)");
        ncomparaciones = Integer.parseInt(in.nextLine());
        
        while (ncomparaciones > 10 && ncomparaciones < 2) {
            System.out.println("Escribe en un rango valido (entre 2 y 10) para comparar");
            ncomparaciones = Integer.parseInt(in.nextLine());
        }

        System.out.println("------------------------");
        System.out.println("------------------------");

        int[] numeros = new int[ncomparaciones];
        int mayor = 0;
        int indexMayor = 0;

        for (int i = 0;i < ncomparaciones;i++){
            System.out.println("Dame el número " + (i+1));
            int numero = Integer.parseInt(in.nextLine());
            numeros[i] = numero;
            if (i == 0){
                mayor = numeros[i];
            }
            else{
                if (numeros[i] > mayor){
                    mayor =  numeros[i];
                    indexMayor = i;
                }
            }
        }
        for (int i = 0;i < numeros.length;i++){
            System.out.print(numeros[i] + ", ");
        }
        System.out.println("");
        System.out.println("La posición del mayor(" + mayor + ")" + " es: " + indexMayor + " si comenzamos a contar por 0 en primer lugar");

        in.close(); // Cierra el scanner
        
    }
}
