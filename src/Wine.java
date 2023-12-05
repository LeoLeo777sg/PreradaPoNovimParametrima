public class Wine extends Product{
    double bottleVolume;
    final double alcTax=10;
    double priceAfterTax=(super.priceAfterTax)*(basicPrice+alcTax)/100;

    public Wine(String productName, int barCode, double basicPrice, double bottleVolume) {
        super(productName,barCode,basicPrice);
        this.bottleVolume=bottleVolume;
    }
    @Override
    public String getInfo(){
        return super.getInfo()+" bottle volume: "+bottleVolume;}
}