//TODO
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

    public static void main(String[] args) {
        System.out.println(cantidad("banana", 'a'));
    }
}
