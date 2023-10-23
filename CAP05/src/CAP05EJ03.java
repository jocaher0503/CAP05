public class CAP05EJ03 {
    public static void main(String[] args) {
        int intervaloMin=0;
        int intervaloMax=100;
        int multiplos=5;
        int i=intervaloMin;
        do{ 
            if (i%multiplos==0)
            System.out.println(i);
            i++;}
        while (i<=intervaloMax);
        }
}

