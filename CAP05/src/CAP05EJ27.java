public class CAP05EJ27 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número entero que sea mayor que 1: ");
        int numeroIntroducido=Integer.parseInt(System.console().readLine());
        int contar=0;
        int suma=0;
        for (int i=1; i<numeroIntroducido; i++) {
            if ((i % 3) == 0) {
                System.out.print(i + " ");
                contar++;
                suma += i;
              }
            }
            System.out.print("\nDesde 1 hasta " + numeroIntroducido + " hay " + contar + " múltiplos de 3 y entre ellos suman " + suma + ".");
          }
        }