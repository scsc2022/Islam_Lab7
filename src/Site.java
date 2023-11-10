public abstract class Site {
    protected static double Tax_rate = 0.12;
    abstract double getBaseAmount();

    abstract double getTaxAmount();

    public double getBillableAmount(){
        double base = getBaseAmount();
        double tax = getTaxAmount();
        return base+tax;
    }

}
