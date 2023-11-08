public class CAP05EJ55 {
    public static int largo(long valor){
        int contador = 0;
        while(valor!=0){
            contador++;
            valor/=10;
        }
        return contador;
    }
    public static long rotaDcha(long valor){
        int longitud = largo(valor);
        int ultimo = (int)(valor%10);
        long resto = valor/10;
        return (long)(ultimo*Math.pow(10, longitud-1))+resto;
    }
    public static void main(String[] args) {
        System.out.print("Introduzca un número: ");
        long valor = Long.parseLong(System.console().readLine());
        System.out.printf("El número resultado es %d.", rotaDcha(valor));
    }
}
