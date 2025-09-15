public class Main_409 {
    
    static java.util.Scanner sc;
    static java.util.Arrays Arrays;
    
    public static int[] ordenar(String[] pers){
        
        int [] new_pers = new int[pers.length];
        
        for (int i = 0; i < pers.length; i++) {
            new_pers[i] = Integer.parseInt(pers[i]);
        }
        
        java.util.Arrays.sort(new_pers);
        return new_pers;
    }
    public static void problema(){
        
        String[] datos = sc.nextLine().split(" ");
        int caste  = Integer.parseInt(datos[0]);
        int[] personas = ordenar(sc.nextLine().split(" "));
        int cont = 0;
        int comprobador = -1;
        
        for (int i = 0; i < (personas.length - caste + 1); i++) {
            if ( comprobador < i && ((personas[i] + 15) >= personas[i+caste-1])){
                cont++;
                comprobador = i+caste-1;
            }
        }
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
