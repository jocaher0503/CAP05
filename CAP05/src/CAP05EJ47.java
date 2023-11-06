public class CAP05EJ47 {
    public static void imprimirRectangulo(int base, int altura){
        for(int i = 1; i<=altura; i++){
            System.out.print("M");
            String caracter = (i==1 || i==(altura/2+1) || i==altura)?"M":" ";
            for(int j = 1; j <= base-2; j++)
                System.out.print(caracter);
            
            System.out.println("M");
        }
    }
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca la anchura del rectángulo (como mínimo 2): ");
        int base = Integer.parseInt(System.console().readLine());
        System.out.print("Por favor, introduzca la altura del rectángulo (como mínimo 2): ");
        int altura = Integer.parseInt(System.console().readLine());
        if(base<2 || altura<2)
            System.out.print("Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altura es 2.");
        else
            imprimirRectangulo(base, altura);
    }
}