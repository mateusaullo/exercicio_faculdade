package POO;

public class exercicio_poo_dois {
     public static void main(String[] args) {
         Carro2 carro = new Carro2();
         carro.marca = "Fiat";
         carro.cor = "vermelho";
         carro.ano = 2019;
         carro.exibir_dados();
         carro.ligar();

         if(carro.ehNovo()){
             System.out.println("✅ Este carro é novo!\n");
         } else {
             System.out.println("❌ Este carro é antigo!\n");
         }

         carro.marca = "Ford";
         carro.cor = "verde";
         carro.ano = 2020;
         carro.exibir_dados();
         carro.ligar();

         if(carro.ehNovo()){
             System.out.println("✅ Este carro é novo!\n");
         } else {
             System.out.println("❌ Este carro é antigo!\n");
         }

     }
}
class Carro2{
    String marca;
    int ano;
    String cor;

    void exibir_dados(){
        System.out.println("Carro  - "+marca+ " "+ano+ " "+cor);
    }
    void ligar(){
        System.out.println("Ligando o carro "+marca+" da cor "+cor+" vruuum vruuum!!");
    }
    boolean ehNovo() {
        return ano >= 2020;
    }
}


