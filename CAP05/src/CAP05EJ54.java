public class CAP05EJ54 {
    public static void imprimeTrianguloHueco(int altura) {
        for(int i=0; i<altura; i++){
            String caracter = (i==0)?"*":" ";
            System.out.print("*");
            for(int j=1;j<=altura-i-2; j++)
                System.out.print(caracter);
            if(i!=altura-1)
                System.out.print("*");
            System.out.println();    

        }
    }

    public static void main(String[] args) {
        System.out.println("Introduzca la altura de la figura: ");
        int altura = Integer.parseInt(System.console().readLine());
        imprimeTrianguloHueco(altura);
    }
}