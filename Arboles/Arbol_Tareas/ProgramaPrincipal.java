package Arboles.Arbol_Tareas;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Arbol a = new Arbol();

        a.root = new Nodo(new Tarea("T7", 5));
        a.root.left = new Nodo(new Tarea("T1", 5));
        a.root.left.left = new Nodo(new Tarea("T3", 6));
        a.root.left.left.left = new Nodo(new Tarea("T21", 5));
        a.root.left.left.right = new Nodo(new Tarea("T45", 8));
        a.root.left.right = new Nodo(new Tarea("T54", 12));
        a.root.left.right.left = new Nodo(new Tarea("T33", 5));
        a.root.left.right.right = new Nodo(new Tarea("T31", 3));
        a.root.right = new Nodo(new Tarea("T12", 3));
        a.root.right.left = new Nodo(new Tarea("T5", 5));
        a.root.right.left.left = new Nodo(new Tarea("T10", 6));
        a.root.right.left.right = new Nodo(new Tarea("T34", 2));
        a.root.right.right = new Nodo(new Tarea("T8", 7));  

        System.out.println(a.coste("T31"));
        System.out.println(a.coste("T12"));
        System.out.println(a.coste("T7"));
        System.out.println(a.coste("T100"));
    }
}
