package LinkedList.Robot;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Camino c = new Camino();

        c.first = new Node("3-5-9");

        Node n1 = new Node("2-4-5");
        Node n2 = new Node("9-8-4");
        Node n3 = new Node("9-5-9");
        Node n4 = new Node("1-5-7");
        Node n5 = new Node("8-5-9");
        Node n6 = new Node("1-5-9");
        Node n7 = new Node("5-9-3");
        Node n8 = new Node("1-2-7");

        n1.next = n3;
        n1.right = n4;
        n2.next = n4;
        n3.next = n5;
        n4.next = n6;
        n4.left = n5;
        n5.next = n7;
        n6.next = n8;
        n6.left = n7;
        c.first.next = n2;
        c.first.left = n1;

        ArrayList<String> acciones = new ArrayList<>(Arrays.asList("adelante", "adelante", "izquierda", "adelante"));

        CircularLinkedList res = c.obtCoordenadas(acciones);

        res.print();

    }
}
