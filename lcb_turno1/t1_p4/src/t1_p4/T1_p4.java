//En esta tarea vamos a crear una €urocalculadora
//Para ello usaremos el scanner
        
package t1_p4;

 import java.util.Scanner;
//El scanner se utiliza para recoger datos por teclado

/**
 *
 * @author PC3
 */
public class T1_p4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Desarollo de la €urocalculadora
        //Zona de declaracion de variables
        int pta; //Guardamos las pesetas
        
        Scanner s= new Scanner(System.in);
        //Habilitamos el scanner
        System.out.print("Introduzca una cantidad en Ptas:");
        pta = s.nextInt(); //Indicamos cuántas pesetas
        double cambio = pta/166.386;
      System.out.println("Las pesetas introducidas son ..."+ cambio +"euros");
    }
    
}
