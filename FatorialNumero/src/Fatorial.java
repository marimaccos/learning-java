public class Fatorial {

    private String equacao = "";
    private int fat = 1;

    public void setValor(int num) {

        for (int i = num; i > 1; i-- ) {
            fat *= i;
            equacao += i + " x ";
        }
        equacao += "1 = " + fat;
    }

    public String getEquacao() {
        return equacao;
    }

    public int getFat() {
        return fat;
    }
}
