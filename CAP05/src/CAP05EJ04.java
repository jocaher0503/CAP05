public class CAP05EJ04 {
    public static void main(String[] args) {
        int intervaloMax=320;
        int intervaloMin=160;
        int salto=20;
        for (int i =intervaloMax; i>=intervaloMin; i-=salto) {
            System.out.println(i);
        }
    }
}
