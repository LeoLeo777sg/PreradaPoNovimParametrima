
public class Main {
    public static void main(String[] args) {
        Product product=new Product("Misc Product",239877,100.0);
        System.out.println(product.getInfo());
        Chocolate chocolate=new Chocolate("Zorka",324590,200.0,160.0);
        System.out.println(chocolate.getInfo());
        System.out.println("");
        Wine wine=new Wine("Harlan",999357,100,0.75);
        System.out.println(wine.getInfo());
        System.out.println("");
/**ne razumijem sta ste zeljeli reci sa: Metoda getInfo() u klasi Product može da prikazuje i konačnu cenu o proizvodu oba tipa
 * ali predpostavljam da je ovo pa sam zakomentirao a pojedinacno sam ih isprintavao zbog preglednosti:
 * String wineInfo = wine.getInfo();
 * String chocolateInfo = chocolate.getInfo();
 *System.out.println(wineInfo + " - " + chocolateInfo);
 */




    }
}
