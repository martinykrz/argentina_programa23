import java.util.Scanner; //User input

class ejercicio_1 {
    public static void main(String[] args) {
        Scanner numeroInicio = new Scanner(System.in);
        System.out.print("numeroInicio: ");
        int inicio = numeroInicio.nextInt();
        Scanner numeroFin = new Scanner(System.in);
        System.out.print("numeroFin: ");
        int fin = numeroFin.nextInt();
        a(inicio, fin);
        b(inicio, fin);
        c(inicio, fin, true);
        c(inicio, fin, false);
        d(inicio, fin);
        numeroInicio.close();
        numeroFin.close();
    }

    public static void a(int numeroInicio, int numeroFin) {
        System.out.println("1a");
        while (numeroInicio <= numeroFin) {
            System.out.print(numeroInicio);
            numeroInicio++;
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void b(int numeroInicio, int numeroFin) {
        System.out.println("1b");
        while (numeroInicio <= numeroFin) {
            if (numeroInicio % 2 == 0) {
                System.out.print(numeroInicio);
            }
            numeroInicio++;
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void c(int numeroInicio, int numeroFin, boolean verPar) {
        System.out.println("1c");
        System.out.println("verPar: " + verPar);
        while (numeroInicio <= numeroFin) {
            if (verPar) {
                if (numeroInicio % 2 == 0) {
                    System.out.print(numeroInicio);
                    System.out.print(" ");
                }
            } else {
                if (numeroInicio % 2 == 1) {
                    System.out.print(numeroInicio);
                    System.out.print(" ");
                }
            }
            numeroInicio++;
        }
        System.out.println();
    }

    public static void d(int numeroInicio, int numeroFin) {
        System.out.println("1d");
        for (int i=numeroFin; i >= numeroInicio; i--) {
            if (i % 2 == 0) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
