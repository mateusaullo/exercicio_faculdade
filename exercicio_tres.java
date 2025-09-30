public class exercicio_tres {
     public static void main(String[] args) {
         // Array: {50, 23, 18, 7, 99}
         // Procure pelo número 50
         // Conte quantas comparações foram necessárias
         // Esperado: "Número 50 encontrado na posição 0 após 1 comparação"

         int[] numeros = {50,23,18,7,99};
         int contagem = 0;
         int procure = 50;

         for(int i = 0; i < numeros.length; i++){
             System.out.println("Procurando no indice "+i+": numero "+numeros[i]);
             contagem++;

             if(procure == numeros[i]) {
                 System.out.println("Número " +procure+ " encontrado na posição "+i+" após "+contagem+" comparação");
                 break;
             }
         }
         //           ->[i] vai acessar o valor do indice e pegar o numero que esta dentro dele,ex:indice 0 tem o valor 50
         //  o numero[i]

     }
}
