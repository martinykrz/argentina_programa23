import java.util.Random;

class ejercicio_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int base = 489083;
        int ingresos_mensuales = rand.nextInt(2*base);
        int vehiculos = rand.nextInt(10);
        int inmuebles = rand.nextInt(5);
        boolean extra = rand.nextInt(base) % 2 == 0;
        System.out.println("Ingresos mensuales: "+ingresos_mensuales);
        System.out.println("Vehiculos: "+vehiculos);
        System.out.println("Inmuebles: "+inmuebles);
        System.out.println("Otras condiciones: "+extra);
        if ((ingresos_mensuales > base) || (vehiculos >= 3) || (inmuebles >= 3) || extra) {
            System.out.println("Sos de ingresos altos");
        } else {
            System.out.println("No sos de ingresos altos");
        }
    }
}
