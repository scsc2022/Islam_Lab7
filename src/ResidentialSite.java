public class ResidentialSite extends Site {
    public double getBillableAmount(){
        double base = _units * _rate;
        double tax = base* Site.Tax_rate;
        return base+ tax;
    }
}
