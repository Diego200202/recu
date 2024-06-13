package Pilas_Colas.Juego_Colores;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Juego juego = new Juego();
        ArrayList<Tirada> tiradas = new ArrayList<>();
        Tirada t1 = new Tirada(4, 3);
        Tirada t2 = new Tirada(4, 1);
        Tirada t3 = new Tirada(3, 5);
        tiradas.add(t1);
        tiradas.add(t2);
        tiradas.add(t3);

        System.out.println(juego.juego(6, tiradas));
    }
}
