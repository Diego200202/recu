package Arboles.Arbol_Aritmetico;

public class BinaryTreeNode<T> {
    T element;
    BinaryTreeNode<T> left , right;

    public BinaryTreeNode(T pElement){
        this.element = pElement;
        this.left = null;
        this.right = null;

    }
}