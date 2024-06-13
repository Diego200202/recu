package Grafos.Compilacion;

import java.util.ArrayList;
import java.util.HashMap;

public class Compilador {
    public HashMap<String, ArrayList<String>> dependencias = new HashMap<>();

    public boolean esValido(String prog){
       return esValido(prog, new ArrayList<>());
    }

    private boolean esValido(String prog, ArrayList<String> mirados){
        if (mirados.contains(prog)) {
            return true;
        }

        if (!dependencias.containsKey(prog)) {
            return false;
        }

        mirados.add(prog);

        for(String s : dependencias.get(prog)){
            if (!esValido(s, mirados)) {
                return false;
            }
        }

        return true;
    }

}
