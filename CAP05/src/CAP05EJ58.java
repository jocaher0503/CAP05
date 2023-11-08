public class CAP05EJ58 {
    public static double mediaDigitos(long valor){
        double suma = 0;
        int longitud = 0;
        while(valor!=0){
            suma += valor%10;
            valor/=10;
            longitud++;
        }
        return suma/longitud;
    }
    public static void main(String[] args) {
        System.out.print("Introduzca un número: ");
        long valor = Long.parseLong(System.console().readLine());
        System.out.printf("La media de sus dígitos es %.1f", mediaDigitos(valor));
    }
}