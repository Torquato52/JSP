package Imposto;

public class CalculadorImposto {
    private ImposInter impostoStrategy;

    public CalculadorImposto(ImposInter impostoStrategy) {
        this.impostoStrategy = impostoStrategy;
    }

    public double calcularImposto(double areaTotal, int idade, int numeroComodos, int numeroQuartos, double areaGaragem) {
        return impostoStrategy.calcularImposto(areaTotal, idade, numeroComodos, numeroQuartos, areaGaragem);
    }
}
