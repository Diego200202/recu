package LinkedList.Reemplazar_Por_Secuencia;

public class DoubleLinkedList<T> {
    DoubleNode<T> first;

    public void addNode(T pData) {
        if (first == null) {
            first = new DoubleNode<>(pData);
            first.next = null;
            first.prev = null;
        } else {
            DoubleNode<T> actual = first;
            if (actual.next != null) {
                while (actual.next != null) {
                    actual = actual.next;
                }
                actual.next = new DoubleNode<>(pData);
                actual.next.next = null;
                actual.next.prev = actual;
            } else {
                actual.next = new DoubleNode<>(pData);
                actual.next.next = null;
                actual.next.prev = actual;
            }

        }
    }

    public void printNodeList() {
        if (first == null) {
            System.out.println("La lista esta vacia");
        } else {
            DoubleNode<T> actual = first;
            while (actual.next != null) {
                System.out.print(actual.data + ", ");
                actual = actual.next;
            }
            System.out.print(actual.data + ".\n");
        }
    }

    public void reemplazar(Pareja[] parejas) {
        DoubleLinkedList<T> lista = new DoubleLinkedList<>();

        DoubleNode<T> actual = first;

        while (actual.next != null) {
            for (Pareja p : parejas) {

                if (p.target == actual.data) {
                    
                }

            }
        }

    }
}
