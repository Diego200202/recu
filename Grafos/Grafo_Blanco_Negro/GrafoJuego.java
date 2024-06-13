package Grafos.Grafo_Blanco_Negro;

import java.util.*;

public class GrafoJuego {
    private HashMap<Integer, ArrayList<Casilla>> adyacentes;

    public GrafoJuego() {
        adyacentes = new HashMap<>();
    }

    public void agregarArista(Casilla origen, Casilla destino) {
        adyacentes.computeIfAbsent(origen.valor, k -> new ArrayList<>()).add(destino);
        adyacentes.computeIfAbsent(destino.valor, k -> new ArrayList<>()).add(origen);
    }

    public List<Casilla> camino(Casilla comienzo, Casilla fin) {
        if (comienzo.equals(fin)) {
            return Collections.singletonList(comienzo);
        }

        Queue<List<Casilla>> queue = new LinkedList<>();
        Set<Casilla> visitados = new HashSet<>();

        queue.add(Collections.singletonList(comienzo));
        visitados.add(comienzo);

        while (!queue.isEmpty()) {
            List<Casilla> path = queue.poll();
            Casilla last = path.get(path.size() - 1);

            ArrayList<Casilla> adyacentesLast = adyacentes.get(last.valor);
            if (adyacentesLast == null) continue;

            for (Casilla vecino : adyacentesLast) {
                if (!visitados.contains(vecino) && !vecino.color.equals(last.color)) {
                    List<Casilla> newPath = new ArrayList<>(path);
                    newPath.add(vecino);
                    if (vecino.equals(fin)) {
                        return newPath;
                    }
                    queue.add(newPath);
                    visitados.add(vecino);
                }
            }
        }
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        GrafoJuego grafo = new GrafoJuego();

        Casilla c11 = new Casilla("blanco", 11);
        Casilla c5 = new Casilla("blanco", 5);
        Casilla c13 = new Casilla("negro", 13);
        Casilla c8 = new Casilla("blanco", 8);
        Casilla c9 = new Casilla("negro", 9);
        Casilla c7 = new Casilla("negro", 7);
        Casilla c3 = new Casilla("negro", 3);
        Casilla c12 = new Casilla("negro", 12);
        Casilla c17 = new Casilla("negro", 17);
        Casilla c1 = new Casilla("blanco", 1);
        Casilla c4 = new Casilla("blanco", 4);
        Casilla c20 = new Casilla("blanco", 20);

        grafo.agregarArista(c11, c5);
        grafo.agregarArista(c11, c13);
        grafo.agregarArista(c5, c11);
        grafo.agregarArista(c5, c8);
        grafo.agregarArista(c5, c13);
        grafo.agregarArista(c5, c9);
        grafo.agregarArista(c13, c11);
        grafo.agregarArista(c13, c5);
        grafo.agregarArista(c13, c8);
        grafo.agregarArista(c8, c13);
        grafo.agregarArista(c8, c5);
        grafo.agregarArista(c8, c9);
        grafo.agregarArista(c9, c7);
        grafo.agregarArista(c9, c12);
        grafo.agregarArista(c9, c3);
        grafo.agregarArista(c9, c1);
        grafo.agregarArista(c7, c9);
        grafo.agregarArista(c7, c12);
        grafo.agregarArista(c12, c7);
        grafo.agregarArista(c12, c9);
        grafo.agregarArista(c12, c20);
        grafo.agregarArista(c12, c3);
        grafo.agregarArista(c12, c17);
        grafo.agregarArista(c3, c9);
        grafo.agregarArista(c3, c12);
        grafo.agregarArista(c3, c1);
        grafo.agregarArista(c3, c4);
        grafo.agregarArista(c3, c17);
        grafo.agregarArista(c1, c9);
        grafo.agregarArista(c1, c4);
        grafo.agregarArista(c1, c17);
        grafo.agregarArista(c1, c3);
        grafo.agregarArista(c17, c20);
        grafo.agregarArista(c17, c3);
        grafo.agregarArista(c17, c12);
        grafo.agregarArista(c17, c1);
        grafo.agregarArista(c17, c4);
        grafo.agregarArista(c4, c20);
        grafo.agregarArista(c4, c17);
        grafo.agregarArista(c4, c1);
        grafo.agregarArista(c4, c3);
        grafo.agregarArista(c20, c17);
        grafo.agregarArista(c20, c12);
        grafo.agregarArista(c20, c4);

        

        List<Casilla> camino = grafo.camino(c11, c20);

        for (Casilla casilla : camino) {
            System.out.print(casilla.valor + " ");
        }
        System.out.println();
    }
}

