public class CAP05EJ38 {
    public static void piramide(int desde, int hasta, int altura){
        int fila = desde;
        int direccion = desde>hasta?-1:1;
        boolean salir = false;
        while(!salir){
            for(int j=1; j<=altura-fila; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*fila-1); j++){
                System.out.print("*");
            }
            if(fila==hasta)
                salir = true;
            else
                fila += direccion; 
            System.out.println();
        } 
    }
    public static void reloj1(int alturaReloj){
        int altura = alturaReloj/2+1;
        int fila = altura;
        int direccion = -1;
        boolean salir = false;
        while(!salir){
            for(int j=1; j<=altura-fila; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*fila-1); j++){
                System.out.print("*");
            }
            fila += direccion;
            if(fila==1)
                direccion = 1;
            System.out.println();
            salir = fila > altura; 
        }
    }
    public static void reloj2(int alturaReloj){
        piramide(alturaReloj/2+1, 1, alturaReloj/2+1);
        piramide(2, alturaReloj/2+1, alturaReloj/2+1);
    }
    public static void reloj3(int alturaReloj){        for(int i=1; i<=alturaReloj; i++){
            for(int j=1; j<=alturaReloj; j++){
                if(i+j==alturaReloj+1 || 
                    i==j || 
                    (j < i &&
                    j > alturaReloj-i + 1)  ||
                    (j>i && j<=alturaReloj-i+1))
                    System.out.print("*");
                else    
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Por favor, introduzca la altura del reloj de arena: ");
        int alturaReloj = Integer.parseInt(System.console().readLine());
        System.out.println("Método 1");
        reloj1(alturaReloj);
        System.out.println("Método 2");
        reloj2(alturaReloj);
        System.out.println("Método 3");
        reloj3(alturaReloj);
        }
}
