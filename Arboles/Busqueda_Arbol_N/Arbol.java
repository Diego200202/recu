package Arboles.Busqueda_Arbol_N;

public class Arbol {
    BTN<Integer> root;

    public boolean esta(Integer elem) {
        return buscar(elem, root);
    }

    public boolean buscar(Integer elem, BTN<Integer> n) {
        if (n == null || n.valores == null) {
            return false;
        }

        for (int i = 0; i < n.valores.length; i++) {
            if (elem < n.valores[i]) {
                if (n.hijos != null && i < n.hijos.length) {
                    return buscar(elem, n.hijos[i]);
                } else {
                    return false;  // No hay hijos o índice fuera de rango
                }
            } else if (elem == n.valores[i]) {
                return true;
            }
        }

        if (n.hijos != null && n.hijos.length > 0) {
            return buscar(elem, n.hijos[n.hijos.length - 1]);
        }

        return false;
    }
}
