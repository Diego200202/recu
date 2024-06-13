package Arboles.Arbol_Aritmetico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ArbolExpresion {
    BinaryTreeNode<InfoElemExp> root;

    public Integer evaluar(HashMap<String , Integer> pHashMap){
                

        return 0;
    }

    public Iterator<InfoElemExp> iteratorPostOrden(){
        ArrayList<InfoElemExp> lista = new ArrayList<>();
        iteratorPostOrden(root, lista);
        return lista.iterator();
    }

    private void iteratorPostOrden(BinaryTreeNode<InfoElemExp> a, ArrayList<InfoElemExp> l){
        if (a == null) {
            return;
        }

        iteratorPostOrden(a.left, l);
        iteratorPostOrden(a.right, l);
        l.add(a.element);
    }
}
