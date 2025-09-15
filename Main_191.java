import java.util.*;

public class Main_191 {

  static Scanner in;
    public static void casoDePrueba() {
        String[] datos = in.nextLine().split(" ");
        
        int s = ((Integer.parseInt(datos[0]) - 1) * Integer.parseInt(datos[0]))/2;
        
        System.out.println((Integer.parseInt(datos[1])*Integer.parseInt(datos[0]))-(s*(Integer.parseInt(datos[2]))));
    } 
    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        
        int numCasos = in.nextInt();
        in.nextLine();
        
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();
    }
}
//Funciona correctamente. Ejercicio resuelto.
