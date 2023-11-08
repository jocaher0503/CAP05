public class CAP05EJ59 {
    public static void piramide(int altura, String caracter, boolean inversa){
        int direccion = (inversa)?-1:1;
        int primera = (inversa)?altura:1;
        int ultima = (inversa)?1:altura;
        
        for(int i=primera; inversa?i>=ultima:i<=ultima; i=i+direccion){
            for(int j=1;j<=(altura-i);j++){
                System.out.print(" ");
            }
            System.out.print(caracter);
            String relleno = (i==ultima)?("^"):(" ");
            if(i>1){
                for(int j=2;j<=(2*i-1)-1;j++){
                    System.out.print(relleno);
                }
                System.out.print(caracter);
            }

            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int altura = 11;
        for(int i=1; i<=((2*altura)-1)/2;i++)
            System.out.print(" ");
        System.out.println("*");
        piramide(11,"^", false);
        for(int i=1; i<=((2*altura)-1)/2;i++)
            System.out.print(" ");
        System.out.print("Y");
    }
}
