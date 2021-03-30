package TablaAmortizacion;

public class Amortizacion {

    private int period;
    private float inicial_debt;
    private int interest_rate;
    private float interests;
    private float amortization;
    private float pay;
    private float final_debt;

    public Amortizacion(int period,float inicial_debt,int interest_rate){
        this.period = period;
        this.inicial_debt = inicial_debt;
        this.interest_rate = interest_rate;
    }


    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public float getInicial_debt() {
        return inicial_debt;
    }

    public void setInicial_debt(float inicial_debt) {
        this.inicial_debt = inicial_debt;
    }

    public int getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(int interest_rate) {
        this.interest_rate = interest_rate;
    }

    public float getInterests() {
        return interests;
    }

    public void setInterests(float interests) {
        this.interests = interests;
    }

    public float getAmortization() {
        return amortization;
    }

    public void setAmortization(float amortization) {
        this.amortization = amortization;
    }

    public float getPay() {
        return pay;
    }

    public void setPay(float pay) {
        this.pay = pay;
    }

    public float getFinal_debt() {
        return final_debt;
    }

    public void setFinal_debt(float final_debt) {
        this.final_debt = final_debt;
    }
}
