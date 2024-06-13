package LinkedList.Suma_Vectores;

public class Vector {
    Node first;

    public void addNode(Integer pDato, Integer pPosicion) {
        if (first == null) {
            first = new Node(pDato, pPosicion);
        } else {
            Node actual = first;
            while (first.next != null) {
                actual = actual.next;
            }
            actual.next = new Node(pDato, pPosicion);
        }
    }

    public void imprimirLista() {
        if (first == null) {
            System.out.println("El vector esta vacio");
        } else {
            System.out.print("( ");
            Node actual = first;
            while (actual.next != null) {
                System.out.print(actual.dato +" , ");
                actual = actual.next;
            }
            System.out.println(" )");
        }
    }

    public Vector suma(Vector v1, Vector v2)
    {
        Vector v_aux=new Vector();
        Node act1,act2,act_aux;
        act1=v1.first;
        act2=v2.first;
        v_aux.first=new Node(0,act1.dato+ act2.dato);
        act_aux=v_aux.first;
        int i=0;


        while (act1!=null && act2!=null)
        {
            act1=act1.next;
            act2=act2.next;
            act_aux=act_aux.next;
            i++;
            act_aux=new Node(i,act1.dato+ act2.dato);
        }
        return v_aux;
    }
}
