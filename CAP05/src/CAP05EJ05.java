public class CAP05EJ05 {
    public static void main(String[] args) {
        int intervaloMax=320;
        int intervaloMin=160;
        int salto=20;
        int i=intervaloMax;
        while(i>=intervaloMin){
            System.out.println(i);
            i-=salto;
        }
    }
}