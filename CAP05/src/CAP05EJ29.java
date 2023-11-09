public class CAP05EJ29 {
    public static void main(String[] args) {
    System.out.print("Introduzca un número entero positivo, más o menos grande: ");
    int numeroGrande = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca otro número, que sea pequeño: ");
    int numeroPequeño = Integer.parseInt(System.console().readLine());
    System.out.println("Los números enteros positivos menores que " + numeroGrande +" que no son divisibles entre " + numeroPequeño + " son los siguientes:");
    for (int i = 1; i < numeroGrande; i++) {
        if ((i % numeroPequeño) != 0) {
        System.out.print(i + " ");
            }
        }
    }
}