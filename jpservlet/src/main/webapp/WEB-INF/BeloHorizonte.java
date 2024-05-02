package Imposto;

public class BeloHorizonte implements ImposInter {
    @Override
    public double calcularImposto(double areaTotal, int idade, int numeroComodos, int numeroQuartos, double areaGaragem) {
        return areaTotal * 7 + numeroQuartos * 4;
    }
}