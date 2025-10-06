package POO;

public class exercicio_referencia2 {
     public static void main(String[] args) {
             Pessoa pessoa = new Pessoa("Mateus");
             Telefone telefone = new Telefone();
             telefone.modelo = "Iphone";
             telefone.marca = "Apple";

             pessoa.telefone = telefone;

             System.out.println("O " +pessoa.nome+ " não tem  telefone e nem numero");

             System.out.print("O "+pessoa.nome+" comprou o telefone " + " "+ pessoa.telefone.modelo+" da marca "+pessoa.telefone.marca);

         }
}

class Pessoa{
    String nome;
    Telefone telefone;

    Pessoa(String nome){
        this.nome = nome;
        this.telefone = null;
    }
}

class Telefone{
    String modelo;
    String marca;


    Telefone(){
        this.modelo = null;
        this.marca = null;

    }
}
