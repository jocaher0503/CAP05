public class CAP05EJ56 {
    public static void imprimeTriangulo(int altura){
        for (int i=1; i<=altura-1; i++) {
            for(int j=1; j<=i; j++)
                System.out.print(" ");
            for(int j=1; j<=altura-1; j++)
                System.out.print("*");
        System.out.println();
        }
    }
    public static void main(String[] args) {
        
    }
}
