public class CAP05EJ61 {
    public static void alturaV(int altura){
        if (altura>=3) {
            for(int i=1; i<=altura; i++){
                
            }
        }else
        System.out.println("La altura introducida es incorrecta");
    }
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la V (mayor o igual a 3): ");
        int altura=Integer.parseInt(System.console().readLine());
        alturaV(altura);
    }
}
