package exercicio4;

public class InteiroSet {
    private boolean[] elementos;

    public InteiroSet() {
        elementos = new boolean[101]; // para números de 0 a 100
    }

    public void insereElemento(int k) {
        if (k >= 0 && k <= 100) {
            elementos[k] = true;
        }
    }

    public void deleteElemento(int m) {
        if (m >= 0 && m <= 100) {
            elementos[m] = false;
        }
    }

    public InteiroSet union(InteiroSet outroConjunto) {
        InteiroSet resultado = new InteiroSet();
        for (int i = 0; i <= 100; i++) {
            if (this.elementos[i] || outroConjunto.elementos[i]) {
                resultado.insereElemento(i);
            }
        }
        return resultado;
    }

    public InteiroSet intersecao(InteiroSet outroConjunto) {
        InteiroSet resultado = new InteiroSet();
        for (int i = 0; i <= 100; i++) {
            if (this.elementos[i] && outroConjunto.elementos[i]) {
                resultado.insereElemento(i);
            }
        }
        return resultado;
    }

    public boolean ehIgualTo(InteiroSet outroConjunto) {
        for (int i = 0; i <= 100; i++) {
            if (this.elementos[i] != outroConjunto.elementos[i]) {
                return false;
            }
        }
        return true;
    }

    public String toSetString() {
        StringBuilder sb = new StringBuilder();
        boolean isEmpty = true;
        for (int i = 0; i <= 100; i++) {
            if (elementos[i]) {
                if (!isEmpty) {
                    sb.append(" ");
                }
                sb.append(i);
                isEmpty = false;
            }
        }
        return isEmpty ? "-" : sb.toString();
    }
}
