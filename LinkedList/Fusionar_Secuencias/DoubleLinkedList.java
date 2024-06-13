package LinkedList.Fusionar_Secuencias;

public class DoubleLinkedList {

    public DoubleNode<String> first;

    public void addNode(String pData) {
        DoubleNode<String> nodo = new DoubleNode<String>(pData);
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
            DoubleNode<String> actual = first;
            while (actual.next != first) {
                System.out.print(actual.data + ", ");
                actual = actual.next;
            }
            System.out.print(actual.data + ".\n");
        }
    }

    public void fusionarSecuencias(String[] s1, String[] s2) {
        if (s1.length == 0 && s2.length == 0) {
            System.out.println("Ambas listas estan vacias");
        } else if (s1.length != 0 && s2.length == 0) {
            for (String s : s1) {
                addNode(s);
            }
        } else if (s1.length == 0 && s2.length != 0) {
            for (String s : s2) {
                addNode(s);
            }
        } else {
            int i = 0;
            int j = 0;

            while (i < s1.length && j < s2.length) {
                if (s1[i].compareTo(s2[j]) < 0) {
                    addNode(s1[i]);
                    i++;
                } else {
                    addNode(s2[j]);
                    j++;
                }
            }

            while (i < s1.length) {
                addNode(s1[i]);
                i++;
            }

            while (j < s2.length) {
                addNode(s2[j]);
                j++;
            }
        }
    }
}
