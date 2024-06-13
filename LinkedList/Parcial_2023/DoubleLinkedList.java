package LinkedList.Parcial_2023;

public class DoubleLinkedList {
    DoubleNode first;

    private void addDoubleNode(DoubleNode n) {
        if (first == null) {
            first = n;
        } else {
            DoubleNode act = first;
            while (act.next != null) {
                act = act.next;
            }
            act.next = n;
            act.next.prev = act;
        }
    }

    public void printNodeList() {
        if (first == null) {
            System.out.println("La lista esta vacia");
        } else {
            DoubleNode actual = first;
            while (actual.next != null) {
                System.out.print(actual.data + "{" + printLista(actual) + "}" + ", ");
                actual = actual.next;
            }
            System.out.print(actual.data  + "{" + printLista(actual) + "}" + ".\n");
        }
    }

    private String printLista(DoubleNode n) {
        StringBuilder res = new StringBuilder();
        Node act = n.listaCompras;
        if (act != null) {
            Node start = act;
            do {
                res.append(act.data).append(" ");
                act = act.next;
            } while (act != start);
        }
        return res.toString().trim();
    }

    public void obtenerLista(ListaDePersonas l) {
        int i = 0;
        for (String s : l.personas) {
            DoubleNode n = new DoubleNode(s);
            for (int j = 0; j < l.compras[i].length; j++) {
                String string = l.compras[i][j];
                addNode(string, n);
            }
            i++;
            addDoubleNode(n);
        }
    }

    private void addNode(String s, DoubleNode n) {
        if (n.listaCompras == null) {
            n.listaCompras = new Node(s);
            n.listaCompras.next = n.listaCompras;
        } else {
            Node act = n.listaCompras;
            while (act.next != n.listaCompras) {
                act = act.next;
            }
            act.next = new Node(s);
            act.next.next = n.listaCompras;
        }
    }

}
