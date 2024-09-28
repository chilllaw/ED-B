package exercicio3;

public class Data {
    public class Fatura {
        int mes;
        int dia;
        int ano;

        public Fatura(int mes, int dia, int ano) {
            this.mes = mes;
            this.dia = dia;
            this.ano = ano;
        }

        public void displayData() {
            System.out.println(dia + "/" + mes + "/" + ano);
        }

        public int getMes() {
            return mes;
        }

        public void setMes(int mes) {
            this.mes = mes;
        }

        public int getDia() {
            return dia;
        }

        public void setDia(int dia) {
            this.dia = dia;
        }

        public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }
    }

}
