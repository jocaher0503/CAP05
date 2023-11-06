public class CAP05EJ49 {
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
    public static void main(String[] args) {
        boolean salir = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double media = 0;
        int contador = 0;
        System.out.println("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo: ");
        while(!salir){
            
            int valor = Integer.parseInt(System.console().readLine());
            
            if(esPrimo(valor))
                salir = true;
            else{
                contador++;
                if(valor>max)
                    max = valor;
                if(valor<min)
                    min = valor;
                media+=valor;
            }
        }
        System.out.printf("Ha introducido %d números no primos.%n", contador);
        System.out.printf("Máximo: %d%n", max);
        System.out.printf("Mínimo: %d%n", min);
        System.out.printf("Media: %.2f%n", media/contador);
    }
}