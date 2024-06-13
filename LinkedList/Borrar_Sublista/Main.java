package LinkedList.Borrar_Sublista;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList<String> l1 = new DoubleLinkedList<>();
        DoubleLinkedList<String> l2 = new DoubleLinkedList<>();

        l1.addNode("jon");
        l1.addNode("amaia");
        l1.addNode("luis");

        l2.addNode("ana");
        l2.addNode("jon");
        l2.addNode("amaia");
        l2.addNode("luis");
        l2.addNode("ander");

        l1.printNodeList();
        l2.printNodeList();

        l2.borrarSublista(l1);

        l2.printNodeList();
    }
}
