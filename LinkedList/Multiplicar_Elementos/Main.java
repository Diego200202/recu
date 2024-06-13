package LinkedList.Multiplicar_Elementos;

public class Main {
    public static void main(String[] args){
        DoubleLinkedList<Integer> l1 = new DoubleLinkedList<>();

        l1.addNode(5);
        l1.addNode(7);
        l1.addNode(2);
        l1.addNode(8);

        l1.printNodeList();

        l1.multiplicarElementos(3);

        l1.printNodeList();
    }
}
