public class CAP05EJ25 {
  //Esto es por si me hace falta en otro ejercicio
  
  public static int longitud(int valor){
    int retorno=0;
    boolean salida= false;
    while (!salida) {
      retorno++;
      if (valor<10)
        salida=true;
      else
        valor=valor/10;
    }
    return retorno;
  }



  //Este es el ejercicio

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
