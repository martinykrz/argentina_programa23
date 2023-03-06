import java.util.ArrayList;
import java.util.Scanner;

class Auto {
    int antiguedad;

    Auto(int año) {
        antiguedad = año;
    }
}

class Casa {
    int ingresos_mensuales;
    ArrayList<Auto> autos;
    int inmuebles;
    boolean extra;

    //TODO: Da error con cant_autos > 1
    Casa(int ing, int cant_autos, int inm, boolean ext) {
        ingresos_mensuales = ing;
        autos = new ArrayList<Auto>();
        for (int i=0; i < cant_autos; i++) {
            Scanner años = new Scanner(System.in);
            System.out.print("Antiguedad (en años) del auto " + (i+1) + ": ");
            int a = años.nextInt();
            Auto tmp = new Auto(a);
            autos.add(tmp);
            años.close();
        }
        inmuebles = inm;
        extra = ext;
    }

    boolean superior_a(int base) {
        return ingresos_mensuales >= base;
    }

    boolean vehiculos() {
        boolean res = autos.size() >= 3;
        for (int i=0; i < autos.size(); i++) {
            res &= autos.get(i).antiguedad < 5;
        }
        return res;
    }

    boolean cant_inmuebles() {
        return inmuebles >= 3;
    }

    boolean cond_extra() {
        return extra;
    }

    boolean resultados(int base) {
        return superior_a(base) || vehiculos() || cant_inmuebles() || cond_extra();
    }
}

class ejercicio_2 {
    public static void main(String[] args) {
        int base = 489083;
        Scanner ingresos_mensuales = new Scanner(System.in);
        System.out.print("Ingresos Mensuales: ");
        int ing = ingresos_mensuales.nextInt();
        Scanner vehiculos = new Scanner(System.in);
        System.out.print("Cantidad de vehiculos: ");
        int veh = vehiculos.nextInt();
        Scanner inmuebles = new Scanner(System.in);
        System.out.print("Cantidad de inmuebles: ");
        int inm = inmuebles.nextInt();
        Scanner extra = new Scanner(System.in);
        System.out.print("Usted tiene: Una embarcacion, una aeronave de lujo, es titular de activos que demuestre capacidad economica plena? [0=no, 1=si]: ");
        int ext = extra.nextInt();
        boolean cond_extra = ext == 1;
        Casa casa = new Casa(ing, veh, inm, cond_extra);
        if (casa.resultados(base)) {
            System.out.println("Usted pertenece a Ingresos Altos");
        } else {
            System.out.println("Usted no pertenece a Ingresos Altos");
        }
        ingresos_mensuales.close();
        vehiculos.close();
        inmuebles.close();
        extra.close();
    }
}
