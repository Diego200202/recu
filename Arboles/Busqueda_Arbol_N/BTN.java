package Arboles.Busqueda_Arbol_N;

public class BTN<T> {
    T[] valores;
    BTN<T>[] hijos;

    public BTN(T[] pValores) {
        valores = pValores;
        hijos = new BTN[valores.length + 1];
    }
}
