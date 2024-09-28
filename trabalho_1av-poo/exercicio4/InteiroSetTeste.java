package exercicio4;

public class InteiroSetTeste {
    public static void main(String[] args) {
        InteiroSet conjuntoA = new InteiroSet();
        InteiroSet conjuntoB = new InteiroSet();

        conjuntoA.insereElemento(1);
        conjuntoA.insereElemento(2);
        conjuntoA.insereElemento(3);
        conjuntoA.insereElemento(10);
        System.out.println("Conjunto A: " + conjuntoA.toSetString());

        conjuntoB.insereElemento(3);
        conjuntoB.insereElemento(4);
        conjuntoB.insereElemento(5);
        conjuntoB.insereElemento(10);
        System.out.println("Conjunto B: " + conjuntoB.toSetString());

        InteiroSet uniao = conjuntoA.union(conjuntoB);
        System.out.println("União: " + uniao.toSetString());

        InteiroSet intersecao = conjuntoA.intersecao(conjuntoB);
        System.out.println("Interseção: " + intersecao.toSetString());

        boolean iguais = conjuntoA.ehIgualTo(conjuntoB);
        System.out.println("Conjunto A é igual ao Conjunto B? " + iguais);
    }
}
