//VARIABLES
/*Una variable es un contenedor de información.
Las variables pueden almacenar valores enteros,numeros decimales,caracteres,cadenas de caracteres
(palabras o frases).
El contenido de una variable puede cambiar durante la ejecución del programa,de ahí el nombre de "variable".
*/
package t1_t3;

/**
 *
 * @author PC3
 */
public class T1_t3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Numeros enteros(int y long)
        int x; // Declaración de variable 
        x = 5; //Asignación de valor (o iniciaización)
        System.out.println("El valor de x es..." + x);
        x = 7;
        
        //Muestra el nuevo valor de la variable
        System.out.println("Y ahora el valor de x es..." + x);
        
        //Números decimales (float y doble)
        double y,z; //Declaro dos variables a la vez
        y =8;
        z = 27.08;
        double suma;
        suma = y+z;
       System.out.println("La suma de los numeros es: " + suma);
        String a;

       System.out.println("Y ahora el valor de x es..." + a );
       a=24.5;
       System.out.println("Y ahora el valor de x es..." + d );
       d=2;
       System.out.println();
       
       
       
       
       //Cadena de caracteres (String)
       // Con esto almacenamos palabras y frases 
       
       String miPrimeraPalabra ="mami";
       String miPrimeraFrase= "quiero bajarme de aqui";
               
               //Y ahora sacamos ambas por pantalla 
               System.out.println("mami"+"quiero bajarme de aqui");
        
               //A veces necesitamos iniciar una cadena vacia
               String cadenaVacia= "";
               
               //Caracteres (char)
               // Para esto usaremos comillas simples
               
               char a = 'b';
               char b = 'i';
               char c = 'r';
               char d = 'r';
               char e = 'a';
               System.out.println("Mi primera palabra fue: "+ a+ b+ c+ d+ e);
               System.out.println(a+b+c+d+e); //Suma de los valores Ascii de caracteres
               
               //Operadores aritmeticos
               //+ suma
               // -resta
               // %resto o módulo (5%2)
               // ++ incremento i++
               // -- decremento j-- 
               //casting o conversión de tipos
               
               int num1 = 2;
               int num2 = 9;
               double division;
               division = (double)num1/ (double)num2;
               
               System.out.println("El cociente decimal es ...") + division;
        
        
    }
    
}
