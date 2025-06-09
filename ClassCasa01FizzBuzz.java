public class ClassCasa01FizzBuzz {
    public static void main(String[] args) {
        // Escribe un programa que muestre por consola (con un print) los
        // números de 1 a 100 (ambos incluidos y con un salto de línea entre
        // cada impresión), sustituyendo los siguientes:
        // - Múltiplos de 3 por la palabra "fizz".
        // - Múltiplos de 5 por la palabra "buzz".
        // - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".

       
        
        for (int i = 1; i < 101; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i + " :fizzbuzz");
            }
            else if (i % 3 == 0){
                System.out.println(i + " :fizz");
            }
            else if (i % 5 == 0){
                System.out.println(i + " :buzz");
            }
            else{
                System.out.println(i);
            }
        }
        System.out.println("Se muestran los numeros entre 1 y 100");
        System.out.println("Múltiplos de 3 con la palabra fizz");
        System.out.println("Múltiplos de 5 con la palabra buzz");
        System.out.println("Múltiplos de 3 y 5 con la palabra fizzbuzz");
        System.out.println("--------------------------------------------------");
        System.out.println("FIN DE PROGRAMA");
    }
}