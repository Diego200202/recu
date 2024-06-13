package Arboles.Arbol_Tareas;

public class Nodo {
    Tarea elem;
    Nodo left, right;

    public Nodo(Tarea pTarea) {
        this.elem = pTarea;
        left = null;
        right = null;
    }
}
