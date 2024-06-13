package LinkedList.Robot;

import java.util.ArrayList;

public class Camino {
    Node first;

    public CircularLinkedList<String> obtCoordenadas(ArrayList<String> acciones) {
        CircularLinkedList<String> resultado = new CircularLinkedList();
        resultado.addNode(first.coord);
        Node act = first;
        for (int i = 0; i < acciones.size(); i++) {
            switch (acciones.get(i)) {
                case "izquierda":
                    resultado.addNode(act.left.coord);
                    act = act.left;
                    break;
                case "derecha":
                    resultado.addNode(act.right.coord);
                    act = act.right;
                    break;
                default:
                    resultado.addNode(act.next.coord);
                    act = act.next;
                    break;
            }
        }
        return resultado;
    }
}
