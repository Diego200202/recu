package Grafos.Grafo_Blanco_Negro;

public class Casilla {
    String color; // “blanco” o “negro”
    Integer valor;

    public Casilla(String color, Integer valor) {
        this.color = color;
        this.valor = valor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Casilla casilla = (Casilla) obj;
        return valor.equals(casilla.valor);
    }

    @Override
    public int hashCode() {
        return valor.hashCode();
    }
}
