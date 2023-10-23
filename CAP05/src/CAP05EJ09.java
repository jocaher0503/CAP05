public class CAP05EJ09 {
    public static int LongitudDeUnNumero(int num){
        int longitud=0;
        while (num/10!=0) {
            num=num/10;
            longitud++;
        }
        return ++longitud;
    }
    public static void main(String[] args) {
        boolean correcto= false;
        int num=0;
        while(!correcto){
            try{
                System.out.print("Introduzca un número y le mostraré su tabla de multiplicar: ");
                num= Integer.parseInt(System.console().readLine());
                correcto=true;
            } catch(Exception e){
            System.out.println("Lo siento no le he entendido, pruebe otra vez.");
            }
        }
        System.out.printf("%d tiene %d dígitos/s", num, LongitudDeUnNumero(num));
    }
}
