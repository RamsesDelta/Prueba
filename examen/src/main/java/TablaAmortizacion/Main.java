package TablaAmortizacion;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String args[]){

        Amortizacion amortizacion = new Amortizacion(12,60000,20);

        CalculateAmortization calculateAmortization = new CalculateAmortization();

        System.out.println(calculateAmortization.calculate(amortizacion));

    }
}
