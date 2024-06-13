package LinkedList.Borrar_Sublista;

public class DoubleNode<T> {
    T data;
    DoubleNode<T> next;
    DoubleNode<T> prev;

    public DoubleNode(T pData){
        this.data = pData;
    }
}
