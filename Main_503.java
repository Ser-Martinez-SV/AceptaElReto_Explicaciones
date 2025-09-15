import java.util.*;
public class Main_503 {
    static Scanner in;

    public static boolean casoDePrueba() {
        if (!in.hasNext())
            return false;
        else {
            int pruebas = in.nextInt();
            in.nextLine();
            
            String[] medias = in.nextLine().split(" ");
            
            int numero_actual = Integer.parseInt(medias[0]);
            System.out.print(numero_actual);
            
            int sum = numero_actual;
            
            for (int i = 1; i < pruebas; i++){
                
                int n = Integer.parseInt(medias[i]);
                
                numero_actual = n * (i + 1) - sum;
                
                sum += numero_actual;
                
                System.out.print(" " + numero_actual);
            }
            System.out.println();
            return true;
        }
    } 
    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        
        while (casoDePrueba());

        in.close();
    }
}

//Funciona pero indica un RunTimeError que no se a que puede deberse.


