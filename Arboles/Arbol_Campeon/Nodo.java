package Arboles.Arbol_Campeon;

public class Nodo {
    Marcador info;
    Nodo left, right;

    public Nodo(Marcador pInfo){
        this.info = pInfo;
        this.left = null;
        this.right = null;
    }
}
