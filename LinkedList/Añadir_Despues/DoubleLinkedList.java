package LinkedList.Añadir_Despues;

public class DoubleLinkedList<T> {

    public DoubleNode<T> first;

    public void addNode(T pData) {
        DoubleNode<T> nodo = new DoubleNode<T>(pData);
        if (this.first == null) {
            this.first = nodo;
            first.next = first;
            first.prev = first;
        } else {
            first.prev.next = nodo;
            first.prev = nodo;
            nodo.next = first;
            nodo.prev = first.prev.prev;
        }
    }

    public void printNodeList() {
        if (first == null) {
            System.out.println("La lista esta vacia");
        } else {
            DoubleNode<T> actual = first;
            while (actual.next != first) {
                System.out.print(actual.data + ", ");
                actual = actual.next;
            }
            System.out.print(actual.data + ".\n");
        }
    }

    public void addAfter(T pData, T pTarget) {
        boolean esta = false;

        if (!first.data.equals(pTarget)) {
            DoubleNode<T> actual = first.next;
            while (actual != first && !actual.data.equals(pTarget)) {
                actual = actual.next;
                if (actual.data == pTarget) {
                    esta = true;
                }
            }
            if (esta) {
                DoubleNode<T> nodo = new DoubleNode<T>(pData);
                actual.next.prev = nodo;
                nodo.next = actual.next;
                actual.next = nodo;
                nodo.prev = actual;
            }
        } else {
            DoubleNode<T> nodo = new DoubleNode<T>(pData);
            first.next.prev = nodo;
            nodo.next = first.next;
            first.next = nodo;
        }

    }

}
