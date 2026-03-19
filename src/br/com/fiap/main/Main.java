//Gustavo Neri Andrade - rm572722
//Miguel Vieira Martins - rm571978
//Carlos Americo Machado - rm571250
package br.com.fiap.main;

import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Mensagem caso erro ao informar a variável
        try {

            //Criação e instanciação da classe DespesaFamiliar
            DespesaFamiliar desF = new DespesaFamiliar();

            //Perguntando o valor das variáveis ao usuário, e armazenando elas com a classe Scanner
            Scanner scan;
            scan = new Scanner(System.in);
            System.out.println("Qual o valor da renda familiar: ");
            desF.rendaFamiliar = scan.nextDouble();
            System.out.println("Qual o número de moradores: ");
            desF.numeroDeMoradores = scan.nextInt();
            System.out.println("Qual o valor da conta de luz: ");
            desF.gastoComLuz = scan.nextDouble();
            System.out.println("Qual o valor da conta de água: ");
            desF.gastoComAgua = scan.nextDouble();
            System.out.println("Qual o valor da conta de internet: ");
            desF.gastoComInternet = scan.nextDouble();
            System.out.println("Qual o valor da mensalidade da academia: ");
            desF.valorMensalidadeDaAcademia = scan.nextDouble();

            //Atribuindo variáveis e calculando resultados
            double totalDespesas = desF.calcularTotalDeDespesas();
            double rendaFamiliarLiquida = desF.calcularRendaFamiliarLiquida();
            System.out.printf("Valor da renda familiar: R$%.3f\nValor total das despesas: R$%.3f\nValor da renda familiar líquida: R$%.3f", desF.rendaFamiliar, totalDespesas, rendaFamiliarLiquida);

            //Mensagem mostrada ao usuário caso erre o formato da variável
        } catch (Exception e) {
            System.out.println("Formato de número incorreto");
        }
    }
}
