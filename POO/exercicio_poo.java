package POO;

public class exercicio_poo {
     public static void main(String[] args) {

         // Crie uma classe Carro com:
         // - marca (String)
         // - ano (int)
         // - cor (String)
         // Depois crie 3 carros diferentes e imprima os dados
         Carro carro = new Carro();
         carro.marca = "Toyota";
         carro.cor = "vermelho";
         carro.ano = 2010;

         Carro carro2 = new Carro();
         carro2.marca = "Honda";
         carro2.cor = "verde";
         carro2.ano = 2015;

         Carro carro3 = new Carro();
         carro3.marca = "Fiat";
         carro3.cor = "roxo";
         carro3.ano = 2017;

         System.out.println("Carro 1 - "+carro.marca+ " "+carro.cor+ " "+carro.ano);
         System.out.println("Carro 2 - "+carro2.marca+ " "+carro2.cor+ " "+carro2.ano);
         System.out.println("Carro 3 - "+carro3.marca+ " "+carro3.cor+ " "+carro3.ano);
         



         }
}
 class Carro{
    String marca;
    int ano;
    String cor;

}
