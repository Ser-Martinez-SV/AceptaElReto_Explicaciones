public class Main_582 {
    static java.util.Scanner sc;
    public static void casoDePrueba() {
        
        String campanas = sc.nextLine();
        
        if (campanas.isEmpty()){
            System.out.println("MARISA NARANJO");
        }else {
            String[] listCampanas = campanas.split(" ");
            if (listCampanas.length == 12 && !campanas.contains("ding-dong")){
                System.out.println("CORRECTO");
            }else if (listCampanas.length < 12){
                System.out.println("TARDE");
            }else{
                System.out.println("SALIDA NULA");
            }
        }
    }
    
    public static void main(String[] args) {
        sc = new java.util.Scanner(System.in);
        
        int nPruebas = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < nPruebas; i++) {
            casoDePrueba();
        }
    }
}
//Ejercicio Resuelto, funciona correctamente.
