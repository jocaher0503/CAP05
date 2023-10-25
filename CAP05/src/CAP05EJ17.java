public class CAP05EJ17 {
  public static void main(String[] args) {
    int NumeroIntroducido = 0;
    do {
      System.out.print("Introduzca un número entero positivo: ");
      NumeroIntroducido = Integer.parseInt(System.console().readLine());
    if(NumeroIntroducido < 0) {
      System.out.print("El número introducido no es correcto, debe introducir un número positivo.");
      }
    } while (NumeroIntroducido < 0);
    int suma = 0;
    for(int i = NumeroIntroducido; i < NumeroIntroducido + 100; i++) {
      suma += i;
    }
    System.out.print("La suma de los 100 números siguientes a "+ NumeroIntroducido + " es " + suma + ".");
  }
}
