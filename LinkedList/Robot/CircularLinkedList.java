package LinkedList.Robot;

public class CircularLinkedList<T> {
    NodeCircularLinkedList<T> last;

    public void addNode(T pData) {
        if (last == null) {
            last = new NodeCircularLinkedList<T>(pData);
            last.next = last;
        } else {
            NodeCircularLinkedList first = last.next;
            last.next = new NodeCircularLinkedList<T>(pData);
            last.next.next = first;
            last = last.next;
        }
    }

    public void print() {
        if (last == null) {
            System.out.println("La lista esta vacia");
        } else {
            NodeCircularLinkedList act = last.next;
            while (act.next != last) {
                System.out.print(act.data +", ");
                act = act.next;
            }
            System.out.print(act.data +", ");
            System.out.println(last.data);
        }
    }
}
