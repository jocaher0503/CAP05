public class CAP05EJ37 {
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
    public static void convertirPalotes(int valor){
        boolean salida=false;
        int digito;
        while (!salida) {
            if(valor>=0){
                digito=(valor%10);
            for(int i=1; i>=digito-1; i++)
                digito=valor%10;
                valor=valor/10;
            for(int j=1; j<=digito; j++)
                System.out.print("|");
            }
            if (valor>0){
                System.out.print("-");
            }
            else salida=true;
        }
    }
    public static void main(String[] args){
        System.out.print("Introduzca un número entero positivo: ");
        int valor=Integer.parseInt(System.console().readLine());
        voltea(valor);convertirPalotes(valor);
    }
}
