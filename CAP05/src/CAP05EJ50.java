public class CAP05EJ50 {
    public static void parte1(int espacios){
        String format = "*%"+espacios+"s****%"+espacios+"s****%n";
        System.out.printf(format," "," ");
    }
    public static void parte2(int espacios){
        String format = "*%"+espacios+"s*%"+(espacios+3)+"s*%n";
        System.out.printf(format," "," ");
    }
    public static void parte3(int espacios){
        String format = "*%"+(espacios+3)+"s*%"+(espacios+3)+"s*%n";
        System.out.printf(format," "," ");
    }
    public static void main(String[] args) {
        System.out.println("Introduzca la altura (5 como mínimo): ");
        int altura = Integer.parseInt(System.console().readLine());
        if(altura<5)
            System.out.println("La altura debe ser mayor o igual a 5");
        else{
            System.out.print("Introduzca el número de espacios entre los números (1 como mínimo): ");
            int espacios = Integer.parseInt(System.console().readLine());
            parte1(espacios);
            parte2(espacios);
            parte1(espacios);
            for(int i = 1; i<=altura-4;i++)
                parte3(espacios);
            parte1(espacios);
        }
    }
}
