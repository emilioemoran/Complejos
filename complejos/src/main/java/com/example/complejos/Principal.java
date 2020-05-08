package com.example.complejos;

class Principal {
    public static void main(String[] main) {
        ComplejoAmpliado z, w;
        z = new ComplejoAmpliado(-1.5, 3.0);
        w = new ComplejoAmpliado(-1.2, -3.0);
        z.suma(w);
        System.out.println("Complejo: " + z.toString());
        System.out.println("Complejo: " + z.toString());
        System.out.println("Complejo: " + z.toString());

    }
}