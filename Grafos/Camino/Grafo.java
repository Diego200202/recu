package Grafos.Camino;

import java.util.ArrayList;

public class Grafo {
    protected int numVertices; // número de vértices en el grafo
    protected int[][] adjMatrix; // matriz de adyacencia

    // Constructor para inicializar el grafo con un número dado de vértices
    public Grafo(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
    }

    // Método para agregar un arco al grafo
    public void agregarArco(int origen, int destino) {
        adjMatrix[origen][destino] = 1;
    }

    // Método para verificar si existe un camino entre los elementos de la lista
    public boolean existeCamino(ArrayList<Integer> lista) {
        // Iterar a través de los elementos de la lista
        for (int i = 0; i < lista.size() - 1; i++) {
            int origen = lista.get(i);
            int destino = lista.get(i + 1);
            // Verificar si existe un arco desde 'origen' hasta 'destino'
            if (adjMatrix[origen][destino] != 1) {
                return false; // Si no existe, retornar false
            }
        }
        return true; // Si todos los arcos existen, retornar true
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        Grafo grafo = new Grafo(21); // Crear un grafo con 12 vértices

        // Agregar arcos al grafo
        grafo.agregarArco(11, 5);
        grafo.agregarArco(11, 3);
        grafo.agregarArco(5, 3);
        grafo.agregarArco(5, 8);
        grafo.agregarArco(5, 12);
        grafo.agregarArco(12, 8);
        grafo.agregarArco(12, 2);
        grafo.agregarArco(12, 15);
        grafo.agregarArco(12, 18);
        grafo.agregarArco(12, 1);
        grafo.agregarArco(15, 18);
        grafo.agregarArco(15, 1);
        grafo.agregarArco(15, 17);
        grafo.agregarArco(15, 4);
        grafo.agregarArco(15, 18);
        grafo.agregarArco(18, 17);
        grafo.agregarArco(18, 20);
        grafo.agregarArco(17, 1);
        grafo.agregarArco(17, 4);
        grafo.agregarArco(17, 20);
        grafo.agregarArco(1, 4);
        grafo.agregarArco(4, 20);

        // Crear una lista de prueba
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(12);
        lista1.add(1);
        lista1.add(4);
        lista1.add(17);
        lista1.add(18);
        lista1.add(15);

        // Verificar si existe un camino en la lista1
        boolean resultado1 = grafo.existeCamino(lista1);
        System.out.println("¿Existe un camino para la lista1? " + resultado1); // Debería imprimir true

        // Crear otra lista de prueba
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(12);
        lista2.add(1);
        lista2.add(20);
        lista2.add(17);
        lista2.add(18);
        lista2.add(15);

        // Verificar si existe un camino en la lista2
        boolean resultado2 = grafo.existeCamino(lista2);
        System.out.println("¿Existe un camino para la lista2? " + resultado2); // Debería imprimir false
    }
}

