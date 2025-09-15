public class Main_300 {
    static java.util.Scanner sc;
    
    public static void problema(){
        String palabra = sc.nextLine();
        char[] vocales = {'a','e','i','o','u'};
        int cont = 0;
        
        for (char vocal:vocales){
            if (palabra.indexOf(vocal) == -1){
                continue;
            }else{
                cont++;
            }
        }
        
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
