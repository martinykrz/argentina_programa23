import java.util.Random;

class ejercicio_1 {
    public static int cantidad(String palabra, char letra) {
        int count = 0;
        for (int i=0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                count++;
            }
        }
        return count;
    }

    public static void ordenar(int[] v, boolean des) {
        for (int i=0; i < v.length-1; i++) {
            for (int j=0; j < v.length-i-1; j++) {
                if (des) {
                    if (v[j] < v[j+1]) {
                        int tmp = v[j];
                        v[j] = v[j+1];
                        v[j+1] = tmp;
                    }
                } else {
                    if (v[j] > v[j+1]) {
                        int tmp = v[j];
                        v[j] = v[j+1];
                        v[j+1] = tmp;
                    }
                }
            }
        }
    }
    
    public static int[] vector_ordenado(int a, int b, int c, boolean des) {
        int[] res = {a, b, c};
        ordenar(res, des);
        return res;
    }

    public static int sumar_hasta(int[] v, int x) {
        int res = 0;
        ordenar(v, false);
        for (int i : v) {
            if (i < x) {
                res += i;
            } else {
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Cantidad de a en banana: ");
        System.out.println(cantidad("banana", 'a'));
        Random rand = new Random();
        int[] v = vector_ordenado(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10), true);
        System.out.println("Vector: ");
        for (int i : v) {
            System.out.println(i);
        }
        int r = rand.nextInt(10);
        System.out.println("Hasta "+r);
        System.out.println(sumar_hasta(v, r));
    }
}
