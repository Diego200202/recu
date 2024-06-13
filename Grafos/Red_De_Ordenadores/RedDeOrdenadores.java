package Grafos.Red_De_Ordenadores;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class RedDeOrdenadores {
    protected Boolean[][] adjMatrix;

    public RedDeOrdenadores(Boolean [][] adjMatrix){
        this.adjMatrix = adjMatrix;
    }

    public int[] obtenerCostes() {
        int n = adjMatrix.length;
        int[] precio = new int[n];
        boolean[] visitados = new boolean[n];
        
        // Inicializar el array de precios con un valor grande (infinito)
        Arrays.fill(precio, Integer.MAX_VALUE);
        precio[0] = 0; // El coste de comunicarse consigo mismo es 0

        // Cola de prioridad para elegir el nodo con el menor coste
        PriorityQueue<Integer> cola = new PriorityQueue<>(Comparator.comparingInt(o -> precio[o]));
        cola.add(0);

        while (!cola.isEmpty()) {
            int actual = cola.poll();

            if (visitados[actual]) continue;
            visitados[actual] = true;

            for (int vecino = 0; vecino < n; vecino++) {
                if (adjMatrix[actual][vecino]) {
                    int nuevoCoste = precio[actual] + 1;
                    if (nuevoCoste < precio[vecino]) {
                        precio[vecino] = nuevoCoste;
                        cola.add(vecino);
                    }
                }
            }
        }

        return precio;
    }
}
