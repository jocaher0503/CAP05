public class CAP05EJ42 {
    public static boolean esPrimo(int valor){
        if(valor<=1)
            return false;
        boolean primo = true;
        for(int i=2; primo && i <=valor/2 ; i++){
            if(valor%i==0)
                primo = false;
        }
        return primo;
    }
    public static void imprimeSiguientesPrimos(int valor, int n){
        for(int i = valor; i<valor+n; i++)
            System.out.printf("%d %s%n",i, (esPrimo(i)?"es primo":"no es primo"));
    }
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número entero positivo: ");
        int valor = Integer.parseInt(System.console().readLine());
        imprimeSiguientesPrimos(valor, 5);
    }
}
