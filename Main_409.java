public class Main_409 {
    
    static java.util.Scanner sc;
    static java.util.Arrays Arrays;
    
    public static int[] ordenar(String[] pers){
        //Creamos una función para ordenar una lista de números de tipo texto a tipo int.
        int [] new_pers = new int[pers.length];
        
        for (int i = 0; i < pers.length; i++) {
            new_pers[i] = Integer.parseInt(pers[i]);
        }
        
        java.util.Arrays.sort(new_pers);
        return new_pers;
    }
    public static void problema(){
        //Leemos los datos
        String[] datos = sc.nextLine().split(" ");
        //Pasamos el número de castellers a una variable tipo int 
        int caste  = Integer.parseInt(datos[0]);
        //Y luego pasamos la lista de personas a la función anterior para que nos devuelve una 
        //lista ordenada de las alturas de las personas tipo int.
        int[] personas = ordenar(sc.nextLine().split(" "));
        //Abrimos un contador para saber cuanos pisos podemos hacer.
        int cont = 0;
        //Y una variable para llevar la cuenta de hasta que altura hemos llegado y no repetirlas.
        int comprobador = -1;
        //Recorremos un bucle donde pasamos por todas las alturas menos por las ultimas. Recorremos 
        //la logitud de la lista de las alturas menos el tamaño de los pisos ya que cuando las alturas
        //que queden sean menores que los castelleres necesarios en un piso no podremos hacer un piso más.
        for (int i = 0; i < (personas.length - caste + 1); i++) {
            //Luego hacemos 2 comprobaciones, si nuestro comprobador es menos que i para saber si la altura 
            //por la que vamos a pasar ya la hemos tenido en cuenta en otro grupo y si la diferencia entre 
            //la altura por la que estamos pasando y la altura del casteller más alto que cabe en esta altura.
            if (comprobador < i && ((personas[i] + 15) >= personas[i+caste-1])){
                //Si es asi aumentamos el contador y le damos el ultimo valor al comprobador para no pasar por 
                //las alturas del piso que hemos asignado ya.
                cont++;
                comprobador = i+caste-1;
            }
        }
        //Imprimimos el contador por pantalla. 
        System.out.println(cont);

    }
    public static void main(String[] args) {
        
        sc = new java.util.Scanner(System.in);
        
        int n_p = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < n_p; i++) {
            problema();
        }
        sc.close();
    }
}
//Funciona correctamente. Ejercicio resuelto.
