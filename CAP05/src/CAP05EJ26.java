public class CAP05EJ26 {
  public static void imprimePosiciones(int valor, int digito){
    boolean salida=false;
    int posicion=1;
    while (!salida) {
      int actual=valor%10;
      if(actual==digito)
        System.out.print(posicion+" ");
      posicion++;
      if (valor<10)
        salida=true;
      else
        valor=valor/10;
    }
  }
  public static int voltea (int valor){
    int alreves=0;
    boolean salida= false;
    while (!salida) {
      int digito=valor%10;
      System.out.print(digito);
      if (valor<10)
        salida=true;
      else
        valor=valor/10;
    }
    return alreves;
  }
    public static void main(String[] args) {
      System.out.print("Introduzca un número entero: ");
      int valor = Integer.parseInt(System.console().readLine());
      System.out.print("Introduzca un dígito: ");
      int digito = Integer.parseInt(System.console().readLine());
      System.out.print("Contando de izquierda a derecha, el " + digito + " aparece dentro de " + valor + " en las siguientes posiciones: ");
      valor=voltea(digito);
      imprimePosiciones(valor, digito);
    }
  }