package piscina;

import utils.Leitor;

public class Piscina {

    Leitor leitor = new Leitor();
//    Atributos
    private double largura;
    private double comprimento;
    private double profundidadeX;
    private double profundidadeY;
    private double metroCubico;
    private double litros;


//    Get e Set

    public double getMetroCubico() {
        return metroCubico;
    }

    public double getLitros() {
        return litros;
    }


//    Metodos

    public void receberMedidas(){
        comprimento = leitor.lerDecimal("Digite o comprimento:");
        largura = leitor.lerDecimal("Digite a largura:");
        profundidadeX = leitor.lerDecimal("Digite a profundidadeX:");
        profundidadeY = leitor.lerDecimal("Digite a profundidadeY:");

    }
    public void calcularMedidas(){
        metroCubico = comprimento * largura * ((profundidadeX + profundidadeY) / 2);
        litros = metroCubico * 1000;
    }

}
