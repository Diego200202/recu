package LinkedList.Parcial_2023;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        ListaDePersonas l = new ListaDePersonas();

        DoubleLinkedList lista = new DoubleLinkedList();

        lista.obtenerLista(l);

        lista.printNodeList();
    }
}
