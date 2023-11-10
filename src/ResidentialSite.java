public class ResidentialSite extends Site {
    /**
    private double units;
    private double rate;
    private double Tax_rate;

    public ResidentialSite(){
        this.units = units;
        this.rate = rate;
        this.Tax_rate = Site.Tax_rate;
    }

    public double getBillableAmount(double units, double rate){
        double base = units * rate;
        double tax = base* Site.Tax_rate;
        return base+ tax;
    }
     */
    private double units;
    private double rate;

    @Override
    public double getBaseAmount(){
        return units*rate*0.5;
    }

    @Override
    public double getTaxAmount(){
        return getBaseAmount() * Site.Tax_rate *0.2;
    }
}
