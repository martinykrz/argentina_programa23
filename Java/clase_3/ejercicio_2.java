class ejercicio_2 {
    public static void cifrado_caesar(String s, int despl) {
        String abc = "abcdefghijklmnñopqrstuvwxyz";
        char[] res = new char[s.length()];
        for (int i=0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                int idx = abc.indexOf(c);
                res[i] = abc.charAt((idx + despl) % abc.length());
            }
        }
        System.out.println(s+" -> "+new String(res));
    }

    public static void main(String[] args) {
        cifrado_caesar("hola que tal", 2);
    }
}
