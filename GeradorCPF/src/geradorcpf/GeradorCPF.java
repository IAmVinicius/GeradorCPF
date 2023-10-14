
package geradorcpf;

import java.util.Random;

public class GeradorCPF {
    
    public static void main(String[] args) {
   
        Random random = new Random();                                     
        int[] cpf = new int[11]; // array para armazenar os dígitos do CPF
        
        for (int i = 0; i < 9; i++) {
            int numeroAleatorio = random.nextInt(10); // Gera um número inteiro aleatório entre 0 e 9 
            cpf[i] = numeroAleatorio;
        }
    
        int primeiro = 10 * cpf[0];
        int segundo = 9 * cpf [1];
        int terceiro = 8 * cpf[2];
        int quarto = 7 * cpf[3];
        int quinto = 6 * cpf[4];
        int sexto = 5 * cpf[5];
        int setimo = 4 * cpf[6];
        int oitavo = 3 * cpf[7];
        int nono = 2 * cpf[8];
        
        int soma = primeiro + segundo + terceiro + quarto + quinto + sexto + setimo + oitavo + nono;
        int numeroVerificado1 = soma % 11; // Décimo numero do CPF
        
        cpf [9] = numeroVerificado1 < 2 ? 0 : (11 - numeroVerificado1); // Verificar se número é menor que 2
                 
        int primeiro2 = 11 * cpf[0];
        int segundo2 = 10 * cpf [1];
        int terceiro2 = 9 * cpf[2];
        int quarto2 = 8 * cpf[3];
        int quinto2 = 7 * cpf[4];
        int sexto2 = 6 * cpf[5];
        int setimo2 = 5 * cpf[6];
        int oitavo2 = 4 * cpf[7];
        int nono2 = 3 * cpf[8];
        int decimo = 2 * cpf[9];
                
        int calc = primeiro2 + segundo2 + terceiro2 + quarto2 + quinto2 + sexto2 + setimo2 + oitavo2 + nono2 + decimo;
        int numeroVerificado2 = calc % 11; // Décimo primeironumero do CPF
        
        cpf [10] = numeroVerificado2 < 2 ? 0 : (11 - numeroVerificado2); // Verificar se número é menor que 2
        
        imprimirCPF(cpf); // Metodo imprime CPF
                      
    }
    // Metodo imprime CPF
    private static void imprimirCPF(int[] cpf) { 
        System.out.printf("CPF gerado: %03d.%03d.%03d-%02d \n",
                cpf[0] * 100 + cpf[1] * 10 + cpf[2],
                cpf[3] * 100 + cpf[4] * 10 + cpf[5],
                cpf[6] * 100 + cpf[7] * 10 + cpf[8],
                cpf[9] * 10 + cpf[10]);
    }
   
}

