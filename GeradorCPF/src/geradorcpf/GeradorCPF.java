
package geradorcpf;
/**
 * @author Vinícius Desenv
 * Gerador de CPF validos
 * Versão 1.2
 */

import java.util.Random;

public class GeradorCPF {
    
    public static void main(String[] args) {
   
        Random random = new Random();                                     
        int[] cpf = new int[11]; // array para armazenar os dígitos do CPF
                
        for (int i = 0; i < 9; i++) {
            int numeroAleatorio = random.nextInt(10); // Gera um número inteiro aleatório entre 0 e 9 
            cpf[i] = numeroAleatorio;
        }
        
            int soma = 0;        
            for(int a = 0; a < 9; a++){
            soma += cpf[a] * (10 - a); // soma recebe a multiplicação e depois soma dos números aleatorios com os definidos na regra             
            }
         
        int numeroVerificado1 = soma % 11; // Décimo numero do CPF
        cpf [9] = numeroVerificado1 < 2 ? 0 : (11 - numeroVerificado1); // Verificar se número é menor que 2
         
            int calc = 0;        
            for(int a = 0; a < 10; a++){
                calc += cpf[a] * (10 - a); // soma recebe a multiplicação e depois soma dos números aleatorios com os definidos na regra   
            }
        
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