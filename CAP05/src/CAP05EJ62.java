public class CAP05EJ62 {
    public static boolean chequeaSuerte(long valor) {
        boolean res=false;
        int buena=0;
        int mala=0;
        while (valor!=0) {
            switch ((int)(valor%10)) {
                case 3,7,8,9:
                    buena++;
                    break;
                default:
                    mala++;
                    break;
            }
            valor/=10;
        }
        return buena>mala;
    }
    public static void main(String[] args) {
        System.out.print("Introduzca un número: ");
        long valor=Long.parseLong(System.console().readLine());
        boolean afortunado=chequeaSuerte(valor);
        System.out.printf("El %d %s es un número afortunado", valor,afortunado?"":"no");
    }
}
