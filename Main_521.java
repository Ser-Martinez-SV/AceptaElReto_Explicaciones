public class Main_521 {
    static java.util.Scanner sc;
    public static void problema(String[] datos){
        
        int pisos = Integer.parseInt(datos[0]);
        int letras = Integer.parseInt(datos[1]);
        int asistentes = Integer.parseInt(datos[2]);
        int med = 0;
        
        if ((pisos*letras) % 2 != 0){
            med = (pisos*letras+1)/2;
        }else{
            med = pisos*letras/2;
        }
        
        String[] asis = sc.nextLine().split(" ");
        
        if(asistentes >= med){
            int[][] m = new int[pisos][letras];
            int cont = 0;
            char letra = 'A';
            
            for (int i = 0; i < asis.length; i+=2){
                letra = asis[i+1].charAt(0);
                if (m[Integer.parseInt(asis[i])-1][(letra-'0')-17] == 0){
                    
                    m[Integer.parseInt(asis[i])-1][(letra-'0')-17] = 1;
                    cont++;
                    
                }
            }
            if (cont >= med){
                System.out.println("EMPEZAMOS");
            }else{
                System.out.println("ESPERAMOS");
            }
        }else{
            System.out.println("ESPERAMOS");
        }
    }
    public static void main(String[] args) {
        sc = new java.util.Scanner(System.in);
        String[] datos = sc.nextLine().split(" ");
        
        while (!(datos[0].equals("0") && datos[1].equals("0") && datos[1].equals("0"))){
            problema(datos);
            datos = sc.nextLine().split(" ");
        }
    }
}
//Funciona Correctamente. Ejercicio resuelto.
