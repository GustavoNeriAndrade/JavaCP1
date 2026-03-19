//Gustavo Neri Andrade - rm572722
//Miguel
//Carlos Americo
package br.com.fiap.bean;

public class DespesaFamiliar {
    //Atributos
    public double rendaFamiliar;
    public int numeroDeMoradores;
    public double gastoComLuz;
    public double gastoComAgua;
    public double gastoComInternet;
    public double valorMensalidadeDaAcademia;
    //Métodos da classe
    public double calcularTotalDeDespesas(){
        double totalDespesas;
        totalDespesas = gastoComLuz + gastoComAgua + gastoComInternet + (valorMensalidadeDaAcademia * numeroDeMoradores);
        return totalDespesas;
    }
    public double calcularRendaFamiliarLiquida(){
        double rendaFamiliarLiquida;
        double totalDespesas = calcularTotalDeDespesas();
        rendaFamiliarLiquida = rendaFamiliar - totalDespesas;
        return rendaFamiliarLiquida;
    }
}
