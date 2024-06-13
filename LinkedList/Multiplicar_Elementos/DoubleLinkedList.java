package LinkedList.Multiplicar_Elementos;

public class DoubleLinkedList<T> {
    public DoubleNode<T> first;

    public void addNode(T pData) {
        DoubleNode<T> nodo = new DoubleNode(pData);
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

    public void multiplicarElementos(int n) {
        DoubleNode<T> actual = first;

        while (actual.next != first) {
            

            for (int i = 1; i < n; i++) {
                DoubleNode<T> nodo = new DoubleNode(actual.data);
                actual.next.prev = nodo;
                nodo.next = actual.next;
                actual.next = nodo;
                nodo.prev = actual;

                actual = actual.next;
            }

            actual = actual.next;
        }
        if (n >= 2) {
            for(int i = 1; i < n;i++){
                DoubleNode<T> nodo = new DoubleNode(actual.data);
                actual.next.prev = nodo;
                nodo.next = actual.next;
                actual.next = nodo;
                nodo.prev = actual;

                actual = actual.next; 
            }
        }
    }
}
