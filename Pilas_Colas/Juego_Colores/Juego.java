package Pilas_Colas.Juego_Colores;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class Juego {
    Queue<Integer>[] jugadores;
    Stack<Integer> mesa;
    static int numJugadores = 5;

    public int juego(int n, ArrayList<Tirada> tiradas) {
        jugadores = new Queue[numJugadores + 1];
        for (int i = 0; i < numJugadores + 1; i++) {
            jugadores[i] = new ArrayDeque<>();
            for (int j = 0; j < n; j++) {
                jugadores[i].add(i);
            }
        }
        mesa = new Stack<>();

        int i = 0;
        boolean fin = false;
        Tirada t;

        while (i < tiradas.size() && !fin) {
            t = tiradas.get(i);

            if (t.dado1 == 6) {
                fin = true;
            } else if (t.dado1 % 2 == 0) {
                if (!jugadores[t.dado2 - 1].isEmpty()) {
                    mesa.push(jugadores[t.dado2 - 1].poll());
                }
            } else {
                jugadores[t.dado2-1].add(mesa.peek());
            }
        }

        int ganador = 0;
        int puntos = 0;
        int aux_puntos;

        for(int x = 0; x < numJugadores; x++){
            aux_puntos = 0;
            Queue<Integer> aux = jugadores[x];
            for(Integer p : aux){
                if (p == 0) {
                    aux_puntos++;
                }
            }
            if (aux_puntos > puntos) {
                ganador = x;
                puntos = aux_puntos;
            }
        }
        return ganador;
    }
}
