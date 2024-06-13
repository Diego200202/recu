package Pilas_Colas.Poker;

import java.util.ArrayList;
import java.util.Stack;

public class Juego {

    public int jugar(int numJugadores, int billetesIniciales, ArrayList<Pago> pagos) {
        if (numJugadores < 2 || numJugadores > 20 || billetesIniciales < 1 || pagos.isEmpty()) {
            System.out.println("No se puede iniciar");
            return 0;
        } else {
            Stack<Boolean>[] partida = new Stack[numJugadores];
            for (int i = 0; i < numJugadores; i++) {
                partida[i] = new Stack<Boolean>();
            }

            for (int i = 0; i < numJugadores; i++) {
                for(int j = 0; j < billetesIniciales; j++){
                    if (i == 0) {
                        partida[i].push(Boolean.FALSE);
                    }else{
                        partida[i].push(Boolean.TRUE);
                    }
                }
            }

            for(Pago p : pagos){
                for(int n = p.cantidad; n > 0; n--){
                    partida[p.cobrador].push(partida[p.pagador].pop());
                }
            }

            int cont = 0;
            while (!partida[0].empty()) {
                if (partida[0].pop() == Boolean.TRUE) {
                    cont++;
                }
            }
            return cont;
        }
    }
}
