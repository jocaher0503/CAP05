public class CAP05EJ64 {
    public static void menu(){
        System.out.println("1. Agrandarlo");
        System.out.println("2. Achicarlo");
        System.out.println("1. Cambiar la orientación");
        System.out.println("1. Salir");
    }
    public static void pintaRect(int base, int altura){
        for(int i=1; i<=altura; i++){
            for(int j=1; j<=base; j++){
                String caracter=(i==1 || i==altura || j==1 || j==base)?"*":" ";
                System.out.print(caracter);
    }
}
}
    public static void main(String[] args) {
        int base=6;
        int altura=3;
        boolean salir=false;
        while (!salir) {
            pintaRect(base, altura);;
            menu();
            System.out.print("");
            int opcion=Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1:
                base++;
                altura++;
                break;
                case 2:
                base=Math.max(0, base-1);
                altura--;
                break;
                case 3:
                int aux=base;
                base=altura;
                altura=aux;
                break;
                case 4:
                salir=true;
                break;
                default:
                System.out.print("No le he entendido.");
                    break;
            }
        }
    }
}
