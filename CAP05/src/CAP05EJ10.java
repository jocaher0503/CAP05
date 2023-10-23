public class CAP05EJ10 {
    public static void main(String[] args) {
        boolean salir =false;
        System.out.print("Introduzca números: ");
        float num=0f;
        float suma=0f;
        int valores=0;
        while (!salir) {
            num= Float.parseFloat(System.console().readLine());
            if(num>0)
                salir=true;
            else
                valores++;
                suma+=num;
        }
        System.out.printf("La media de los número pistivos introducidos es %.2f", suma/valores);
    }
}
