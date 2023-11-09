public class CAP05EJ11 {
    public static int LongitudDeUnNumero(int num){
        int longitud=0;
        while (num/10!=0) {
            num=num/10;
            longitud++;
        }
        return ++longitud;
    }
    public static void main(String[] args) {
        System.out.print("Introduzca un número: ");
        int num= Integer.parseInt(System.console().readLine());
        int LongitudMayor=LongitudDeUnNumero((int)Math.pow(num+4, 3));
        if(LongitudMayor%2==0)
            LongitudMayor+=1;
        System.out.printf("%"+(LongitudMayor-2)/2+"s%s%"+(LongitudMayor-2)/2+"s|"
                            +"%"+(LongitudMayor-2)/2+"s%s%"+(LongitudMayor-2)/2+"s|"+
                            "%"+(LongitudMayor-2)/2+"s%s%n", 
                    "","n ","","","n\u00b2","","", "n\u00b3");
        for (int i = 0; i<((LongitudMayor)*3+2); i++) 
            System.out.print("-");
        System.out.println();
        for (int i=num; i<num+5; i++) {
            System.out.printf("%"+(LongitudMayor-1)+"d |"+
                                "%"+(LongitudMayor-1)+"d |"+
                                "%"+(LongitudMayor-1)+"d %n",num, num*num, num*num*num);
        }
    }
}
