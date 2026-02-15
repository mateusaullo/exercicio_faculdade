package POO;

public class ExemploStringBuilder {
     public static void main(String[] args) {
         String nome = "Mateus";
         nome.toLowerCase();


         String nomevalor = nome.toUpperCase();
         System.out.println(nomevalor);
            
         String nome1 = "Gabriel";
         nome1.toLowerCase();

         String nomevalor1 = nome1.toUpperCase();
         System.out.println(nomevalor1);

         StringBuilder stringalteravel = new StringBuilder("Bruno");
        
     }
}
