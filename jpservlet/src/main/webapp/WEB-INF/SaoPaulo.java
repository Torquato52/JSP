package Imposto;

public class SaoPaulo implements ImposInter{
    @Override
    public double calcularImposto(double areaTotal, int idade, int numeroComodos, int numeroQuartos, double areaGaragem) {
        return areaTotal * 10 + numeroComodos * 2;
    }
}
