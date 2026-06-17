package algoritmos_em_java_busca_ordenacao_analise;

public class classe {
public static void main(String[] args) {
    Produto produtos[] = new Produto[5];
    produtos[0] = new Produto( "Lamborghini", 1000000,"sim");
    produtos[1] = new Produto( "Jipe", 46000,"nao");
    produtos[2] = new Produto( "Brasilia", 126000,"nao");
    produtos[3] = new Produto( "Smart", 46000,"sim");
    produtos[4] = new Produto("Fusca", 17000,"nao");
    
    int maisbarato = 0;

    for (int atual = 0; atual <= 4; atual++) {
        if (produtos[atual].getPreco() < produtos[maisbarato].getPreco()) {
            maisbarato = atual;
        }
        if (produtos[atual].getUsado().equals("sim")) {
            System.out.println(produtos[atual].getNome() + " é usado");
        }

        produtos[atual].getNome();
        produtos[atual].setPreco(1);
    }
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
