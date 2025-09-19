import java.util.*;

public class Main_191 {

  static Scanner in;
    public static void casoDePrueba() {
        //Empezamos recogiendo los datos.
        String[] datos = in.nextLine().split(" ");
        //La idea principal de este programa es sacar la capacidad total, la capacidad total va a ser la pecera más gande más la segunda pecera más grande 
        //que será esta misma menos el número que nos indiquen de manera sucesiva. O lo que es lo mismo La capacidad de la pecera más grande multiplicado 
        //por el número de peceras menos lo que restamos a todas las peceras menos a la primera. Cuando tenemos 3 peceras la primera no se resta nada, la 
        //segunda pecera se resata la diferencia y la tercera pecera se resta la diferencia indicada sobre la segunda pecera, o lo que es lo mismo,
        //restarle dos veces la diferencia sobre el valor de la primera pecera. Por lo que en total debemos restar 3 veces la diferencia a la multiplicación 
        //del número de peceras por la capacidad de la más grande. En el caso de las 3 peceras el número de diferencias es 3, pero cuando sn 4 peceras el 
        //número de diferencias es 6 y para 5 es 10. Para sacar este número debemos utilizar la siguiente formula n*(n+1)/2.
        int s = ((Integer.parseInt(datos[0]) - 1) * Integer.parseInt(datos[0]))/2;
        
        //Una vez sepamos el número de veces que tenemos que restar la diferencia la restamos al numero de peceras por la contidad de la máxima.
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
