public class CAP05EJ41 {
    public static int cuentaPares(long valor){
        int contador = 0;
        while(valor!=0){
            if((valor%10)%2==0)
                contador++;
            valor/=10;
        }
        return contador;
    }
    public static int cuentaImpares(long valor){
        int contador = 0;
        while(valor!=0){
            if((valor%10)%2!=0)
                contador++;
            valor/=10;
        }
        return contador;
    }
    public static void main(String[] args) {
        System.out.println("Por favor, introduzca un número entero positivo: ");
        long valor = Long.parseLong(System.console().readLine());
        System.out.printf("El %d contiene %d dígitos pares y %d dígitos impares.", valor, cuentaPares(valor), cuentaImpares(valor));
    }
}
