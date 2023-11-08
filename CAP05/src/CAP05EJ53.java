public class CAP05EJ53 {
    public static void imprimeTriangulo(int altura) {
        for(int i=0; i<altura; i++){
            for(int j=1;j<=altura-i; j++)
                System.out.print("*");
            System.out.println();    

        }
    }
    public static void main(String[] args) {
        System.out.println("Introduzca la altura de la figura: ");
        int altura = Integer.parseInt(System.console().readLine());
        imprimeTriangulo(altura);
    }
}