package Arboles.Arbol_Tareas;

public class Arbol {
    Nodo root;

    public int coste(String idTarea) {
        Nodo n = buscarTarea(idTarea, root);
        return suma(n);
    }

    private Nodo buscarTarea(String idTarea, Nodo n) {
        if (n == null) {
            return null;
        } else if (n.elem.id.equals(idTarea)) {
            return n;
        } else {
            Nodo der = buscarTarea(idTarea, n.right);
            if (der != null) {
                return der;
            } else {
                return buscarTarea(idTarea, n.left);
            }
        }
    }

    private int suma(Nodo n) {
        if (n == null) {
            return 0;
        } else {
            return suma(n.left) + suma(n.right) + n.elem.coste;
        }
    }
}
