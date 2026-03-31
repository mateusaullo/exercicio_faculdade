package livro_algoritmo;

public class array {
    public static void main(String[] args) {
        String[] carro = { "volvo", "BMW","CHEVROLET","MERCEDES","BRASILIA","CAMARO"};
        int atual = 0;
        int maisbarato = 0;

        for (int i = 0; i < carro.length; i++) {
            atual++;
            if (carro[i] == "volvo") {
                System.out.println(+atual+" " +carro[i]+" no array "+i);
            }
        }
        
    }
}
