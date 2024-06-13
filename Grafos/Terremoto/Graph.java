package Grafos.Terremoto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Graph {
    protected final int DEFAULT_CAPACITY = 100;
    protected int numVertices;
    protected boolean[][] adjMatrix;
    protected String[] vertices;

    public int index(String t) {
        return 0;
    }

    public ArrayList<String> comarcasAfectadas(int intensidad, String c) {
        ArrayList<String> afectados = new ArrayList<>();
        Queue<String> porExaminar = new LinkedList<>();
        HashMap<String, Integer> intensidades = new HashMap<>();
        boolean[] examinados = new boolean[numVertices];

        porExaminar.add(c);
        examinados[index(c)] = true;
        intensidades.put(c, intensidad);

        while (!porExaminar.isEmpty() && intensidad > 1) {
            String act = porExaminar.remove();
            for (int i = 0; i < numVertices; i++) {
                if (adjMatrix[index(act)][i] && !examinados[i]) {
                    porExaminar.add(vertices[i]);
                    examinados[i] = true;
                    intensidades.put(vertices[i], intensidades.get(act) / 2);
                }
            }
        }

        for(Map.Entry<String, Integer> entry : intensidades.entrySet()){
            if (entry.getValue() > 1) {
                afectados.add(entry.getKey());
            }
        }
        return afectados;
    }
}