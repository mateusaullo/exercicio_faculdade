package algoritmos_em_java_busca_ordenacao_analise;

public class classe {
    private static int buscamenor(Produto[] produtos){
        int maisbarato = 0;
        int termino = produtos.length-1;
        for (int atual = 0; atual <= termino; atual++) {
            if (produtos[atual].getPreco() < produtos[maisbarato].getPreco()) {
                maisbarato = atual;
            }
            if (produtos[atual].getUsado().equals("sim")) {
                System.out.println(produtos[atual].getNome() + " é usado");
            }


        }
        return maisbarato;
    }
public static void main(String[] args) {
    Produto produtos[] = {
            new Produto ( "Lamborghini", 1000000,"sim"),
            new Produto( "Jipe", 46000,"nao"),
            new Produto( "Smart", 46000,"sim"),
            new Produto("Fusca", 17000,"nao"),
    };

    
    int maisbarato = buscamenor(produtos);


    System.out.println(maisbarato);
    System.out.println("O carro mais barato custa "+produtos[maisbarato].getPreco()+ " "+produtos[maisbarato].getNome());
}
}
 class Produto {

     private String nome;
     private double preco;
     private String usado;

     

     public Produto(String nome, double preco, String usado) {
         this.nome = nome;
         this.preco = preco;
         this.usado = usado;
     }
     
     public double getPreco() {

         return preco;
     }

     public String getNome() {

         return nome;
     }
     public void setPreco(double preco) {

         this.preco = preco;
     }
     public String getUsado() {

         return usado;
     }



 }
