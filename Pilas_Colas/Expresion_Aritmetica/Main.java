package Pilas_Colas.Expresion_Aritmetica;

public class Main {
    public static void main(String[] args) {
        Expresion expresion = new Expresion();

        String pExpresion = "(1 + ((2 + 3) * (4 * 5)))";

        System.out.println(expresion.evaluar(pExpresion));
    }
}
