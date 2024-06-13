package Grafos.Compilacion;

import java.util.ArrayList;
import java.util.Arrays;

public interface Main {
    public static void main(String[] args) {
        Compilador c = new Compilador();
        c.dependencias.put("PR1", new ArrayList<>(Arrays.asList("PR2", "PR3")));
        c.dependencias.put("PR2", new ArrayList<>(Arrays.asList("PR5", "PR3")));
        c.dependencias.put("PR15", new ArrayList<>(Arrays.asList("PR5", "PR14")));
        c.dependencias.put("PR3", new ArrayList<>(Arrays.asList("PR5")));
        c.dependencias.put("PR5", new ArrayList<>(Arrays.asList("PR2")));
        c.dependencias.put("PR14", new ArrayList<>(Arrays.asList("PR25")));

        Boolean esValido = c.esValido("PR15");
        if (esValido) {
            System.out.println("El programa es valido");
        }else{
            System.out.println("El programa no es valido");
        }
    }
}
