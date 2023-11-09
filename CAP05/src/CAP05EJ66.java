public class CAP05EJ66 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la figura: ");
        int altura=Integer.parseInt(System.console().readLine());
        int i=0;
        boolean segunda=false;
        while (i>=0) {
            for(int j=1; j<=i; j++)
                System.out.print(" ");
            System.out.println("*    *");
            if(!segunda && i<(altura/2))
                i++;
            else {
                segunda=true;
                i--;
            }
        }
    }
}
