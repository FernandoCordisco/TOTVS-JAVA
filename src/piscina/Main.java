package piscina;

public class Main {
    public static void main(String[] args) {
        Piscina piscina = new Piscina();

        piscina.receberMedidas();
        piscina.calcularMedidas();

        System.out.printf("O volume da piscina é de %.1fm³ \n", piscina.getMetroCubico());
        System.out.printf("Equivalente a %.1f litros de água", piscina.getLitros());
    }
}