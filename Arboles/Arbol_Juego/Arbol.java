package Arboles.Arbol_Juego;

public class Arbol {
    private static Nodo root;

    public static void premiar(int puntos, String elem) {
        Nodo n = buscarNodo(elem, root);
        while (puntos >= 1 && n.padre != null) {
            n.content.puntos += puntos;
            puntos -= 1;
            n = n.padre;
        }

    }

    private static Nodo buscarNodo(String elem, Nodo root) {
        if (root == null) {
            return null;
        } else {
            if (root.content.s.equals(elem)) {
                return root;
            } else {
                Nodo der = buscarNodo(elem, root.der);
                if (der != null) {
                    return der;
                } else {
                    return buscarNodo(elem, root.izq);
                }
            }
        }
    }

    public static void imprimirArbol(Nodo n){
        System.out.println(n.content.s + ", " + n.content.puntos);
        if (n.izq != null) {
            imprimirArbol(n.izq);
        }

        if (n.der != null) {
            imprimirArbol(n.der);
        }
    }

    public static void main(String[] args) {
        Nodo a = new Nodo(new Info("A", 3));
        Nodo b = new Nodo(new Info("B", 3));
        Nodo c = new Nodo(new Info("C", 3));
        Nodo d = new Nodo(new Info("D", 3));
        Nodo f = new Nodo(new Info("F", 3));
        Nodo j = new Nodo(new Info("J", 3));
        Nodo h = new Nodo(new Info("H", 3));
        Nodo k = new Nodo(new Info("K", 3));
        Nodo g = new Nodo(new Info("G", 3));
        Nodo i = new Nodo(new Info("I", 3));

        a.padre = null;
        a.izq = b;
        a.der = i;
        i.padre = a;
        b.padre = a;
        b.izq = c;
        b.der = j;
        c.padre = b;
        j.padre = b;
        j.izq = h;
        j.der = k;
        k.padre = j;
        h.padre = j;
        h.izq = g;
        g.padre = h;
        c.izq = d;
        d.padre = c;
        c.der = f;
        f.padre = c;

        root = a;

        System.out.println("El arbol antes de premiar:");
        imprimirArbol(root);

        premiar(3, "H");

        System.out.println("El arbol despues de premiar:");
        imprimirArbol(root);
    }
}
