public class CAP05EJ51 {
    public static long voltea(long valor){
        long alreves = 0;
        boolean salida = false;
        while(!salida){
            int digito = (int) (valor%10);
            alreves=alreves*10 + digito;
            if(valor<10)
                salida = true;
            else
                valor = valor/10;
        }
        return alreves;
    }
    public static long comeGusano(long valor){
        long ret= 0;
        while (valor!=0) {
            int digito=(int)(valor%10);
            if(digito!=0 && digito!=8){
                ret=ret*10+digito;
            }
            valor/=10;
        }
        return ret;
    }
    public static void main(String[] args) {
        System.out.print("Introduzca un número entero (mayor que cero): ");
        long valor=Long.parseLong(System.console().readLine());
        System.out.printf("Después de haber sido por el gusano númerico queda así %d", comeGusano(voltea(valor)));
    }
}