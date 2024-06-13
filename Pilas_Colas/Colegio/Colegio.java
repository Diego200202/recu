package Pilas_Colas.Colegio;

import java.util.LinkedList;
import java.util.Queue;

public class Colegio {
    Queue<Queue<String>> alumnos;

    public void repartirRegalos(Queue<String> regalos) {
        while (!regalos.isEmpty()) {
            String regalo = regalos.remove();
            Queue<String> clase = alumnos.poll();
            alumnos.offer(clase);
            int i = 0;
            while (i < clase.size()) {
                String alumno = clase.poll();
                System.out.println("El regalo " + regalo + " a " + alumno);
                clase.offer(alumno);
                i++;
            }
            
        }
    }

    public Colegio() {
        alumnos = new LinkedList<>();
        Queue<String> primero = new LinkedList<>();
        primero.add("a");
        primero.add("b");
        primero.add("c");
        primero.add("d");
        Queue<String> segundo = new LinkedList<>();
        segundo.add("e");
        segundo.add("f");
        segundo.add("g");
        segundo.add("h");
        Queue<String> tercero = new LinkedList<>();
        tercero.add("i");
        tercero.add("j");
        tercero.add("k");
        tercero.add("l");
        Queue<String> cuarto = new LinkedList<>();
        cuarto.add("m");
        cuarto.add("n");
        cuarto.add("o");
        cuarto.add("p");
        Queue<String> quinto = new LinkedList<>();
        quinto.add("q");
        quinto.add("r");
        quinto.add("s");
        quinto.add("t");
        Queue<String> sexto = new LinkedList<>();
        sexto.add("u");
        sexto.add("v");
        sexto.add("w");
        sexto.add("x");

        alumnos.add(primero);
        alumnos.add(segundo);
        alumnos.add(tercero);
        alumnos.add(cuarto);
        alumnos.add(quinto);
        alumnos.add(sexto);
    }

    public static void main(String[] args) {
        Colegio colegio = new Colegio();

        Queue<String> regalos = new LinkedList<>();
        int i = 1;
        while (i < 16) {
            String reg = "r" + i;
            regalos.add(reg);
            i++;
        }

        colegio.repartirRegalos(regalos);
    }
}
