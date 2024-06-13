package Arboles.Arbol_Genealogico;

import java.util.HashMap;

public class ArbolGenealogico {
    BTN<Persona> root;

    public boolean esVizcainoDePuraCepa(String nombre, HashMap<String, String> localidades) {
        HashMap<BTN<Persona>, BTN<Persona>> path = new HashMap<>();
        path.put(root, null);
        BTN<Persona> objetivo = buscarNodo(nombre, root, path);
        if (objetivo != null) {
            if (!localidades.get(objetivo.data.localidadNacimiento).equals("Bizkaia")) {
                return false;
            } else {
                boolean bizkaino = true;
                while (path.get(objetivo) != null && bizkaino) {
                    BTN<Persona> antecesor = path.get(objetivo);
                    if (!localidades.get(antecesor.data.localidadNacimiento).equals("Bizkaia")) {
                        bizkaino = false;
                    }
                    objetivo = antecesor;
                }
                return bizkaino;
            }
        } else {
            return false;
        }
    }

    private BTN<Persona> buscarNodo(String nombre, BTN<Persona> a, HashMap<BTN<Persona>, BTN<Persona>> path) {
        if (a == null) {
            return null;
        } else if (a.data.nombre.equals(nombre)) {
            return a;
        } else {
            path.put(a.left, a);
            path.put(a.right, a);
            BTN<Persona> b = buscarNodo(nombre, a.left, path);
            if (b != null) {
                return b;
            } else {
                return buscarNodo(nombre, a.right, path);
            }
        }
    }
}
