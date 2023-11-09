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
        }
        else{
            for(int i = 1; i<=2*altura-1;i++)
                System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        int alt1=5, alt2=10;
        int diferencia = Math.abs(alt1-alt2); 
        int inicio = -(diferencia);
        int iteraciones = Math.max(alt1, alt2);
        for(int i=inicio;i<(inicio+iteraciones);i++){
            if(alt1>alt2){
                imprimeFilaPiramide(i+diferencia+1, alt1);
                imprimeFilaPiramide(i+1, alt2);
            }
            else if(alt1 < alt2){
                imprimeFilaPiramide(i+1, alt1);
                imprimeFilaPiramide(i+diferencia+1, alt2);
            } else{
                imprimeFilaPiramide(i+1, alt1);
                imprimeFilaPiramide(i+1, alt2);
            }
            System.out.println();
        }   
    }
}
