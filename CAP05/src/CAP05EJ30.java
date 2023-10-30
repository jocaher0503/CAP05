public class CAP05EJ30 {
    public static void main(String[] args) {
    int primerDia = 0;
    int segundoDia = 0;
    int primeraHora = 0;
    int segundaHora = 0;
    String primerDiaString;
    String segundoDiaString;
    String nombrePrimerDia = "";
    String nombreSegundoDia = "";
    boolean datosCorrectos = true;
    do {
        System.out.println("\nPor favor, introduzca el primer día y la primera hora.");
        boolean diaCorrecto;

    do {
        diaCorrecto = true;
        System.out.print("Día 1: ");
        primerDiaString = System.console().readLine();
        switch (primerDiaString) {
            case "Lunes":
            case "1":
                primerDia = 1;
                nombrePrimerDia = "Lunes";
            break;
            case "Martes":
            case "2":
                primerDia = 2;
                nombrePrimerDia = "Martes";
            break;
            case "Miércoles":
            case "3":
                primerDia = 3;
                nombrePrimerDia = "Miercoles";
            break;
            case "Jueves":
            case "4":
                primerDia = 4;
                nombrePrimerDia = "Jueves";
            break;
            case "Viernes":
            case "5":
                primerDia = 5;
                nombrePrimerDia = "Viernes";
            break;
            case "Sábado":
            case "6":
                primerDia = 6;
                nombrePrimerDia = "Sábado";
            break;
            case "Domingo":
            case "7":
                primerDia = 7;
                nombrePrimerDia = "Domingo";
            break;
            default:
                diaCorrecto = false;
        }
        if (!diaCorrecto) {
            System.out.println("No se ha introducido correctamente el día de la semana, los días válidos son: Lunes, Martes, Miércoles, Jueves, Viernes, Sábado y Domingo.");
        }
        } while (!diaCorrecto);
            boolean horaCorrecta;
            do {
            horaCorrecta = true;
            System.out.print("Hora 1: ");
            primeraHora = Integer.parseInt(System.console().readLine());
            if ((primeraHora < 0) || (primeraHora > 23)) {
            System.out.println("No se ha introducido correctamente la hora del día, las horas válidas están entre 0 y 23.");
            horaCorrecta = false;
        }
        } while (!horaCorrecta);
        System.out.println("Por favor, introduzca el segundo día y la segunda hora.");
        do {
            datosCorrectos = true;
            diaCorrecto = true;
            System.out.print("Día 2: ");
            segundoDiaString = System.console().readLine();
        switch (segundoDiaString) {
            case "Lunes":
            case "1":
                segundoDia = 1;
                nombreSegundoDia = "Lunes";
            break;
            case "Martes":
            case "2":
                segundoDia = 2;
                nombreSegundoDia = "Martes";
            break;
            case "Miércoles":
            case "3":
                segundoDia = 3;
                nombreSegundoDia = "Miércoles";
            break;
            case "Jueves":
            case "4":
                segundoDia = 4;
                nombreSegundoDia = "Jueves";
            break;
            case "Viernes":
            case "5":
                segundoDia = 5;
                nombreSegundoDia = "Viernes";
            break;
            case "Sábado":
            case "6":
                segundoDia = 6;
                nombreSegundoDia = "Sábado";
            break;
            case "Domingo":
            case "7":
                segundoDia = 7;
                nombreSegundoDia = "Domingo";
            break;
            default:
                segundoDia = 0;
        }
        if (!diaCorrecto) {
            System.out.println("No se ha introducido correctamente el día de la semana, los días válidos son: Lunes, Martes, Miércoles, Jueves, Viernes, Sábado y Domingo.");
        }
        } while (!diaCorrecto);
        if (segundoDia <= primerDia) {
            System.out.println("El segundo día debe ser posterior al primero.");
            datosCorrectos = false;
        }
        if (datosCorrectos) {
        do {
            horaCorrecta = true;
            System.out.print("Hora 2: ");
            segundaHora = Integer.parseInt(System.console().readLine());
            if ((segundaHora < 0) || (segundaHora > 23)) {
            System.out.println("No se ha introducido correctamente la hora del día, las horas válidas están entre 0 y 23.");
            horaCorrecta = false;
            }
        } while (!horaCorrecta);
    }
        } while (!datosCorrectos);
    System.out.print("Entre las " + primeraHora + ":00h del " + nombrePrimerDia + " y las " + segundaHora + ":00h del " + nombreSegundoDia + " hay " + (((segundoDia * 24) + segundaHora) - ((primerDia * 24) + primeraHora)) + " hora/s.");
    }
}