public class TreinoBuscaLinear {
    public static void main(String[] args) {

        // EXERCÍCIO 1
        int[] array1 = {5, 2, 8, 12, 3};
        int procurado = 8;

        // Sua implementação aqui
        for(int i = 0 ; i < array1.length;i++){
            System.out.println("percorrendo no array "+i+ " o numero "+procurado);

            if(array1[i] == procurado){
                System.out.println("Encontrou o numero "+array1[i]+" no array "+i);
                break;
            }
        }
    }
}
// array1 é o numero dentro dela ex: {5,2,8,12,3}.
// o i vai numerar o array completo ex; 0,1,2,3,4.
// o array1[i] vai ver se o numero da caixa é igual ao procurado e vai mostrar aonde esse numero foi encontrado no i

