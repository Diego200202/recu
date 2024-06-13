package LinkedList.Añadir_Despues;

public class Main {
    
    public static void main(String[] args) {
        DoubleLinkedList<String> l1 = new DoubleLinkedList<String>();

        l1.addNode("ana");
        l1.addNode("jon");
        l1.addNode("amaia");
        l1.addNode("luis");
        l1.addNode("ander");

        l1.printNodeList();

        l1.addAfter("peio", "amaia");

        l1.printNodeList();

        l1.addAfter("diego", "ana");

        l1.printNodeList();

        l1.addAfter("nayra", "ander");

        l1.printNodeList();
    }
}
