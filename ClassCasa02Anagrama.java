import java.util.Scanner;

public class ClassCasa02Anagrama {
    public static void main(String[] args) {
    // Escribe una función que reciba dos palabras (String) y retorne
    //  verdadero o falso (Bool) según sean o no anagramas.
    //  - Un Anagrama consiste en formar una palabra reordenando TODAS
    //    las letras de otra palabra inicial.
    //  - NO hace falta comprobar que ambas palabras existan.
    //  - Dos palabras exactamente iguales no son anagrama.
        Scanner teclado = new Scanner(System.in);
        String dato1;
        String dato2;

        System.out.println("COMPROBACIÓN DE PALABRA ANAGRAMA");
        System.out.println("--------------------------------");
        System.out.println("Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial");
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("");
        
        System.out.println("Introduce primera palabra");
        dato1 = teclado.nextLine();
        
        System.out.println("Introduce segunda palabra (mismas letras en otro orden y mismo nº de letras");
        dato2 = teclado.nextLine();
        
        //tiene el mismo numero de letras?
        while (dato2.length() != dato1.length() && !(dato2.equals(dato1))) {
            System.out.println("Introduce segunda palabra válida, no puede ser igual a la primera o con mas letras");
            dato2 = teclado.nextLine();
        }
        
        //Limpiar dato
        String p1 = dato1.toLowerCase();
        String p2 = dato2.toLowerCase();
        
        //son las mismas letras?
        int cont = 0; 
        for (int i = 0; i < p1.length(); i++){
            System.out.println(p1 + ": " + p1.charAt(i));
            char charInLoop1 = p1.charAt(i);
            //p2 tiene las mismas letras, comprueba todas (puede haber iguales, no se como hacerlo)
            //saca y sala funciona porque en el loop siempre encuentra la a (a pesar de ser diferentes)
            //FALLA, logica mal...
            for (int j = i;j < p1.length() ;j++){
                char charInLoop2 = p2.charAt(j);
                if (charInLoop2 == charInLoop1){
                    System.out.println(p2.charAt(j) + " está en " + p1);
                    cont ++;
                }
            }
        }
        if (cont == p1.length()){
            System.out.println("Tiene las mismas letras");
        }
        else{
            System.out.println("No tiene las mismas letras");
        }
    }    
}