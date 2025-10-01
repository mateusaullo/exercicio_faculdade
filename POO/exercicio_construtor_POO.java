package POO;

public class exercicio_construtor_POO {
     public static void main(String[] args) {
         Carro3 carro = new Carro3("Fiat","vermelho",2020);
         carro.ligar();
         if(carro.verificarAno()){
             System.out.println("Carro novo");
         }else{
             System.out.println("Carro antigo");
         }

         Carro3 carro2= new Carro3("Toyota","verde",2019);
         carro2.ligar();
         if(carro2.verificarAno()){
             System.out.println("Carro novo");
         }else{
             System.out.println("Carro antigo");
         }
         Carro3 carro3 = new Carro3("Lamborghini","preto",2025);
         carro3.ligar();
         if(carro3.verificarAno()){
             System.out.println("Carro novo");
         }else{
             System.out.println("Carro antigo");
         }

         }
}
class Carro3{

    String marca ;
    String cor;
    int ano;

    public Carro3(String marca,String cor,int ano){
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
    }

    void ligar(){
        System.out.println("Ligando o carro "+marca+" do ano de "+ano+ " vrum vruuuum!");
    }
    boolean verificarAno(){
        return ano >=2020;
    }
}
