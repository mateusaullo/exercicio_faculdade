package POO;

public class exercicio_referencia {
     public static void main(String[] args) {

         Amigos amigos = new Amigos("Mateus");
         Amigos amigos2 = new Amigos("Maria");

         amigos.melhoramigo = amigos2;
         
         System.out.print("O melhor amigo de "+ amigos.nome+ " é "+amigos.melhoramigo.nome);
         }
}

class Amigos{
    String nome;
    Amigos melhoramigo;

    Amigos(String nome){
        this.nome = nome;
        this.melhoramigo = null;

    }
}
