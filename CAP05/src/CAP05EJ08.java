public class CAP05EJ08 {
    /** tablaDeMultiplicarDel
     * 
     * Imprime por pantalla la tabla de multiplicar del valor suministrado
     * Salida:
     * n x 0=0
     * n x 1=...
     * ...
     * n x 10=...
     * @param num Indica que tabla imprimir
     */
    public static void tablaDeMultiplicarDel(int num){
        for(int i=0; i<=10;i++){
            System.out.printf("%d x %d = %d", num, i, num*i);
        }
    }
    public static void main(String[] args) {
        boolean correcto= false;
        while(!correcto){
            try{
                System.out.print("Introduzca un número y le mostraré su tabla de multiplicar: ");
                int num= Integer.parseInt(System.console().readLine());
                tablaDeMultiplicarDel(num);
                correcto=true;
            } catch(Exception e){
            System.out.println("Lo siento no le he entendido, pruebe otra vez.");
            }
        }
    }
}
