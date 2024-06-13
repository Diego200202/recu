package LinkedList.Borrar_Sublista;

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

    public void borrarSublista(DoubleLinkedList<T> subLista){
        DoubleNode<T> actual=first;
        DoubleNode<T> anterior=first;
        boolean esp=false;

        if(subLista.first!=null) {
            while (!actual.data.equals(subLista.first.data) && !anterior.equals(first.prev)) {
                anterior = actual;
                actual = actual.next;
            }
            if (!anterior.equals(first.prev)) {
                if (actual.equals(first)) {
                    if (subLista.size() == size()) {
                        first = null;
                    } else {
                        anterior = anterior.prev;
                        esp = true;
                    }
                }
                for (int i = 0; i < subLista.size(); i++) {
                    actual = actual.next;
                    if (actual == first) {
                        esp = true;
                    }
                }
                actual.prev = anterior;
                anterior.next = actual;
                if (esp) {
                    first = actual;
                }
            }
        }
    }

    public int size()
    {
        int i=1;
        DoubleNode<T> actual=first;
        if(first==null)
        {
            i=0;
        }
        else
        {
            while (actual.next != first) {
                i++;
                actual = actual.next;
            }
        }

        return i;
    }
}
