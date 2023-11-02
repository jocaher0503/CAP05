public class CAP05EJ34 {
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
    public static long solicitaValor(String question, String error){
        boolean validado = false;
        long valor = 0;
        while(!validado){
            try {
                System.out.print(question);
                valor = Long.parseLong(System.console().readLine());
                validado = true;    
            } catch (Exception e) {
                System.out.println(error);
            }
        }
        return valor;
    }
    public static int longitud(long valor){
        boolean salida = false;
        int longitud = 0;
        while(!salida){
            longitud++;
            if(valor<10)
                salida = true;
            else
                valor = valor/10;
        }
        return longitud;
    }
    public static long mezclar(long num1, long num2){
        long mezcla = 0;
        boolean salida = false;

        while(!salida){
            int digito1 = (int) (num1%10);
            int digito2 = (int) (num2%10);
            mezcla = (mezcla*10+digito1)*10 + digito2;
            if(num1<10)
                salida = true;
            else{
                num1 = num1/10;
                num2 = num2/10;
            }
        }
        return mezcla;
    }

    public static String imprimirPares(long valor){
        String res="";
        boolean salida = false;

        while(!salida){
            int digito = (int) (valor%10);
            if(digito%2==0)
                res+=digito;
            if(valor<10)
                salida = true;
            else
                valor = valor/10;
        }
        return res;
    }

    public static String imprimirImpares(long valor){
        String res="";
        boolean salida = false;

        while(!salida){
            int digito = (int) (valor%10);
            if(digito%2!=0)
                res+=digito;
            if(valor<10)
                salida = true;
            else
                valor = valor/10;
        }
        return res;
    }
    
    public static void main(String[] args) {
        boolean validado=false;
        long num1=0, num2=0;
        while(!validado){
            num1 = voltea(solicitaValor("Por favor, introduzca un número: ", "Por favor, introduzca un número correcto"));
            num2 = voltea(solicitaValor("Por favor, introduzca un número: ", "Por favor, introduzca un número correcto"));
            if(longitud(num1)!=longitud(num2)){
                System.out.println("Por favor, introduzca dos números con el mismo número de cifras");
            }
            else
                validado = true;
        }
        long mezcla = voltea(mezclar(num1, num2));
        System.out.printf("El número formado por los dígitos pares es %s%n", imprimirPares(mezcla));
        System.out.printf("El número formado por los dígitos impares es %s%n", imprimirImpares(mezcla));
    }
}