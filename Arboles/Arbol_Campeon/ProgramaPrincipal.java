package Arboles.Arbol_Campeon;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Campeonato c = new Campeonato();

        c.root = new Nodo(new Marcador("", 0, 2));
        c.root.left = new Nodo(new Marcador("", 1, 2));
        c.root.left.left = new Nodo(new Marcador("", 1, 0));
        c.root.left.right = new Nodo(new Marcador("", 2, 0));
        c.root.left.left.left = new Nodo(new Marcador("E1", -1, -1));
        c.root.left.left.right = new Nodo(new Marcador("E2", -1, -1));
        c.root.left.right.left = new Nodo(new Marcador("E3", -1, -1));
        c.root.left.right.right = new Nodo(new Marcador("E4", -1, -1));
        c.root.right = new Nodo(new Marcador("", 2, 0));
        c.root.right.left = new Nodo(new Marcador("", 1, 3));
        c.root.right.right = new Nodo(new Marcador("", 1, 0));
        c.root.right.left.left = new Nodo(new Marcador("E5", -1, -1));
        c.root.right.left.right = new Nodo(new Marcador("E6", -1, -1));
        c.root.right.right.left = new Nodo(new Marcador("E7", -1, -1));
        c.root.right.right.right = new Nodo(new Marcador("E8", -1, -1));

        System.out.println(c.campeon());
    }
}
