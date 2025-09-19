public class Main_300 {
    static java.util.Scanner sc;
    
    public static void problema(){
        //Para saber que palabras tiene las 5 vocales, primero leemos la entrada y defnimos una lista con las 5 vocales
        //y un contador. 
        String palabra = sc.nextLine();
        char[] vocales = {'a','e','i','o','u'};
        int cont = 0;
        //Ahora recorremos las vocales y comprobamos si esta en la palabra, si esta sumamos el contador, si no pasamos. 
        for (char vocal:vocales){
            //Para comprobar si esta en la palabra vamos a buscar su posición, su indice y si nos devuelve -1
            //quiere decir que no lo ha encontrado por lo que no esta en la palabra. 
            if (palabra.indexOf(vocal) == -1){
                //En el momento que una sola vocal no este en la palabra salimos del bucle ya que ya no podra tener las 5.
                break;
            }else{
                cont++;
            }
        }
        //Finalmente comprobamos si ha sumado 5 el contador porque ha encontrado las 5 vocales. 
        if(cont == 5){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        sc = new java.util.Scanner(System.in);
        int n_p = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n_p; i++){
            problema();
        }
        sc.close();
    }

}
//Ejercicio Resuelto, funciona correctamente.
