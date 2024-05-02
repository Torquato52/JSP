package Imposto;

public class PortoAlegre implements ImposInter{
    @Override
    public double calcularImposto(double areaTotal, int idade, int numeroComodos, int numeroQuartos, double areaGaragem) {
        if (areaGaragem > 0) {
            return areaTotal * 7.5 + areaGaragem * 2.5;
        } else {
            return areaTotal * 8;
        }
    }
}
