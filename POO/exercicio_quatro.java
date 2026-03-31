package POO;
public class exercicio_quatro {
    public static void main(String[] args) {

        int[] numeros = {88, 12, 45, 23, 67, 34, 90, 15, 56, 78};

        // Números a serem buscados
        int num1 = 12;
        int num2 = 56;
        int num3 = 78;

        // Variáveis para guardar resultados
        int pos1 = -1, comp1 = 0;
        int pos2 = -1, comp2 = 0;
        int pos3 = -1, comp3 = 0;

        System.out.println("Array: " + java.util.Arrays.toString(numeros));
        System.out.println("═══════════════════════════════════════════════════");

        // === BUSCA 1: Procurando 12 ===
        System.out.println("\n🔍 BUSCA 1: Procurando o número " + num1);
        System.out.println("─────────────────────────────────────");

        // SEU CÓDIGO AQUI para buscar num1
        for(int i = 0; i < numeros.length; i++){
            comp1++;
            System.out.println("Comparaçoes:" + comp1 + " posição "+i+ " = " +numeros[i]);

            if(numeros[i] == num1){
                pos1 = i;
                System.out.print("Numero "+num1+ " Encontrado na posição "+pos1+ " após "+comp1+" comparações");
                break;
            }
        }


        // === BUSCA 2: Procurando 56 ===
        System.out.println("\n🔍 BUSCA 2: Procurando o número " + num2);
        System.out.println("─────────────────────────────────────");

        // SEU CÓDIGO AQUI para buscar num2
        for(int j = 0; j < numeros.length; j++){
            comp2++;
            System.out.println("Comparaçoes: " +comp2+ " posição " + j+ " = " +numeros[j]);
            if(numeros[j] == num2){
                pos2 = j;
                System.out.println("Numero "+ num2+ " Encontrado na posição " +pos2+" após "+comp2+ " comparações");
                break;
            }
        }

        // === BUSCA 3: Procurando 78 ===
        System.out.println("\n🔍 BUSCA 3: Procurando o número " + num3);
        System.out.println("─────────────────────────────────────");

        // SEU CÓDIGO AQUI para buscar num3
            for(int k = 0; k < numeros.length; k++){
                comp3++;
                System.out.println("Comparações "+comp3+ " posição "+ k+ " = "+numeros[k]);
                
                if(numeros[k] == num3){
                    pos3 = k;
                    System.out.println("Numero " + num3+ " Encontrado na posição " + pos3 + " após " +comp3+ " comparações");
                }
            }

        // === TABELA COMPARATIVA ===
        System.out.println("\n═══════════════════════════════════════════════════");
        System.out.println("📊 TABELA COMPARATIVA:");
        System.out.println("┌─────────┬──────────┬───────────────┐");
        System.out.println("│ Número  │ Posição  │ Comparações   │");
        System.out.println("├─────────┼──────────┼───────────────┤");
        System.out.println("│   "+num1+ "          "+pos1+ "            "+comp1);
        System.out.println("│   "+num2+ "          "+pos2+ "            "+comp2);
        System.out.println("│   "+num3+ "          "+pos3+ "            "+comp3);
        System.out.println("└─────────┴──────────┴───────────────┘");

        // === ANÁLISE ===
        System.out.println("\n💡 ANÁLISE:");
        System.out.println("A busca mais eficiente foi pelo número " + num1 + " com apenas " + comp1 + " comparações.");
        System.out.println("A busca menos eficiente foi pelo número " + num3 + " com " + comp3 + " comparações.");
        System.out.println("Conclusão: Quanto mais próximo do início do array, mais rápida é a busca linear!");

    }
}