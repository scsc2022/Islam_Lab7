public class LifelineSite extends Site {

    protected double base;
    private int _units;
    private static int _rate;
    private Site site;

    /**
     * Public contructor
     */
    public LifelineSite(){
        this._units = _units;
        this._rate = _rate;
    }

    public double getBillableAmount(){
        double base = _units * _rate *0.5;
        double tax = base* Site.Tax_rate *0.2;
        return base+ tax;
    }
}
