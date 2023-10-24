public class CAP05EJ14 {
  public static void main(String[] args) {
    System.out.println("Este programa realiza el cálculo de una potencia");
    System.out.println("-------------------------------------------------");
    System.out.print("Introduzca la base: ");
    int base = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());
    int potencia = 1;
    if (exponente == 0) {
      potencia = 1;
    }
    if (exponente > 0) {
      for (int i = 0; i < exponente; i++) {
        potencia *= base;
      }
    }
    if (exponente < 0) {
      for (int i = 0; i < -exponente; i++) {
        potencia *= base;
      }
      potencia = 1/potencia;
    }
    System.out.println(base + "^" + exponente + " = " + potencia);
  }
}
