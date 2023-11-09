public class CAP05EJ61 {
    public static void imprimirV(int altura){
        for(int i=1; i<=altura; i++){
            for(int j=1; j<=i-1; j++)
                System.out.print(" ");
            for(int j=; j; j++)
                System.out.print("***");
        }
        System.out.println("La altura introducida es incorrecta");
    }
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la V (mayor o igual a 3): ");
        int altura=Integer.parseInt(System.console().readLine());
        imprimirV(altura);
    }
}
