package TablaAmortizacion;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculateAmortization implements ICalculateAmortization {

    private float initial_debt;

    public String calculate(Amortizacion amortizacion){

        this.initial_debt = amortizacion.getInicial_debt();

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= amortizacion.getPeriod(); i++){


            sb.append("Perido : "+i);

            sb.append(" |Deuda Inicial : "+amortizacion.getInicial_debt());


            sb.append(" |Tasa Interes : "+amortizacion.getInterest_rate()+"%");

            amortizacion.setInterests(this.calculateInterest(amortizacion));
            sb.append(" |Intereses : "+amortizacion.getInterests());

            amortizacion.setAmortization(this.calculateAmortization(amortizacion));
            sb.append(" |Amortizacion : "+amortizacion.getAmortization());

            amortizacion.setPay(this.calculatePay(amortizacion));
            sb.append(" |Pago : "+amortizacion.getPay());

            if (i == amortizacion.getPeriod()){
                sb.append(" |Deuda Final : "+this.caculateFinalDebt(amortizacion));
            }else {
                amortizacion.setInicial_debt(this.caculateFinalDebt(amortizacion));
                sb.append(" |Deuda Final : "+amortizacion.getInicial_debt()+"\n");
            }

        }

        return sb.toString();
    }

    @Override
    public float calculateInterest(Amortizacion amortizacion){

        BigDecimal interes_rate = BigDecimal.valueOf(amortizacion.getInterest_rate()).divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP);

        return  this.formatFloat((float) (amortizacion.getInicial_debt() * interes_rate.doubleValue() / amortizacion.getPeriod())) ;
    }

    @Override
    public float calculateAmortization(Amortizacion amortizacion) {
        return this.formatFloat(this.initial_debt  / amortizacion.getPeriod()) ;
    }

    @Override
    public float calculatePay(Amortizacion amortizacion){

        return this.formatFloat(amortizacion.getInterests() + amortizacion.getAmortization());
    }

    @Override
    public float caculateFinalDebt(Amortizacion amortizacion){
        return this.formatFloat(amortizacion.getInicial_debt() + amortizacion.getInterests() - amortizacion.getPay());
    }

    @Override
    public float formatFloat(float number){
        BigDecimal bd = new BigDecimal(number).setScale(2, RoundingMode.HALF_UP);
        return bd.floatValue();
    }

}
