package Grafos.Spam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Persona {
    String nombre;
    int spamRecibidos; // inicialmente a cero
    ArrayList<Persona> contactos;

    // Constructor para inicializar la persona
    public Persona(String nombre) {
        this.nombre = nombre;
        this.spamRecibidos = 0;
        this.contactos = new ArrayList<>();
    }

    // Método para enviar spam
    public void enviarSpam() {
        // Crear una cola para el BFS y un conjunto para rastrear las personas que ya reenviaron el spam
        Queue<Persona> cola = new LinkedList<>();
        HashSet<Persona> reenviados = new HashSet<>();

        // Agregar la persona actual a la cola
        cola.add(this);
        reenviados.add(this);

        // Procesar la cola
        while (!cola.isEmpty()) {
            Persona actual = cola.poll();
            // Incrementar el contador de spam recibidos
            actual.spamRecibidos++;

            // Decidir si se debe reenviar el spam a los contactos
            if (actual.reenviar()) {
                for (Persona contacto : actual.contactos) {
                    // Solo agregar a la cola si el contacto no ha reenviado el spam previamente
                    if (!reenviados.contains(contacto)) {
                        cola.add(contacto);
                        reenviados.add(contacto);
                    }
                }
            }
        }
    }

    // Método para decidir si se reenvía el spam
    public boolean reenviar() {
        // Implementación de ejemplo, se puede personalizar
        return Math.random() < 0.5; // Devuelve true el 50% de las veces
    }

    public static void main(String[] args) {
        // Crear algunas personas y sus contactos
        Persona alice = new Persona("Alice");
        Persona bob = new Persona("Bob");
        Persona carol = new Persona("Carol");
        Persona dave = new Persona("Dave");

        // Establecer contactos
        alice.contactos.add(bob);
        alice.contactos.add(carol);
        bob.contactos.add(dave);
        carol.contactos.add(dave);

        // Enviar spam desde Alice
        alice.enviarSpam();

        // Imprimir el número de spam recibidos por cada persona
        System.out.println("Spam recibidos por Alice: " + alice.spamRecibidos);
        System.out.println("Spam recibidos por Bob: " + bob.spamRecibidos);
        System.out.println("Spam recibidos por Carol: " + carol.spamRecibidos);
        System.out.println("Spam recibidos por Dave: " + dave.spamRecibidos);
    }
}

