package Pilas_Colas.Juego_Bloques;

import java.util.Stack;

public class Juego {
    Stack<Bloque>[] tablero;
    public static int numColumnas = 7;

    public Juego() {
        tablero = new Stack[numColumnas];

        for (int i = 0; i < numColumnas; i++) {
            tablero[i] = new Stack<>();
        }

        Bloque b0 = new Bloque(3);
        Bloque b1 = new Bloque(2);
        Bloque b2 = new Bloque(0);
        Bloque b3 = new Bloque(-1);
        Bloque b4 = new Bloque(-2);
        Bloque b5 = new Bloque(-3);

        int i = 0;
        tablero[i].push(b0);tablero[i].push(b0);tablero[i].push(b0);i++;//0
        tablero[i].push(b0);tablero[i].push(b3);tablero[i].push(b0);i++;//1
        tablero[i].push(b0);tablero[i].push(b0);tablero[i].push(b0);i++;//2
        tablero[i].push(b5);tablero[i].push(b2);tablero[i].push(b1);i++;//3
        tablero[i].push(b0);tablero[i].push(b0);tablero[i].push(b5);i++;//4
        tablero[i].push(b0);tablero[i].push(b4);tablero[i].push(b5);i++;//5
        tablero[i].push(b0);tablero[i].push(b0);tablero[i].push(b0);//6
    }

    public int jugar(){
        int puntuacion = 0;
        int i = 3;

        while (!estaFuera(i) && !tablero[i].isEmpty()) {
            Bloque b = tablero[i].pop();
            puntuacion += b.puntos;
            i += b.salto;
        }
        if (estaFuera(i)) {
            System.out.println("La bola ha caido fuera");
            return puntuacion;
        }else{
            System.out.println("Has ganado");
            return puntuacion;
        }
    }

    public boolean estaFuera(int i){
        if (i < 0 || i >= numColumnas) {
            return true;
        }else{
            return false;
        }
    }
}
