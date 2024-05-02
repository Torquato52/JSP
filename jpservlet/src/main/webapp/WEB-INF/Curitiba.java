package Imposto;

public class Curitiba implements ImposInter{
    @Override
    public double calcularImposto(double areaTotal, int idade, int numeroComodos, int numeroQuartos, double areaGaragem) {
        double imposto = areaTotal * 5;
        
        if (idade > 50) {
            imposto += idade * 3;
        } else if (idade < 20) {
            imposto += idade * 2;
        } else {
            imposto += idade * 2.5;
        }
        
        return imposto;
    }
}
