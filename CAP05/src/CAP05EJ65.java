public class CAP05EJ65 {
    public static void imprimirA(int altura, int fila){
        for(int i=1; i<=altura; i++){
            String hueco=(i==fila)?"*":" ";
            for(int j=1; j<=altura; j++)
                System.out.print(" ");
            System.out.print("*");
            for(int j=1; j<=2*i-3; j++)
                System.out.print(hueco);
            if(fila!=1)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la A (que sea mayor o igaul a 3): ");
        int altura=Integer.parseInt(System.console().readLine());
        if(altura>=3){
            System.out.printf("Introduzca la fila del palito horizontal (entre 2 y "")
        }
    }
}
