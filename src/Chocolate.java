public class Chocolate extends Product {
    double nettoChocoWeight;

    public Chocolate(String productName, int barCode, double basicPrice, double nettoChocoWeight) {
        super(productName, barCode, basicPrice);
        this.nettoChocoWeight = nettoChocoWeight;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+" netto weight is: "+nettoChocoWeight;
    }
}
