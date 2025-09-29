public class exercicio_dois {
     public static void main(String[] args) {
         // Array: {1, 3, 5, 7, 9, 11}
         // Procure pelo número 7
         // Conte quantas comparações foram necessárias até encontrar
         // Exemplo: "Número 7 encontrado na posição 3 após 4 comparações"

         int[] numero = {1, 3, 5, 7, 9, 11,7};
         int procurado = 7;
         int comparacao = 0;
         

         for(int i = 0; i < numero.length;i++){
             System.out.println(" Procurando no "+i+" o indice "+numero[i]);
             comparacao++;

             if(numero[i] == procurado){
                 System.out.println("✓ Número " + procurado + " encontrado na posição " + i + " " + "após " + comparacao + " comparações");
             }
         }


     }
}
