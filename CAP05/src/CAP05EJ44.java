public class CAP05EJ44 {
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
    public static long izquierda(long valor, int posicion){
        valor = voltea(valor);
        int contador = 1;
        long res = 0;
        while(valor!=0 && contador<posicion){
            res=res*10+(valor%10);
            contador++;
            valor/=10;
        }
        return res;
    }
    public static long derecha(long valor, int posicion){
        valor = valor*10+1;
        valor = voltea(valor);
        int contador = 1;
        long res = 0;
        while(valor!=0){
            if(contador>=posicion)
                res=res*10+(valor%10);
            contador++;
            valor/=10;
        }
        return res/10;
    }
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long valor = Long.parseLong(System.console().readLine());
        System.out.print("Introduzca la posición donde quiere insertar: ");
        int pos = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el dígito que quiere insertar: ");
        int digito = Integer.parseInt(System.console().readLine());
        System.out.printf("El número resultante es %s.", ""+izquierda(valor,pos)+digito+derecha(valor,pos));
    }
}