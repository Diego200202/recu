package Pilas_Colas.Expresion_Aritmetica;
import java.util.Stack;

public class Expresion {
    public double evaluar(String pExpresion) {
        Stack<Character> operadores = new Stack<>();
        Stack<Integer> operandos = new Stack<>();

        for (Character c : pExpresion.toCharArray()) {
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                operadores.push(c);
            } else if (c.isDigit(c)) {
                operandos.push(Character.digit(c, 10));
            } else if (c == ')') {
                Integer x = operandos.pop();
                Integer y = operandos.pop();
                char operador = operadores.pop();
                if (operador == '+') {
                    Integer res = x + y;
                    operandos.push(res);
                } else if (operador == '-') {
                    Integer res = x - y;
                    operandos.push(res);
                } else if (operador == '*') {
                    Integer res = x * y;
                    operandos.push(res);
                }else if (operador == '/') {
                    Integer res = x / y;
                    operandos.push(res);
                }
            }
        }
        if (operandos.size() == 1) {
            return operandos.pop();
        }
        return 0.0;
    }
}
