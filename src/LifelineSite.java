public class LifelineSite extends Site {
/**
    protected double base;
    private int units;
    private static int rate;
    private Site site;

    public LifelineSite(){
        this.units = units;
        this.rate = rate;
    }

    public double getBillableAmount(double units, double rate){
        double base = units * LifelineSite.rate *0.5;
        double tax = base* site.Tax_rate *0.2;
        return base + tax;
    }
    */

    private double units;
    private double rate;

    @Override
    public double getBaseAmount(){
        return units*rate;
    }

    @Override
    public double getTaxAmount(){
        return getBaseAmount() * Site.Tax_rate;
    }
}
