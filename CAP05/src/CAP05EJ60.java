public class CAP05EJ60 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de los calcetines (mayor o igual a 4): ");
        int altura=Integer.parseInt(System.console().readLine());
        for(int i=1; i<=altura-2; i++)
        System.out.println("***     ***");
        System.out.print("******  ******\n******  ******");
    }
}
