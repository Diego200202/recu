package Arboles.Arbol_Campeon;

public class Campeonato {
    public Nodo root;

    public String campeon(){
        llenar(root);
        return root.info.ganador;
    }

    private void llenar(Nodo n){
        if (n.left == null || !n.left.info.ganador.equals("")) {
            
        } else {
            llenar(n.left);
        }

        if (n.right == null || !n.right.info.ganador.equals("")) {
            
        } else {
            llenar(n.right);
        }

        if (n.left != null && n.right != null) {
            if (n.info.golesDer > n.info.golesIzq) {
                n.info.ganador = n.right.info.ganador;
            }else{
                n.info.ganador = n.left.info.ganador;
            }
        }
    }
}
