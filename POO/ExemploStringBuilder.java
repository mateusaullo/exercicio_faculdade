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
        stringalteravel.delete(2, 4);
        System.out.println(stringalteravel);
        stringalteravel.insert(3, "ff");
        System.out.println(stringalteravel.toString());

    }
}