public class CAP05EJ63 {
    public static void imprimeFilaPiramide(int fila, int altura){
        if(fila>0){
            for(int i = 1; i<=altura-fila; i++){
                System.out.print(" ");
            }
            for(int i=1;i<=(2*fila-1);i++){
                System.out.print("*");
            }
            for(int i = 1; i<=altura-fila; i++){
                System.out.print(" ");
            }
            System.out.print(" ");
        }
        else{
            for(int i = 1; i<=2*altura;i++)
                System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        int alt1=10, alt2=20;
        int diferencia = Math.abs(alt1-alt2); 
        int inicio = -(diferencia)+1;
        int iteraciones = Math.max(alt1, alt2);
        for(int i=inicio;i<(inicio+iteraciones);i++){
            if(alt1>alt2){
                imprimeFilaPiramide(i+diferencia, alt1);
                imprimeFilaPiramide(i, alt2);
            }
            else if(alt1 < alt2){
                imprimeFilaPiramide(i, alt1);
                imprimeFilaPiramide(i+diferencia, alt2);
            } else{
                imprimeFilaPiramide(i, alt1);
                imprimeFilaPiramide(i, alt2);
            }
            System.out.println();
        }   
    }
}
