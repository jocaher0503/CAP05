public class CAP05EJ26 {
    public static void main(String[] args) {
      System.out.print("Introduzca un número entero: ");
      long numeroIntroducido = Integer.parseInt(System.console().readLine());
      System.out.print("Introduzca un dígito: ");
      int digito = Integer.parseInt(System.console().readLine());
      System.out.print("Contando de izquierda a derecha, el " + digito + " aparece dentro de " + numeroIntroducido + " en las siguientes posiciones: ");
      long numero = numeroIntroducido;
      numero = numero * 10 + 1;
      long volteado = 0;
      int longitud = 0;
      int posicion = 1;
    if (numero == 0) {
      longitud = 1;
    }
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    } 
    while (volteado != 1) {
      if ((volteado % 10) == digito) {
        System.out.print(posicion + " ");
      }
    volteado /= 10;
    posicion++;
    } 
    System.out.println();
  }
}
