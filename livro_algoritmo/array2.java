package livro_algoritmo;

public class array2 {
    public static void main(String[] args) {
        double[] precos = new double[5];
        precos[0] = 126000;
        precos[1] = 46000;
        precos[2] = 56000;
        precos[3] = 106000;
        precos[4] = 160000;

        int maisbarato = 0;
        int atual = 0;

        for (atual = 0; atual <= 4;) {
            if (precos[atual] < precos[maisbarato]) {
                maisbarato = atual;
            }
            atual = atual + 1;
        }
        System.out.println(maisbarato);
        System.out.println("O carro mais barato custa " + precos[maisbarato]);
        
    }
}
