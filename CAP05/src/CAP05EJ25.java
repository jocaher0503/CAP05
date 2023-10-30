public class CAP05EJ25 {
  public static int voltea (int valor){
    int alreves=0;
    boolean salida= false;
    while (!salida) {
      int digito=valor%10;
      alreves=alreves*10 + digito;
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
    System.out.print("Si le damos la vuelta al"+ valor +" tenemos el "+ voltea(valor));
  }
}
