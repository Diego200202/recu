package Arboles.Arbol_Genealogico;

public class BTN<T> {
    T data;
    BTN<T> left, right;

    public BTN(T pData){
        data = pData;
        left = null;
        right = null;
    }
}
