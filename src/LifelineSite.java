public class LifelineSite extends Site {

    public double getBillableAmount(){
        double base = _units * _rate *0.5;
        double tax = base* Site.Tax_rate *0.2;
        return base+ tax;
    }
}
