package TablaAmortizacion;

public interface ICalculateAmortization {

    float calculateInterest(Amortizacion amortizacion);

    float calculateAmortization(Amortizacion amortizacion);

    float calculatePay(Amortizacion amortizacion);

    float caculateFinalDebt(Amortizacion amortizacion);

    float formatFloat(float number);

}
