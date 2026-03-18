package POO.exercicio;

public class exerfcicio {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo( "Ferrari", 320);
        Carro carro = new Carro("Lamborghini", 340, 2);
        Moto moto = new Moto("BMW", 330, true);

        veiculo.exibirInfo();
        carro.exibirInfo();
        moto.exibirInfo();
    }
    
}

class Veiculo {
    String Marca;
    int velocidadeMaxima;

    Veiculo(String Marca, int velocidadeMaxima) {
        this.Marca = Marca;
        this.velocidadeMaxima = velocidadeMaxima;
        
    }

    public void exibirInfo() {
        System.out.println(Marca+" "+velocidadeMaxima+" ");
    }
 }

 class Carro extends Veiculo {
     int numero_de_portas;
    
     Carro(String Marca,int velocidadeMaxima,int numero_de_portas) {
         super(Marca, velocidadeMaxima);
         this.numero_de_portas = numero_de_portas;
     }
    
     public void exibirInfo() {
         System.out.println(Marca + " " + velocidadeMaxima + " "+numero_de_portas+" ");
     }
}

class Moto extends Veiculo {
    boolean temrodas;

    Moto(String Marca, int velocidadeMaxima, boolean temrodas) {
        super(Marca, velocidadeMaxima);
        this.temrodas = temrodas;
    }
    
    public void exibirInfo() {
        System.out.println(Marca + " " + velocidadeMaxima + " " + temrodas + " ");
    }
}