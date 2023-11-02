public class CAP05EJ37 {
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
    public static void convertirPalotes(){
        boolean salida=false;
        while (!salida) {
            for (int i=0; i<; i++) {
                
            }
        }
    }
    public static void main(String[] args) {
        boolean validado=false;
        while(!validado){
            long valor = solicitaValor("Por favor, introduzca un número entero positivo: ","Error.");
            if(valor < 0){
                System.out.println("Error");
            }
            else validado = true;
        }
    }
}
