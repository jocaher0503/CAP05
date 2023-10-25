public class CAP05EJ13 {
  public static void main(String[] args) {
    System.out.println("Por favor, introduzca 10 números enteros: ");
    int negativos = 0;
    int positivos = 0;
    try{
    for (int i = 0; i < 10; i++) {
      if (Integer.parseInt(System.console().readLine()) < 0) {
        negativos++;
      } else {
        positivos++;
      }
    }
  }
    catch(Exception e){
      System.out.println("Lo siento no le he entendido, intentelo de nuevo.");
  }
    System.out.println("Ha introducido " + positivos + " números positivos y " + negativos + " números negativos.");
  }
}
