package livro_algoritmo;

public class array {
    public static void main(String[] args) {
        String[] carro = { "volvo", "BMW","CHEVROLET","MERCEDES","BRASILIA","CAMARO"};
        int atual = 0;
        int atual2 = 0;
        int[] precos = {13000,70000,5000,50000,2000,40000};

        for (int i = 0; i < carro.length; i++) {
            atual++;
            for (atual2 = 0; atual2 < 6; atual2++) {
                if (precos[atual2] < i) {
                    i = atual2;
                }
                
                if (carro[i] == "volvo") {
                    System.out.println(+atual + " " + carro[i] + " no array " + i + " " +precos[i]);
                }
            }
            
        }
       
    }
}
