public class CAP05EJ02 {
    public static void main(String[] args) {
        int intervaloMin=0;
        int intervaloMax=100;
        int multiplos=5;
        int i=intervaloMin;
        while (i<=intervaloMax) {
            if (i%multiplos==0)
            System.out.println(i);
            i++;
        }
        }
    }
