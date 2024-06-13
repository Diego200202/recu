package Grafos.Red_De_Ordenadores;

public class Main {
    public static void main(String[] args) {
        Boolean[][] adjMatrix = {
            {false, false, true, true, false, false, false, false, false, false, false}, //0
            {false, false, false, false, false, false, false, false, true, true, false}, //1
            {false, false, false, false, true, false, false, false, false, false, false}, //2
            {false, false, false, false, false, false, false, true, false, false, true}, //3
            {false, false, false, false, false, true, false, false, false, false, false}, //4
            {false, true, false, false, false, false, false, true, false, false, false}, //5
            {false, false, false, false, false, false, false, false, false, false, false}, //6
            {false, false, false, false, false, false, false, false, false, false, true}, //7
            {false, false, false, false, false, false, false, false, false, false, false}, //8
            {false, false, false, false, false, false, false, false, false, false, false}, // 9
            {false, false, false, false, false, false, false, false, false, false, false}, //10
        };

        RedDeOrdenadores r = new RedDeOrdenadores(adjMatrix);

        int[] costes = r.obtenerCostes();
        System.out.println("costes minimos desde el ordenador 0:");
        for(int i = 0; i < costes.length; i++){
            if (i == 6) {
                
            }else{
                System.out.println("Hasta el ordenador " + i + ": " + costes[i] + " doblones");
            }
        }
    }
}
