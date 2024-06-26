package Arboles.Arbol_Aritmetico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import java.util.*;

public class ArbolExpresion
{
    BinaryTreeNode<InfoElemExp> root;

    public Integer evaluar(HashMap<String, Integer> tHash)
    {
        Stack<Integer> pila_num=new Stack<>();
        Iterator<InfoElemExp> itr=iteratorPostOrden();
        int res=0;
        InfoElemExp i;
        while (itr.hasNext())
        {
            i=itr.next();
            if(!i.operador)
            {
                pila_num.push(Integer.valueOf(i.elem));
            }
            else
            {
                if(i.elem.equals("+"))
                {
                    int y=pila_num.pop();
                    int x=pila_num.pop();
                    res=x+y;
                    pila_num.push(res);
                }
                else if(i.elem.equals("-"))
                {
                    int y=pila_num.pop();
                    int x=pila_num.pop();
                    res=x-y;
                    pila_num.push(res);
                }
                else if(i.elem.equals("*"))
                {
                    int y=pila_num.pop();
                    int x=pila_num.pop();
                    res=x*y;
                    pila_num.push(res);
                }
            }
        }
        if(pila_num.size()==1)
        {
            return pila_num.pop();
        }
        else
        {
            return 9999;
        }

    }

    public Iterator<InfoElemExp> iteratorPostOrden()
    {
        ArrayList<InfoElemExp> lista=new ArrayList<>();
        iteratorPostOrden(root, lista);
        return lista.iterator();
    }

    private void iteratorPostOrden(BinaryTreeNode<InfoElemExp> a, ArrayList<InfoElemExp> l)
    {
        if(a==null){}
        else
        {
            iteratorPostOrden(a.left,l);
            iteratorPostOrden(a.right,l);
            l.add(a.element);
        }
    }
}
