package Arboles.Arbol_Juego;

public class Nodo {
    Info content;
    Nodo izq, der;
    Nodo padre;

    public Nodo(Info pContent){
        this.content = pContent;
    }
}
