package LinkedList.Suma_Vectores;

public class Vector {
    Node first;

    public void addNode(Integer pDato, Integer pPosicion) {
        if (first == null) {
            first = new Node(pDato, pPosicion);
        } else {
            Node actual = first;
            while (first.next != null) {
                actual = actual.next;
            }
            actual.next = new Node(pDato, pPosicion);
        }
    }

    public void imprimirLista() {
        if (first == null) {
            System.out.println("El vector esta vacio");
        } else {
            System.out.print("( ");
            Node actual = first;
            while (actual.next != null) {
                System.out.print(actual.dato +" , ");
                actual = actual.next;
            }
            System.out.println(" )");
        }
    }

    public Vector suma(Vector v1, Vector v2) {
        return null;
    }
}
